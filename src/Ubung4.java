public class Ubung4 {
    public static int findCheapestKeyboard(int[] keyboardPrices) throws IllegalAccessException {

        if(keyboardPrices.length == 0){
            throw new IllegalAccessException("empty array");        }
        int cheapestKeyboard = keyboardPrices[0];

        for (int i = 1; i < keyboardPrices.length; i++) {
            if (keyboardPrices[i] < cheapestKeyboard) {
                cheapestKeyboard = keyboardPrices[i];
            }
        }

        return cheapestKeyboard;
    }
    public static int findMostExpensiveItem(int[] keyboardPrices, int[] usbPrices) throws IllegalAccessException {
        if(keyboardPrices.length == 0) {
            throw new IllegalAccessException("empty array");
        }
        if(usbPrices.length == 0) {
            throw new IllegalAccessException("empty array");
        }
        int maxPrice = 0;


        for (int price : keyboardPrices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }



        for (int price : usbPrices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }


        return maxPrice;
    }
    public static int findMaxUsbWithinBudget(int[] usbPrices, int budget) throws IllegalAccessException {
        if(usbPrices.length == 0) {
            throw new IllegalAccessException("empty array");
        }
        int maxUsbPrice = 0;

        for (int price : usbPrices) {
            if (price <= budget && price > maxUsbPrice) {
                maxUsbPrice = price;
            }
        }

        return maxUsbPrice;
    }
    public static int findMaxPriceWithinBudget(int[] keyboardPrices, int[] usbPrices, int budget) throws IllegalAccessException {
        if(keyboardPrices.length == 0) {
            throw new IllegalAccessException("empty array");

        }
        if(usbPrices.length == 0) {
            throw new IllegalAccessException("empty array");
        }
        int maxPrice = 0;

        for (int keyboardPrice : keyboardPrices) {
            for (int usbPrice : usbPrices) {
                int totalPrice = keyboardPrice + usbPrice;
                if (totalPrice <= budget && totalPrice > maxPrice) {
                    maxPrice = totalPrice;
                }
            }
        }
        if (maxPrice == 0) {
            return -1;
        }
        return maxPrice;
    }

}