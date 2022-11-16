package algodat;

import java.util.*;

/**
 * The Knapsack problem.
 *
 * @author himmelspach
 */
public class Knapsack implements IKnapsack {

    private final int capacity;
    private final List<Element> elements;


    public Knapsack(int capacity, List<Element> elements) {
        this.capacity = capacity;
        this.elements = new ArrayList<>(elements);
    }

    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        elements.add(new Element(2, 20));
        elements.add(new Element(5, 30));
        elements.add(new Element(10, 50));
        elements.add(new Element(5, 10));
        IKnapsack knapsack = new Knapsack(16, elements);
        Map<int[], Element> elementMap = knapsack.solve();
        for (Map.Entry<int[], Element> element : elementMap.entrySet()) {
            System.out.println(Arrays.toString(element.getKey()) + "\t\t" + element.getValue().getWeight() + "\t\t" + element.getValue().getValue());
        }

        System.out.println("Beste Lösung: " + knapsack.findBest(elementMap));
    }

    @Override
    public Map<int[], Element> solve() {
        Map<Integer, Element> base = new HashMap<>();
        for (int i = 0; i < elements.size(); i++) {
            base.put(i, elements.get(i));
        }
        return combinations(new HashMap<>(), base);
    }

    public Solution findBest(Map<int[], Element> map) {
        Solution result = null;
        for (Map.Entry<int[], Element> entry : map.entrySet()) {
            if (entry.getValue().getWeight() > capacity) continue;
            if ((result == null) || (result.getValue() < entry.getValue().getValue())) {
                result = new Solution(entry.getKey(), entry.getValue().getWeight(), entry.getValue().getValue());
            }
        }
        return result;
    }

    public Solution findBest() {
        return findBest(solve());
    }

    private Element sumOf(Map<Integer, Element> elements) {
        int value = 0;
        int weight = 0;
        for (Element element : elements.values()) {
            value += element.getValue();
            weight += element.getWeight();
        }
        return new Element(weight, value);
    }

    public Map<int[], Element> combinations(Map<Integer, Element> head, Map<Integer, Element> tail) {
        Map<int[], Element> result = new HashMap<>();

        if (tail.isEmpty()) return result;

        Map<Integer, Element> tailCopy = new HashMap<>(tail);

        for (Map.Entry<Integer, Element> element : tail.entrySet()) {

            Map<Integer, Element> newHead = new HashMap<>(head);
            newHead.put(element.getKey(), element.getValue());
            tailCopy.remove(element.getKey());
            Map<Integer, Element> newTail = new HashMap<>(tailCopy);

            int[] key = new int[newHead.size()];
            int c = 0;
            for (int i : newHead.keySet()) {
                key[c++] = i;
            }
            ;

            result.put(key, sumOf(newHead));

            result.putAll(combinations(newHead, newTail));

        }
        return result;
    }

}