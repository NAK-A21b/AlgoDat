package algodat;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class AbstractKnapsackTestImpl extends AbstractKnapsackTest {

    private List<IKnapsack.Element> createProblem() {
        List<IKnapsack.Element> elements = new ArrayList<>();
        elements.add(new IKnapsack.Element(2, 20));
        elements.add(new IKnapsack.Element(5, 30));
        elements.add(new IKnapsack.Element(10, 50));
        elements.add(new IKnapsack.Element(5, 10));
        return elements;
    }

    @Test
    public void testExhaustiveSearch() {
        List<IKnapsack.Element> elements = createProblem();
        IKnapsack knapsack = create(16, elements);
        Map<int[], IKnapsack.Element> elementMap = knapsack.solve();
        assertEquals(15, elementMap.size());
    }

    @Test
    public void testFindBest() {
        List<IKnapsack.Element> elements = createProblem();
        IKnapsack knapsack = create(16, elements);
        Map<int[], IKnapsack.Element> elementMap = knapsack.solve();
        assertEquals(80, knapsack.findBest(elementMap).getValue());
    }
}
