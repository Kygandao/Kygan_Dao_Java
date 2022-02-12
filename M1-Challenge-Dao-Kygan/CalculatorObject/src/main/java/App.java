public class App {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        //sum of 1 + 1
        int intSum = calc.add(1,1);
        System.out.println(intSum);

        //difference of 23 - 52
        int intDiff = calc.subtract(23,52);
        System.out.println(intDiff);

        //product of 34 * 2
        int intProduct = calc.multiply(34,2);
        System.out.println(intProduct);

        //divide 12 / 3
        int intDiv = calc.divide(1,1);
        System.out.println(intDiv);

        //sum of doubles 3.4 + 2.3
        double intDoubleSum = calc.add(3.4,2.3);
        System.out.println(intDoubleSum);

        //difference of doubles 5.5 - 0.5
        double intDoubleDiff = calc.subtract(5.5,0.5);
        System.out.println(intDoubleDiff);

        //product of doubles 6.7 * 4.4
        double intDoubleProduct = calc.multiply(6.7,4.4);
        System.out.println(intDoubleProduct);

        //divide doubles 10.8 / 2.2
        double intDoubleDiv = calc.divide(10.8,2.2);
        System.out.println(intDoubleDiv);
    }
}
