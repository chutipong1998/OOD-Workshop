public class MyRange {
    public static final int ASCII_VALUE_OF_1 = 48;
    public static final int ASCII_VALUE_OF_2 = 47;
    public static final int ASCII_VALUE_OF_5 = 48;
    public static final int ASCII_VALUE_OF_4 = 49;
    private final String input;

    public MyRange(String input) {
        this.input = input;
    }

    public int getStart() {
        if(isStartWithInclude()) {
            return this.input.charAt(1) - ASCII_VALUE_OF_1;
        }
        return this.input.charAt(1) - ASCII_VALUE_OF_2;
    }

    public Boolean isStartWithInclude() {
        return this.input.startsWith("[");
    }

    public Boolean isEndWithInclude() {
        return this.input.endsWith("]");
    }

    public int getEnd() {
        if(isEndWithInclude()) {
            return this.input.charAt(3) - ASCII_VALUE_OF_5;
        }
        return this.input.charAt(3) - ASCII_VALUE_OF_4;
    }
}
