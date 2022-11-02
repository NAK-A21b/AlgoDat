package algodat;

import java.util.List;

class KnapsackTest extends AbstractKnapsackTestImpl {

    @Override
    protected IKnapsack create(int i, List<IKnapsack.Element> list) {
        return new Knapsack(i, list);
    }
}