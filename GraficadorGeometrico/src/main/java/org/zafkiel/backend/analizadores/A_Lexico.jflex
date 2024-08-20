/*---   1era Area: Codigo Usuario   ---*/
//---> Paquetes, importaciones
package org.zafkiel.backend.analizadores;
import org.zafkiel.backend.analizadores.Token;
/*---   2da Area: Opciones y Declaraciones   ---*/
%%
//---> Directivas
%public
%class scanner
//---> Estados
%{
    private int counter;
%}
%type Token
%ignorecase
%init{
    counter = 0;
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
    return new Token(counter, yytext(), "Graficar", yyline, yycolumn, yychar);
}
<YYINITIAL> {ANIMAR} {
    counter++;
    return new Token(counter, yytext(), "Animar", yyline, yycolumn, yychar);
}
<YYINITIAL> {LINEA} {
    counter++;
    return new Token(counter, yytext(), "Linea", yyline, yycolumn, yychar);
}
<YYINITIAL> {CURVA} {
    counter++;
    return new Token(counter, yytext(), "Curva", yyline, yycolumn, yychar);
}
<YYINITIAL> {CIRCULO} {
    counter++;
    return new Token(counter, yytext(), "Circulo", yyline, yycolumn, yychar);
}
<YYINITIAL> {CUADRADO} {
    counter++;
    return new Token(counter, yytext(), "Cuadrado", yyline, yycolumn, yychar);
}
<YYINITIAL> {RECTANGULO} {
    counter++;
    return new Token(counter, yytext(), "Rectangulo", yyline, yycolumn, yychar);
}
<YYINITIAL> {POLIGONO} {
    counter++;
    return new Token(counter, yytext(), "Poligono", yyline, yycolumn, yychar);
}
<YYINITIAL> {AZUL} {
    counter++;
    return new Token(counter, yytext(), "Azul", yyline, yycolumn, yychar);
}
<YYINITIAL> {ROJO} {
    counter++;
    return new Token(counter, yytext(), "Rojo", yyline, yycolumn, yychar);
}
<YYINITIAL> {AMARILLO} {
    counter++;
    return new Token(counter, yytext(), "Amarillo", yyline, yycolumn, yychar);
}
<YYINITIAL> {VERDE} {
    counter++;
    return new Token(counter, yytext(), "Verde", yyline, yycolumn, yychar);
}
<YYINITIAL> {ROSADO} {
    counter++;
    return new Token(counter, yytext(), "Rosado", yyline, yycolumn, yychar);
}
<YYINITIAL> {CAFE} {
    counter++;
    return new Token(counter, yytext(), "Cafe", yyline, yycolumn, yychar);
}
<YYINITIAL> {MORADO} {
    counter++;
    return new Token(counter, yytext(), "Morado", yyline, yycolumn, yychar);
}
<YYINITIAL> {NEGRO} {
    counter++;
    return new Token(counter, yytext(), "Negro", yyline, yycolumn, yychar);
}
<YYINITIAL> {BLANCO} {
    counter++;
    return new Token(counter, yytext(), "Blanco", yyline, yycolumn, yychar);
}
<YYINITIAL> {MAS} {
    counter++;
    return new Token(counter, yytext(), "Mas", yyline, yycolumn, yychar);
}
<YYINITIAL> {MENOS} {
    counter++;
    return new Token(counter, yytext(), "Menos", yyline, yycolumn, yychar);
}
<YYINITIAL> {POR} {
    counter++;
    return new Token(counter, yytext(), "Multiplicador", yyline, yycolumn, yychar);
}
<YYINITIAL> {DIV} {
    counter++;
    return new Token(counter, yytext(), "Divisor", yyline, yycolumn, yychar);
}
<YYINITIAL> {PARA} {
    counter++;
    return new Token(counter, yytext(), "Parentesis_Abierto", yyline, yycolumn, yychar);
}
<YYINITIAL> {PARB} {
    counter++;
    return new Token(counter, yytext(), "Parentesis_Cerrado", yyline, yycolumn, yychar);
}
<YYINITIAL> {COMA} {
    counter++;
    return new Token(counter, yytext(), "Coma", yyline, yycolumn, yychar);
}
<YYINITIAL> {ENTERO} {
    counter++;
    return new Token(counter, yytext(), "Entero", yyline, yycolumn, yychar);
}
<YYINITIAL> {DECIMAL} {
    counter++;
    return new Token(counter, yytext(), "Decimal", yyline, yycolumn, yychar);
}
<YYINITIAL> {IDENTIFICADOR} {
    counter++;
    return new Token(counter, yytext(), "Identificador", yyline, yycolumn, yychar);
}
<YYINITIAL> . {
    counter++;
    return new Token(counter, yytext(), "ERROR", yyline, yycolumn, yychar);
}