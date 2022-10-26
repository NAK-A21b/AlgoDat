import algodat.AbstractSearchStringTest;
import algodat.ISearchString;

class BruteForceStringMatchTest extends AbstractSearchStringTest {

    @Override
    protected ISearchString create() {
        return new BruteForceStringMatch();
    }
}