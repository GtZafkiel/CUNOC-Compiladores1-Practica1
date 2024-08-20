/*---   1era Area: Codigo Usuario   ---*/
//---> Paquetes, importaciones
package org.zafkiel.backend.analizadores;
import org.zafkiel.backend.analizadores.Token;
import java.util.List;
import java.util.ArrayList;
/*---   2da Area: Opciones y Declaraciones   ---*/
%%
//---> Directivas
%public
%class scanner
//---> Estados
%{
    private int counter;
    private int counter2;
    private static List<String> lexicos = new ArrayList<>();
    public static List<String> getLexicos() {
        return lexicos;
    }
    private static List<String> errores = new ArrayList<>();
    public static List<String> getErrores() {
        return errores;
    }
%}
%type Token
%ignorecase
%init{
    counter = 0;
    counter2 = 0;
    yyline = 1;
    yycolumn = 1;
    yychar = 1;
%init}
%eof{
%eof}
%line
%column
%char
%full
//---> Expresiones Regulares
    Espacios = " "
    SaltoDeLinea = \n|\r|\r\n
    DIGITO = [0-9]
    LETRA = [A-Za-z]
    IDENTIFICADOR = [a-zA-Z_][a-zA-Z_0-9]*
    ENTERO = -?{DIGITO}+
    DECIMAL = -?{DIGITO}+(\.{DIGITO}+)?
    GRAFICAR = "graficar"
    ANIMAR = "animar"
    LINEA = "linea"
    CURVA = "curva"
    CIRCULO = "circulo"
    CUADRADO = "cuadrado"
    RECTANGULO = "rectangulo"
    POLIGONO  = "poligono"
    MAS = "+"
    MENOS = "-"
    POR = "*"
    DIV = "/"
    PARA = "("
    PARB = ")"
    COMA = ","
    AZUL = "azul"
    ROJO = "rojo"
    AMARILLO = "amarillo"
    VERDE = "verde"
    ROSADO = "rosado"
    CAFE = "cafe"
    MORADO = "morado"
    NEGRO = "negro"
    BLANCO = "blanco"
%%
/*---   3era Area: Reglas Lexicas   ---*/
<YYINITIAL> {Espacios} {
    //---> Ignorar espacios en blanco
}
<YYINITIAL> {SaltoDeLinea} {
    //---> Ignorar saltos de linea
}
<YYINITIAL> {GRAFICAR} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Graficar" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Graficar", yyline, yycolumn, yychar);
}
<YYINITIAL> {ANIMAR} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Animar" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Animar", yyline, yycolumn, yychar);
}
<YYINITIAL> {LINEA} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Linea" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Linea", yyline, yycolumn, yychar);
}
<YYINITIAL> {CURVA} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Curva" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Curva", yyline, yycolumn, yychar);
}
<YYINITIAL> {CIRCULO} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Circulo" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Circulo", yyline, yycolumn, yychar);
}
<YYINITIAL> {CUADRADO} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Cuadrado" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Cuadrado", yyline, yycolumn, yychar);
}
<YYINITIAL> {RECTANGULO} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Rectangulo" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Rectangulo", yyline, yycolumn, yychar);
}
<YYINITIAL> {POLIGONO} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Poligono" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Poligono", yyline, yycolumn, yychar);
}
<YYINITIAL> {AZUL} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Azul" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Azul", yyline, yycolumn, yychar);
}
<YYINITIAL> {ROJO} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Rojo" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Rojo", yyline, yycolumn, yychar);
}
<YYINITIAL> {AMARILLO} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Amarillo" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Amarillo", yyline, yycolumn, yychar);
}
<YYINITIAL> {VERDE} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Verde" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Verde", yyline, yycolumn, yychar);
}
<YYINITIAL> {ROSADO} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Rosado" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Rosado", yyline, yycolumn, yychar);
}
<YYINITIAL> {CAFE} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Cafe" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Cafe", yyline, yycolumn, yychar);
}
<YYINITIAL> {MORADO} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Morado" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Morado", yyline, yycolumn, yychar);
}
<YYINITIAL> {NEGRO} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Negro" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Negro", yyline, yycolumn, yychar);
}
<YYINITIAL> {BLANCO} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Blanco" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Blanco", yyline, yycolumn, yychar);
}
<YYINITIAL> {MAS} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Mas" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Mas", yyline, yycolumn, yychar);
}
<YYINITIAL> {MENOS} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Menos" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Menos", yyline, yycolumn, yychar);
}
<YYINITIAL> {POR} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Multiplicador" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Multiplicador", yyline, yycolumn, yychar);
}
<YYINITIAL> {DIV} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Divisor" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Divisor", yyline, yycolumn, yychar);
}
<YYINITIAL> {PARA} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Parentesis_Abierto" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Parentesis_Abierto", yyline, yycolumn, yychar);
}
<YYINITIAL> {PARB} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Parentesis_Cerrado" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Parentesis_Cerrado", yyline, yycolumn, yychar);
}
<YYINITIAL> {COMA} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Coma" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Coma", yyline, yycolumn, yychar);
}
<YYINITIAL> {ENTERO} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Entero" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Entero", yyline, yycolumn, yychar);
}
<YYINITIAL> {DECIMAL} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Decimal" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Decimal", yyline, yycolumn, yychar);
}
<YYINITIAL> {IDENTIFICADOR} {
    counter++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "Identificador" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "Identificador", yyline, yycolumn, yychar);
}
<YYINITIAL> . {
    counter++;
    counter2++;
    lexicos.add("---->   Contador: " +counter+ "                    Lexema: " + yytext() + "                   Keyword: " + "ERROR" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    errores.add("---->   Contador: " +counter2+ "                    Lexema: " + yytext() + "                   Keyword: " + "ERROR - Simbolo no existe en el lenguaje" +
                "                   Linea: " + yyline +"                   Columna: " + yycolumn + "                   Caracter: " + yychar);
    return new Token(counter, yytext(), "ERROR", yyline, yycolumn, yychar);
}
