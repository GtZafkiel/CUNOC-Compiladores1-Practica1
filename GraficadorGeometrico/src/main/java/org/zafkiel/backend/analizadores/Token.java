package org.zafkiel.backend.analizadores;

public class Token {
    public int counter;
    public String text;
    public String keyword;
    public int lineNumber;
    public int columnNumber;
    public long charNumber;
    public Token(int counter, String text, String keyword, int lineNumber, int columnNumber, long charNumber) {
        this.counter = counter;
        this.text = text;
        this.keyword = keyword;
        this.lineNumber = lineNumber;
        this.columnNumber = columnNumber;
        this.charNumber = charNumber;
    }

    public String toString() {
        return "---->   Contador: " + this.counter + "          Texto: " + this.text + "         Keyword: " + this.keyword +
                "         Linea: " + this.lineNumber +"         Columna: " + this.columnNumber + "         Caracter: " + this.charNumber;
    }
}
