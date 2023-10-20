public class Ubung4_test {
    public static void findCheapestKeyboard() {
        int[] keyboardPrices = new int[]{40, 50, 60};
        assert Ubung4.findCheapestKeyboard(keyboardPrices) == 40;
    }
    public static void findMostExpensiveItem() {
        int[] keyboardPrices = new int[]{40, 50, 60};
        int[] usbPrices = new int[]{8, 12};
        assert Ubung4.findMostExpensiveItem(keyboardPrices, usbPrices) == 60;
    }
    public static void findMaxUsbWithinBudget() {
        int[] usbPrices = new int[]{8, 12};
        assert Ubung4.findMaxUsbWithinBudget(usbPrices, 60) == 12;
    }
    public static void findMaxPriceWithinBuget() {
        int[] keyboardPrices = new int[]{40, 50, 60};
        int[] usbPrices = new int[]{8, 12};
        assert Ubung4.findMaxPriceWithinBudget(keyboardPrices, usbPrices, 60) == 58;
    }

}