public interface Expression {
    String interpret(InterpreterContext ic);
}

class IntToBinaryExpression implements Expression {
    private int i;

    public IntToBinaryExpression(int c) {
        this.i = c;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(i);
    }
}

class IntToHexadecimalExpression implements Expression {
    private int i;

    public IntToHexadecimalExpression(int c) {
        this.i = c;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimalFormat(i);
    }
}



