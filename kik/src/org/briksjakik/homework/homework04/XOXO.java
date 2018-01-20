package org.briksjakik.homework.homework04;

public enum XOXO {

    TIC("X", 15),
    TAC("O", 1500),
    EMPTY(" ", 99);

    public String getSymbol() {
        return symbol;
    }

    public int getCos() {
        return cos;
    }

    String symbol;
    int cos;


    XOXO(String symbol, int cos) {
        this.symbol = symbol;
        this.cos = cos;
    }

    void text () {
        XOXO xo = TIC;
        switch (xo)

        {
            case TAC:
                break;
            case EMPTY:
                break;
        }
    }

}
