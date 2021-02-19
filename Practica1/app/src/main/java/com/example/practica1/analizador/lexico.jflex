/*Seccion codigo de usuario*/
package analizador;
import java_cup.runtime.*;
import java.io.Reader;
%%

/*Seccion configuracion*/
%class lexico
%cup
%unicode
%line
%column
%public

//Metodos
%{
      private Symbol symbol(int type, String lexema) {
        return new Symbol(type, new Token(lexema, yyline + 1, yycolumn + 1));
      }
%}

//Palabras reservadas y tokens validos
SEPARADOR = \r|\r\n|\n
ESPACIO = {SEPARADOR} | [ \t\f]
ENTERO=([0-9]+)
COLOR=("azul"|"rojo"|"verde"|"amarillo"|"naranja"|"morado"|"cafe"|"negro")
CURVA = ("curva")
LINEA=("linea")
CIRCULO=("circulo")
CUADRADO=("cuadrado")
RECTANGULO=("rectangulo")
POLIGONO=("poligono")
GRAFICAR=("graficar")
ANIMAR=("animar")
OBJETO=("objeto")
ANTERIOR=("anterior")
SUMA="+"
RESTA=("-")
MULTIPLICACION=("*")
DIVISION=("/")
PARENTESISA=("(")
PARENTESISB=(")")
COMA=(",")

%%

/*Seccion Eeglas Lexicas*/

<YYINITIAL>{

{SEPARADOR} {/*Ignora el separador*/}
{ESPACIO} {/*Ignora el espacio*/}
{ENTERO} {return symbol(sym.ENTERO,yytext()); }
{COLOR} {return symbol(sym.COLOR,yytext()); }
{CURVA} {return symbol(sym.CURVA,yytext()); }
{LINEA} {return symbol(sym.LINEA,yytext()); }
{CIRCULO} {return symbol(sym.CIRCULO,yytext()); }
{CUADRADO} {return symbol(sym.CUADRADO,yytext()); }
{RECTANGULO} {return symbol(sym.RECTANGULO,yytext()); }
{POLIGONO} {return symbol(sym.POLIGONO,yytext()); }
{GRAFICAR} {return symbol(sym.GRAFICAR,yytext()); }
{ANIMAR} {return symbol(sym.ANIMAR,yytext()); }
{OBJETO} {return symbol(sym.OBJETO,yytext()); }
{ANTERIOR} {return symbol(sym.ANTERIOR,yytext()); }
{SUMA} {return symbol(sym.SUMA,yytext()); }
{RESTA} {return symbol(sym.RESTA,yytext()); }
{MULTIPLICACION} {return symbol(sym.MULTIPLICACION,yytext()); }
{DIVISION} {return symbol(sym.DIVISION,yytext()); }
{PARENTESISA} {return symbol(sym.PARENTESISA,yytext()); }
{PARENTESISB} {return symbol(sym.PARENTESISB,yytext()); }
{COMA} {return symbol(sym.COMA,yytext()); }
}

/*Errores y signos encontrados*/
[^] {return symbol(sym.error,yytext()); }