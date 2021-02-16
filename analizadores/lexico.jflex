/*primer seccion: codigo de usuario*/
import java_cup.runtime.*;
import java.io.Reader;
%%

/*segunda seccion: configuracion*/
%class lexico
%cup
%unicode
%line
%column
%public

%{
      private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
      }
      private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
      }
%}


SEPARADOR = \r|\r\n
ESPACIO = {SEPARADOR} | [ \t\f]
ENTER=\n;
ENTERO=((0-9)*)
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
SUMA=("+")
RESTA=("-")
MULTIPLICACION=("*")
DIVISION=("/")
PARENTESISA=("(")
PARENTESISB=(")")
COMA=(",")



%%


/*tercer seccion: reglase lexicas*/

<YYINITIAL>{

{SEPARADOR} {/*Ignora el separador*/}
{ESPACIO} {/*Ignora el espacio*/}
{ENTER} {return symbol(sym.ENTER); }
{ENTERO} {
  System.out.println("Encontro unn entero");
  return symbol(sym.ENTERO); 
}
{COLOR} {return symbol(sym.COLOR); }
{CURVA} {return symbol(sym.CURVA); }
{LINEA} {return symbol(sym.LINEA); }
{CIRCULO} {return symbol(sym.CIRCULO); }
{CUADRADO} {return symbol(sym.CUADRADO); }
{RECTANGULO} {return symbol(sym.RECTANGULO); }
{POLIGONO} {return symbol(sym.POLIGONO); }
{GRAFICAR} {return symbol(sym.GRAFICAR); }
{ANIMAR} {return symbol(sym.ANIMAR); }
{OBJETO} {return symbol(sym.OBJETO); }
{ANTERIOR} {return symbol(sym.ANTERIOR); }
{SUMA} {return symbol(sym.SUMA); }
{RESTA} {return symbol(sym.RESTA); }
{MULTIPLICACION} {return symbol(sym.MULTIPLICACION); }
{DIVISION} {return symbol(sym.DIVISION); }
{PARENTESISA} {return symbol(sym.PARENTESISA); }
{PARENTESISB} {return symbol(sym.PARENTESISB); }
{COMA} {return symbol(sym.COMA); }
}


[^] {return symbol(sym.ERROR); }