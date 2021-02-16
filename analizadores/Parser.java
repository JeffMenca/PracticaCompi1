
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
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
    "\000\023\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\002\002\000\002\003\017\000\002\003\015" +
    "\000\002\003\015\000\002\003\017\000\002\003\021\000" +
    "\002\003\003\000\002\004\004\000\002\004\006\000\002" +
    "\004\003\000\002\005\004\000\002\005\004\000\002\005" +
    "\004\000\002\005\004\000\002\005\003\000\002\005\002" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\126\000\010\002\ufffe\015\004\030\005\001\002\000" +
    "\016\010\013\011\014\012\016\013\010\014\012\030\011" +
    "\001\002\000\004\002\uffff\001\002\000\004\002\007\001" +
    "\002\000\004\002\001\001\002\000\004\025\115\001\002" +
    "\000\004\002\ufff8\001\002\000\004\025\077\001\002\000" +
    "\004\025\063\001\002\000\004\025\051\001\002\000\004" +
    "\002\000\001\002\000\004\025\017\001\002\000\010\005" +
    "\023\025\021\030\020\001\002\000\006\026\ufff5\027\ufff5" +
    "\001\002\000\010\005\023\025\021\030\020\001\002\000" +
    "\004\027\036\001\002\000\020\021\030\022\024\023\025" +
    "\024\031\026\uffef\027\uffef\030\026\001\002\000\010\005" +
    "\023\025\021\030\020\001\002\000\010\005\023\025\021" +
    "\030\020\001\002\000\006\026\ufff0\027\ufff0\001\002\000" +
    "\006\026\ufff7\027\ufff7\001\002\000\010\005\023\025\021" +
    "\030\020\001\002\000\010\005\023\025\021\030\020\001" +
    "\002\000\006\026\ufff1\027\ufff1\001\002\000\006\026\ufff4" +
    "\027\ufff4\001\002\000\006\026\ufff2\027\ufff2\001\002\000" +
    "\006\026\ufff3\027\ufff3\001\002\000\010\005\023\025\021" +
    "\030\020\001\002\000\004\027\040\001\002\000\010\005" +
    "\023\025\021\030\020\001\002\000\004\027\042\001\002" +
    "\000\004\006\043\001\002\000\004\026\044\001\002\000" +
    "\002\001\002\000\004\002\ufffb\001\002\000\004\026\047" +
    "\001\002\000\020\021\030\022\024\023\025\024\031\026" +
    "\uffef\027\uffef\030\026\001\002\000\006\026\ufff6\027\ufff6" +
    "\001\002\000\010\005\023\025\021\030\020\001\002\000" +
    "\004\027\053\001\002\000\010\005\023\025\021\030\020" +
    "\001\002\000\004\027\055\001\002\000\010\005\023\025" +
    "\021\030\020\001\002\000\004\027\057\001\002\000\004" +
    "\006\060\001\002\000\004\026\061\001\002\000\002\001" +
    "\002\000\004\002\ufffc\001\002\000\010\005\023\025\021" +
    "\030\020\001\002\000\004\027\065\001\002\000\010\005" +
    "\023\025\021\030\020\001\002\000\004\027\067\001\002" +
    "\000\010\005\023\025\021\030\020\001\002\000\004\027" +
    "\071\001\002\000\010\005\023\025\021\030\020\001\002" +
    "\000\004\027\073\001\002\000\004\006\074\001\002\000" +
    "\004\026\075\001\002\000\002\001\002\000\004\002\ufffd" +
    "\001\002\000\010\005\023\025\021\030\020\001\002\000" +
    "\004\027\101\001\002\000\010\005\023\025\021\030\020" +
    "\001\002\000\004\027\103\001\002\000\010\005\023\025" +
    "\021\030\020\001\002\000\004\027\105\001\002\000\010" +
    "\005\023\025\021\030\020\001\002\000\004\027\107\001" +
    "\002\000\010\005\023\025\021\030\020\001\002\000\004" +
    "\027\111\001\002\000\004\006\112\001\002\000\004\026" +
    "\113\001\002\000\002\001\002\000\004\002\ufff9\001\002" +
    "\000\010\005\023\025\021\030\020\001\002\000\004\027" +
    "\117\001\002\000\010\005\023\025\021\030\020\001\002" +
    "\000\004\027\121\001\002\000\010\005\023\025\021\030" +
    "\020\001\002\000\004\027\123\001\002\000\010\005\023" +
    "\025\021\030\020\001\002\000\004\027\125\001\002\000" +
    "\004\006\126\001\002\000\004\026\127\001\002\000\002" +
    "\001\002\000\004\002\ufffa\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\126\000\004\002\005\001\001\000\004\003\014\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\004\021\001\001\000\002\001\001\000" +
    "\004\004\045\001\001\000\002\001\001\000\004\005\026" +
    "\001\001\000\004\004\034\001\001\000\004\004\033\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\004\032" +
    "\001\001\000\004\004\031\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\004\036\001\001\000\002\001\001\000\004\004\040\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\006\044\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\005\047\001\001\000\002\001\001\000\004" +
    "\004\051\001\001\000\002\001\001\000\004\004\053\001" +
    "\001\000\002\001\001\000\004\004\055\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\006" +
    "\061\001\001\000\002\001\001\000\004\004\063\001\001" +
    "\000\002\001\001\000\004\004\065\001\001\000\002\001" +
    "\001\000\004\004\067\001\001\000\002\001\001\000\004" +
    "\004\071\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\006\075\001\001\000\002\001\001" +
    "\000\004\004\077\001\001\000\002\001\001\000\004\004" +
    "\101\001\001\000\002\001\001\000\004\004\103\001\001" +
    "\000\002\001\001\000\004\004\105\001\001\000\002\001" +
    "\001\000\004\004\107\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\006\113\001\001\000" +
    "\002\001\001\000\004\004\115\001\001\000\002\001\001" +
    "\000\004\004\117\001\001\000\002\001\001\000\004\004" +
    "\121\001\001\000\002\001\001\000\004\004\123\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\006\127\001\001\000\002\001\001" });

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




	private Symbol s;
    public void syntax_error(Symbol s){
        this.s = s;
    }
    public Symbol getS(){
        return this.s;
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
          case 1: // INICIO ::= GRAFICAR FORMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= ERROR 
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
          case 4: // FORMA ::= LINEA PARENTESISA OPERACION COMA OPERACION COMA OPERACION COMA OPERACION COMA COLOR PARENTESISB PROXIMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FORMA",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-12)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // FORMA ::= CIRCULO PARENTESISA OPERACION COMA OPERACION COMA OPERACION COMA COLOR PARENTESISB PROXIMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FORMA",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // FORMA ::= CUADRADO PARENTESISA OPERACION COMA OPERACION COMA OPERACION COMA COLOR PARENTESISB PROXIMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FORMA",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // FORMA ::= RECTANGULO PARENTESISA OPERACION COMA OPERACION COMA OPERACION COMA OPERACION COMA COLOR PARENTESISB PROXIMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FORMA",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-12)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // FORMA ::= POLIGONO PARENTESISA OPERACION COMA OPERACION COMA OPERACION COMA OPERACION COMA OPERACION COMA COLOR PARENTESISB PROXIMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FORMA",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-14)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // FORMA ::= ERROR 
            {
              Object RESULT =null;
		
            System.out.println("Error en expresion");
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FORMA",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // OPERACION ::= ENTERO SIGNO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERACION",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // OPERACION ::= PARENTESISA OPERACION PARENTESISB SIGNO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERACION",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // OPERACION ::= ERROR 
            {
              Object RESULT =null;
		
            System.out.println("Error en expresion3");
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERACION",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // SIGNO ::= SUMA OPERACION 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SIGNO",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // SIGNO ::= RESTA OPERACION 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SIGNO",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // SIGNO ::= MULTIPLICACION OPERACION 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SIGNO",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // SIGNO ::= DIVISION OPERACION 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SIGNO",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // SIGNO ::= ERROR 
            {
              Object RESULT =null;
		
            System.out.println("Error en expresion");
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SIGNO",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // SIGNO ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SIGNO",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
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
