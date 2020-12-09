import org.junit.Assert;
import org.junit.Test;
import services.GraphCalculator;

public class GraphCalculatorTests {

    @Test
    public void countSeparatedGraphsTests_correctInput_correctGraphNumber() {

        GraphCalculator graphCalculator = new GraphCalculator();

        int[] input1 = {3, 1, 2, 2, 3, 5, 6};
        int[] input2 = {4, 1, 2, 2, 3, 5, 6, 1, 5};

        Assert.assertEquals(2, graphCalculator.countSeparatedGraphs(input1));
        Assert.assertEquals(1, graphCalculator.countSeparatedGraphs(input2));

    }
}
