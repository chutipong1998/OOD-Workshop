public class MyRange {
    public static final int ASCII_VALUE_OF_1 = 48;
    public static final int ASCII_VALUE_OF_2 = 47;
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

    public int getEnd() {
        if(!isStartWithInclude()) {
            return this.input.charAt(1) - ASCII_VALUE_OF_1;
        }
        return -1;
    }
}
