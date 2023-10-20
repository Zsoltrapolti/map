public class Testrunner {
    public static void main(String[] args) {
        Ubung2_Test ubung2Test = new Ubung2_Test();
        ubung2Test.max();
        ubung2Test.min();
        ubung2Test.max_Sum();
        ubung2Test.min_Sum();
        Ubung3_Test ubung3Test = new Ubung3_Test();
        ubung3Test.add();
        ubung3Test.subtract();
        ubung3Test.multiply();
        ubung3Test.divide();
        Ubung4_test ubung4Test = new Ubung4_test();
        Ubung4_test.findCheapestKeyboard();
        Ubung4_test.findMostExpensiveItem();
        Ubung4_test.findMaxUsbWithinBudget();
        Ubung4_test.findMaxPriceWithinBuget();
        System.out.println("pass all tests");
    }

}
