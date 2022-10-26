import algodat.AbstractClosestPointTest;
import algodat.IClosestPoints;

class BruteForceClosestPointsTest extends AbstractClosestPointTest {

    @Override
    protected IClosestPoints create() {
        return new BruteForceClosestPoints();
    }
}