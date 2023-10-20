import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Ubung2 ubung2 = new Ubung2();
        int [] array = new int[]{2, 3, 6, 1, 2};

        System.out.println(ubung2.max(array, 5));
        System.out.println(ubung2.min(array, 5));
        System.out.println(ubung2.max_Sum(array, 5));
        System.out.println(ubung2.min_Sum(array, 5));

        Ubung3 ubung3 = new Ubung3();
        int [] num1 = new int[]{1, 3, 0, 0, 0, 0, 0, 0, 0};
        int [] num2 = new int[]{8, 7, 0, 0, 0, 0, 0, 0, 0};

        System.out.println(Arrays.toString(ubung3.add(num1, num2)));
        System.out.println(Arrays.toString(ubung3.subtract(num1, num2)));
        System.out.println(Arrays.toString(ubung3.multiply(num1, 2)));
        System.out.println(Arrays.toString(ubung3.divide(num1, 2)));

        Ubung4 ubung4 = new Ubung4();
        int[] keyboardPrices = {40, 50, 60};
        int[] usbPrices = {8, 12};
        int budget = 60;
        System.out.println(ubung4.findCheapestKeyboard(keyboardPrices));
        System.out.println(ubung4.findMostExpensiveItem(keyboardPrices, usbPrices));
        System.out.println(ubung4.findMaxUsbWithinBudget(usbPrices, budget));
        System.out.println(ubung4.findMaxPriceWithinBudget(keyboardPrices, usbPrices, budget));



    }
}