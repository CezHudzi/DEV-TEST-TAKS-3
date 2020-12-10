import org.junit.Assert;
import org.junit.Test;
import services.GraphCalculator;

public class GraphCalculatorTests {

    @Test
    public void countSeparatedGraphsTests_correctInput_correctGraphNumber() {

        GraphCalculator graphCalculator = new GraphCalculator();

        int[] input1 = {3, 1, 2, 2, 3, 5, 6};
        int[] input2 = {4, 1, 2, 2, 3, 5, 6, 1, 5};
        int[] input3 = {0};
        int[] input4 = {3, 1, 2, 1, 2, 1, 2, 1, 2};
        int[] input5 = {7, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 11, 12, 13, 14};

        Assert.assertEquals(2, graphCalculator.countSeparatedGraphs(input1));
        Assert.assertEquals(1, graphCalculator.countSeparatedGraphs(input2));
        Assert.assertEquals(0, graphCalculator.countSeparatedGraphs(input3));
        Assert.assertEquals(1, graphCalculator.countSeparatedGraphs(input4));
        Assert.assertEquals(7, graphCalculator.countSeparatedGraphs(input5));

    }
}
