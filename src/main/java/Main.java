import services.GraphCalculator;

import java.util.Arrays;

import static services.Converter.StringArrToIntArr;

public class Main {

    public static void main(String[] args) {
        GraphCalculator graphCalculator = new GraphCalculator();

        Arrays.stream(args).forEach(System.out::println);

        int[] input = StringArrToIntArr(args);
        graphCalculator.countSeparatedGraphs(input);

    }


}
