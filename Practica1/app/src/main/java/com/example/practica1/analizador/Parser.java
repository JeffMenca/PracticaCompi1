
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.example.practica1.analizador;

import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.List;
import com.example.practica1.objetos.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\031\000\002\002\004\000\002\002\003\000\002\002" +
    "\003\000\002\002\002\000\002\004\004\000\002\003\017" +
    "\000\002\003\015\000\002\003\015\000\002\003\017\000" +
    "\002\003\021\000\002\003\003\000\002\010\005\000\002" +
    "\010\005\000\002\010\005\000\002\010\005\000\002\010" +
    "\003\000\002\010\005\000\002\010\003\000\002\005\003" +
    "\000\002\005\003\000\002\005\002\000\002\006\012\000" +
    "\002\006\003\000\002\007\003\000\002\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\141\000\010\002\ufffe\003\006\014\005\001\002\000" +
    "\004\002\000\001\002\000\016\003\012\007\015\010\014" +
    "\011\017\012\011\013\013\001\002\000\004\002\uffff\001" +
    "\002\000\004\002\010\001\002\000\004\002\001\001\002" +
    "\000\004\024\130\001\002\000\004\002\ufff7\001\002\000" +
    "\004\024\112\001\002\000\004\024\100\001\002\000\004" +
    "\024\064\001\002\000\004\002\ufffd\001\002\000\004\024" +
    "\020\001\002\000\010\003\021\004\024\024\023\001\002" +
    "\000\022\006\ufff0\007\ufff0\020\ufff0\021\ufff0\022\ufff0\023" +
    "\ufff0\025\ufff0\026\ufff0\001\002\000\014\020\030\021\026" +
    "\022\027\023\032\026\037\001\002\000\010\003\021\004" +
    "\024\024\023\001\002\000\022\006\ufff2\007\ufff2\020\ufff2" +
    "\021\ufff2\022\ufff2\023\ufff2\025\ufff2\026\ufff2\001\002\000" +
    "\014\020\030\021\026\022\027\023\032\025\031\001\002" +
    "\000\010\003\021\004\024\024\023\001\002\000\010\003" +
    "\021\004\024\024\023\001\002\000\010\003\021\004\024" +
    "\024\023\001\002\000\022\006\ufff1\007\ufff1\020\ufff1\021" +
    "\ufff1\022\ufff1\023\ufff1\025\ufff1\026\ufff1\001\002\000\010" +
    "\003\021\004\024\024\023\001\002\000\022\006\ufff3\007" +
    "\ufff3\020\ufff3\021\ufff3\022\ufff3\023\ufff3\025\ufff3\026\ufff3" +
    "\001\002\000\022\006\ufff6\007\ufff6\020\ufff6\021\ufff6\022" +
    "\027\023\032\025\ufff6\026\ufff6\001\002\000\022\006\ufff4" +
    "\007\ufff4\020\ufff4\021\ufff4\022\ufff4\023\ufff4\025\ufff4\026" +
    "\ufff4\001\002\000\022\006\ufff5\007\ufff5\020\ufff5\021\ufff5" +
    "\022\027\023\032\025\ufff5\026\ufff5\001\002\000\010\003" +
    "\021\004\024\024\023\001\002\000\014\020\030\021\026" +
    "\022\027\023\032\026\041\001\002\000\010\003\021\004" +
    "\024\024\023\001\002\000\014\020\030\021\026\022\027" +
    "\023\032\026\043\001\002\000\004\005\044\001\002\000" +
    "\004\025\045\001\002\000\012\002\uffed\003\051\014\005" +
    "\015\047\001\002\000\004\002\uffef\001\002\000\004\016" +
    "\053\001\002\000\004\002\uffee\001\002\000\004\002\uffeb" +
    "\001\002\000\004\002\ufffa\001\002\000\004\017\054\001" +
    "\002\000\004\024\055\001\002\000\010\003\021\004\024" +
    "\024\023\001\002\000\014\020\030\021\026\022\027\023" +
    "\032\026\057\001\002\000\010\003\021\004\024\024\023" +
    "\001\002\000\016\006\061\007\063\020\030\021\026\022" +
    "\027\023\032\001\002\000\004\002\uffe9\001\002\000\004" +
    "\002\uffec\001\002\000\004\002\uffea\001\002\000\010\003" +
    "\021\004\024\024\023\001\002\000\014\020\030\021\026" +
    "\022\027\023\032\026\066\001\002\000\010\003\021\004" +
    "\024\024\023\001\002\000\014\020\030\021\026\022\027" +
    "\023\032\026\070\001\002\000\010\003\021\004\024\024" +
    "\023\001\002\000\014\020\030\021\026\022\027\023\032" +
    "\026\072\001\002\000\010\003\021\004\024\024\023\001" +
    "\002\000\014\020\030\021\026\022\027\023\032\026\074" +
    "\001\002\000\004\005\075\001\002\000\004\025\076\001" +
    "\002\000\012\002\uffed\003\051\014\005\015\047\001\002" +
    "\000\004\002\ufffc\001\002\000\010\003\021\004\024\024" +
    "\023\001\002\000\014\020\030\021\026\022\027\023\032" +
    "\026\102\001\002\000\010\003\021\004\024\024\023\001" +
    "\002\000\014\020\030\021\026\022\027\023\032\026\104" +
    "\001\002\000\010\003\021\004\024\024\023\001\002\000" +
    "\014\020\030\021\026\022\027\023\032\026\106\001\002" +
    "\000\004\005\107\001\002\000\004\025\110\001\002\000" +
    "\012\002\uffed\003\051\014\005\015\047\001\002\000\004" +
    "\002\ufffb\001\002\000\010\003\021\004\024\024\023\001" +
    "\002\000\014\020\030\021\026\022\027\023\032\026\114" +
    "\001\002\000\010\003\021\004\024\024\023\001\002\000" +
    "\014\020\030\021\026\022\027\023\032\026\116\001\002" +
    "\000\010\003\021\004\024\024\023\001\002\000\014\020" +
    "\030\021\026\022\027\023\032\026\120\001\002\000\010" +
    "\003\021\004\024\024\023\001\002\000\014\020\030\021" +
    "\026\022\027\023\032\026\122\001\002\000\010\003\021" +
    "\004\024\024\023\001\002\000\014\020\030\021\026\022" +
    "\027\023\032\026\124\001\002\000\004\005\125\001\002" +
    "\000\004\025\126\001\002\000\012\002\uffed\003\051\014" +
    "\005\015\047\001\002\000\004\002\ufff8\001\002\000\010" +
    "\003\021\004\024\024\023\001\002\000\014\020\030\021" +
    "\026\022\027\023\032\026\132\001\002\000\010\003\021" +
    "\004\024\024\023\001\002\000\014\020\030\021\026\022" +
    "\027\023\032\026\134\001\002\000\010\003\021\004\024" +
    "\024\023\001\002\000\014\020\030\021\026\022\027\023" +
    "\032\026\136\001\002\000\010\003\021\004\024\024\023" +
    "\001\002\000\014\020\030\021\026\022\027\023\032\026" +
    "\140\001\002\000\004\005\141\001\002\000\004\025\142" +
    "\001\002\000\012\002\uffed\003\051\014\005\015\047\001" +
    "\002\000\004\002\ufff9\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\141\000\006\002\006\004\003\001\001\000\002\001" +
    "\001\000\004\003\015\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\010\021\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\010\024" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\010" +
    "\035\001\001\000\004\010\034\001\001\000\004\010\033" +
    "\001\001\000\002\001\001\000\004\010\032\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\010\037\001\001\000\002\001\001\000" +
    "\004\010\041\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\004\045\005\051\006\047\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\010\055\001\001\000\002\001\001" +
    "\000\004\010\057\001\001\000\004\007\061\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\010\064\001\001\000\002\001\001\000\004\010\066\001" +
    "\001\000\002\001\001\000\004\010\070\001\001\000\002" +
    "\001\001\000\004\010\072\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\004\045\005\076" +
    "\006\047\001\001\000\002\001\001\000\004\010\100\001" +
    "\001\000\002\001\001\000\004\010\102\001\001\000\002" +
    "\001\001\000\004\010\104\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\004\045\005\110" +
    "\006\047\001\001\000\002\001\001\000\004\010\112\001" +
    "\001\000\002\001\001\000\004\010\114\001\001\000\002" +
    "\001\001\000\004\010\116\001\001\000\002\001\001\000" +
    "\004\010\120\001\001\000\002\001\001\000\004\010\122" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\010\004\045\005\126\006\047\001\001\000\002" +
    "\001\001\000\004\010\130\001\001\000\002\001\001\000" +
    "\004\010\132\001\001\000\002\001\001\000\004\010\134" +
    "\001\001\000\002\001\001\000\004\010\136\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\004\045\005\142\006\047\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    //Listas
    private ArrayList<String> errorsList=new ArrayList<String>();
    private ArrayList<Forma> formasList= new ArrayList<Forma>();
	public Parser(lexico lex) {
		super(lex);
	}
	@Override
        public void syntax_error(Symbol st) {
            //Reporte el error
        	Token token = (Token) st.value;
            report_error("Error Sintactico con el  Token:"+ token.getLexeme()+" este no pertenece a la estructura - linea: "+token.getLine()+" - columna: "+token.getColumn() + "\n",null);
            //Imprime el error
            errorsList.add(String.format("Error Sintactico con el Token: '%s' este no pertenece a la estructura- linea: %d  columna: %d. Corrige e intenta de nuevo.", token.getLexeme(), token.getLine(), token.getColumn()));
        }
	    //Retorna list de errores sintacticos
        public ArrayList getErrorsList(){
	        return errorsList;
	    }
        //Retorna list de formas
        public ArrayList getFormasList(){
	        return formasList;
	    }
        //Ingresa datos en array de formas
        public void addFormasList(Forma forma){
            try {
                 formasList.add(forma);
                }
            catch(Exception e) {
                System.out.println("error encontradoo: "+e);
                }
	    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= GRAFICANDO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= error 
            {
              Object RESULT =null;
		System.out.println("Error en expresion");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INICIO ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // GRAFICANDO ::= GRAFICAR FORMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("GRAFICANDO",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // FORMA ::= LINEA PARENTESISA OPERACION COMA OPERACION COMA OPERACION COMA OPERACION COMA COLOR PARENTESISB PROXIMA 
            {
              Object RESULT =null;
		int posxleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)).left;
		int posxright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)).right;
		Integer posx = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-10)).value;
		int posyleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).left;
		int posyright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).right;
		Integer posy = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		int posx2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int posx2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Integer posx2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int posy2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int posy2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Integer posy2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int colorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int colorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token color = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Linea nuevaLinea=new Linea("linea",posx,posy,color.getLexeme(),posx2,posy2);
   addFormasList(nuevaLinea); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FORMA",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-12)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // FORMA ::= CIRCULO PARENTESISA OPERACION COMA OPERACION COMA OPERACION COMA COLOR PARENTESISB PROXIMA 
            {
              Object RESULT =null;
		int posxleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).left;
		int posxright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).right;
		Integer posx = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		int posyleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int posyright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Integer posy = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int radioleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int radioright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Integer radio = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int colorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int colorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token color = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Circulo nuevoCirculo=new Circulo("circulo",posx,posy,color.getLexeme(),radio);
   addFormasList(nuevoCirculo); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FORMA",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // FORMA ::= CUADRADO PARENTESISA OPERACION COMA OPERACION COMA OPERACION COMA COLOR PARENTESISB PROXIMA 
            {
              Object RESULT =null;
		int posxleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).left;
		int posxright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).right;
		Integer posx = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		int posyleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int posyright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Integer posy = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int tamanioLadoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int tamanioLadoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Integer tamanioLado = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int colorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int colorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token color = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Cuadrado nuevoCuadrado=new Cuadrado("cuadrado",posx,posy,color.getLexeme(),tamanioLado);
   addFormasList(nuevoCuadrado); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FORMA",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // FORMA ::= RECTANGULO PARENTESISA OPERACION COMA OPERACION COMA OPERACION COMA OPERACION COMA COLOR PARENTESISB PROXIMA 
            {
              Object RESULT =null;
		int posxleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)).left;
		int posxright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)).right;
		Integer posx = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-10)).value;
		int posyleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).left;
		int posyright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).right;
		Integer posy = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		int altoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int altoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Integer alto = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int ancholeft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int anchoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Integer ancho = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int colorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int colorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token color = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Rectangulo nuevoRectangulo =new Rectangulo("rectangulo",posx,posy,color.getLexeme(),alto,ancho);
   addFormasList(nuevoRectangulo); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FORMA",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-12)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // FORMA ::= POLIGONO PARENTESISA OPERACION COMA OPERACION COMA OPERACION COMA OPERACION COMA OPERACION COMA COLOR PARENTESISB PROXIMA 
            {
              Object RESULT =null;
		int posxleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-12)).left;
		int posxright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-12)).right;
		Integer posx = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-12)).value;
		int posyleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)).left;
		int posyright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)).right;
		Integer posy = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-10)).value;
		int altoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).left;
		int altoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).right;
		Integer alto = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		int ancholeft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int anchoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Integer ancho = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int cantidadLadosleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int cantidadLadosright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Integer cantidadLados = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int colorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int colorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token color = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Poligono nuevoPoligono=new Poligono("poligono",posx,posy,color.getLexeme(),alto,ancho,cantidadLados);
   addFormasList(nuevoPoligono);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FORMA",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-14)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // FORMA ::= error 
            {
              Object RESULT =null;
		System.out.println("Error en expresion");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FORMA",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // OPERACION ::= OPERACION SUMA OPERACION 
            {
              Integer RESULT =null;
		int numero1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int numero1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer numero1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int numero2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int numero2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer numero2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Integer(numero1.intValue()+numero2.intValue()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERACION",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // OPERACION ::= OPERACION RESTA OPERACION 
            {
              Integer RESULT =null;
		int numero1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int numero1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer numero1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int numero2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int numero2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer numero2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Integer(numero1.intValue()-numero2.intValue()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERACION",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // OPERACION ::= OPERACION MULTIPLICACION OPERACION 
            {
              Integer RESULT =null;
		int numero1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int numero1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer numero1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int numero2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int numero2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer numero2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Integer(numero1.intValue()*numero2.intValue()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERACION",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // OPERACION ::= OPERACION DIVISION OPERACION 
            {
              Integer RESULT =null;
		int numero1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int numero1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer numero1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int numero2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int numero2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer numero2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Integer(numero1.intValue()/numero2.intValue()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERACION",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // OPERACION ::= ENTERO 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Token n = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		  RESULT = Integer.valueOf( n.getLexeme()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERACION",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // OPERACION ::= PARENTESISA OPERACION PARENTESISB 
            {
              Integer RESULT =null;
		int operacionleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int operacionright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer operacion = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = operacion; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERACION",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // OPERACION ::= error 
            {
              Integer RESULT =null;
		int errorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int errorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object error = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		System.out.println("Error en expresion");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERACION",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // PROXIMA ::= GRAFICANDO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("PROXIMA",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // PROXIMA ::= ANIMANDO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("PROXIMA",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // PROXIMA ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("PROXIMA",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // ANIMANDO ::= ANIMAR OBJETO ANTERIOR PARENTESISA OPERACION COMA OPERACION TIPOANIMACION 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ANIMANDO",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // ANIMANDO ::= error 
            {
              Object RESULT =null;
		System.out.println("Error en expresion");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ANIMANDO",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // TIPOANIMACION ::= LINEA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("TIPOANIMACION",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // TIPOANIMACION ::= CURVA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("TIPOANIMACION",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
