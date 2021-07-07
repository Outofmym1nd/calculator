public class Check {

    public boolean checkTwoParameters(String[] elements) {
        return elements != null && elements.length == 2;
    }

    private static boolean checkRomeSymbol (String rim) {
        String romeSymbol = "IVXLC";

        boolean result = false;
        char[] rims = rim.toCharArray();
        for (char symbol : rims) {
            if (!romeSymbol.contains(String.valueOf(symbol))) {
                result = false;
                break;
            }
            result = true;
        }
        return result;
    }
}
