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
    LineTerminator = \r|\n|\r\n
    InputCharacter = [^\r\n]
    Comentario = {TraditionalComment} | {EndOfLineComment}
    TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
    EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
    CommentContent       = ( [^*] | \*+ [^/*] )*
    Espacios = " "
    SaltoDeLinea = \n|\r|\r\n
    DIGITO = [0-9]
    LETRA = [A-Za-z]
    ENTERO = -?{DIGITO}+
    DECIMAL = -?{DIGITO}+(\.{DIGITO}+)?
    EJE6 = (a*ba*ba*)*a*ba*
    EJE7 = (a*|a*ba*|a*bba*)
%%

/*---   3era Area: Reglas Lexicas   ---*/
<YYINITIAL> {Comentario} {
    counter++;
    return new Token(counter, yytext(), "Comentario", yyline, yycolumn, yychar);
}
<YYINITIAL> {Espacios} {
    //---> Ignorar espacios en blanco
}
<YYINITIAL> {SaltoDeLinea} {
    //---> Ignorar saltos de linea
}
<YYINITIAL> {DECIMAL} {
    counter++;
    return new Token(counter, yytext(), "Decimal", yyline, yycolumn, yychar);
}
<YYINITIAL> {EJE6} {
    counter++;
    return new Token(counter, yytext(), "Ejercicio 6 - Cadenas de a y b, con cantidad impar de b", yyline, yycolumn, yychar);
}
<YYINITIAL> {EJE7} {
    counter++;
    return new Token(counter, yytext(), "Ejercicio 7 - Cadenas de a y b, que nunca cotenga 3 b seguidas", yyline, yycolumn, yychar);
}
<YYINITIAL> . {
    counter++;
    return new Token(counter, yytext(), "ERROR", yyline, yycolumn, yychar);
}