public class Ubung4_test {
    public static void findCheapestKeyboard() throws IllegalAccessException {
        int[] keyboardPrices = new int[]{40, 50, 60};
        assert Ubung4.findCheapestKeyboard(keyboardPrices) == 40;
        int[] keyboardPrices_1 = new int[]{};
        try {
            Ubung4.findCheapestKeyboard(keyboardPrices_1);
            assert false;
        } catch (IllegalAccessException e) {
            assert true;
        }


    }
    public static void findMostExpensiveItem() throws IllegalAccessException {
        int[] keyboardPrices = new int[]{40, 50, 60};
        int[] usbPrices = new int[]{8, 12};
        assert Ubung4.findMostExpensiveItem(keyboardPrices, usbPrices) == 60;
        int[] keyboardPrices_1 = new int[]{};
        int[] usbPrices_1 = new int[]{};
        try {
            Ubung4.findMostExpensiveItem(keyboardPrices_1, usbPrices_1);
            assert false;
        } catch (IllegalAccessException e) {
            assert true;
        }


    }


    public static void findMaxUsbWithinBudget() throws IllegalAccessException {
        int[] usbPrices = new int[]{8, 12};
        assert Ubung4.findMaxUsbWithinBudget(usbPrices, 60) == 12;
        int[] usbPrices_1 = new int[]{};
        try {
            Ubung4.findMaxUsbWithinBudget(usbPrices_1, 60);
            assert false;
        } catch (IllegalAccessException e) {
           assert true;
            }

    }
    public static void findMaxPriceWithinBuget() throws IllegalAccessException {
        int[] keyboardPrices = new int[]{40, 50, 60};
        int[] usbPrices = new int[]{8, 12};
        assert Ubung4.findMaxPriceWithinBudget(keyboardPrices, usbPrices, 60) == 58;
        int[] keyboardPrices_1 = new int[]{};
        int[] usbPrices_1 = new int[]{};
        try {
            Ubung4.findMaxPriceWithinBudget(keyboardPrices_1, usbPrices_1, 60);
            assert false;
        } catch (IllegalAccessException e) {
            assert true;
        }


    }

}