
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat Jan 20 15:27:19 CST 2024
//----------------------------------------------------

package codigo;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat Jan 20 15:27:19 CST 2024
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\046\000\002\002\004\000\002\002\005\000\002\002" +
    "\005\000\002\002\005\000\002\002\006\000\002\002\006" +
    "\000\002\003\005\000\002\003\006\000\002\003\005\000" +
    "\002\003\006\000\002\003\005\000\002\003\005\000\002" +
    "\003\006\000\002\003\006\000\002\004\003\000\002\004" +
    "\004\000\002\004\004\000\002\005\004\000\002\005\004" +
    "\000\002\005\004\000\002\005\004\000\002\006\005\000" +
    "\002\006\004\000\002\006\006\000\002\006\005\000\002" +
    "\006\004\000\002\006\005\000\002\006\004\000\002\006" +
    "\004\000\002\006\006\000\002\006\005\000\002\006\005" +
    "\000\002\006\003\000\002\006\004\000\002\006\004\000" +
    "\002\006\004\000\002\006\005\000\002\006\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\124\000\020\004\004\012\005\015\010\020\014\021" +
    "\011\022\013\023\007\001\002\000\014\011\110\020\104" +
    "\021\106\022\107\023\111\001\002\000\004\013\103\001" +
    "\002\000\004\002\102\001\002\000\004\004\100\001\002" +
    "\000\012\020\064\021\065\022\066\023\067\001\002\000" +
    "\004\004\062\001\002\000\022\005\026\006\023\007\021" +
    "\010\030\012\025\013\024\014\031\016\022\001\002\000" +
    "\004\004\017\001\002\000\004\004\015\001\002\000\004" +
    "\010\016\001\002\000\022\005\ufff9\006\ufff9\007\ufff9\010" +
    "\ufff9\012\ufff9\013\ufff9\014\ufff9\016\ufff9\001\002\000\004" +
    "\010\020\001\002\000\022\005\ufff7\006\ufff7\007\ufff7\010" +
    "\ufff7\012\ufff7\013\ufff7\014\ufff7\016\ufff7\001\002\000\004" +
    "\013\061\001\002\000\004\013\055\001\002\000\004\013" +
    "\052\001\002\000\004\005\051\001\002\000\006\006\045" +
    "\013\046\001\002\000\014\002\uffe1\007\042\013\041\014" +
    "\040\017\uffe1\001\002\000\004\017\037\001\002\000\004" +
    "\012\035\001\002\000\006\012\033\013\032\001\002\000" +
    "\006\002\uffe8\017\uffe8\001\002\000\004\007\034\001\002" +
    "\000\006\002\uffdc\017\uffdc\001\002\000\004\013\036\001" +
    "\002\000\006\002\uffe2\017\uffe2\001\002\000\004\002\uffff" +
    "\001\002\000\004\013\044\001\002\000\006\002\uffde\017" +
    "\uffde\001\002\000\004\007\043\001\002\000\006\002\uffec" +
    "\017\uffec\001\002\000\006\002\uffe3\017\uffe3\001\002\000" +
    "\004\013\050\001\002\000\010\002\uffeb\005\047\017\uffeb" +
    "\001\002\000\006\002\uffdd\017\uffdd\001\002\000\006\002" +
    "\uffe9\017\uffe9\001\002\000\006\002\uffe0\017\uffe0\001\002" +
    "\000\010\002\uffdf\014\053\017\uffdf\001\002\000\004\013" +
    "\054\001\002\000\006\002\uffea\017\uffea\001\002\000\012" +
    "\002\uffe5\005\057\014\056\017\uffe5\001\002\000\004\007" +
    "\060\001\002\000\006\002\uffe7\017\uffe7\001\002\000\006" +
    "\002\uffe4\017\uffe4\001\002\000\006\002\uffe6\017\uffe6\001" +
    "\002\000\004\010\063\001\002\000\022\005\ufffb\006\ufffb" +
    "\007\ufffb\010\ufffb\012\ufffb\013\ufffb\014\ufffb\016\ufffb\001" +
    "\002\000\004\004\076\001\002\000\004\004\074\001\002" +
    "\000\004\004\072\001\002\000\004\004\070\001\002\000" +
    "\004\010\071\001\002\000\022\005\ufff4\006\ufff4\007\ufff4" +
    "\010\ufff4\012\ufff4\013\ufff4\014\ufff4\016\ufff4\001\002\000" +
    "\004\010\073\001\002\000\022\005\ufff5\006\ufff5\007\ufff5" +
    "\010\ufff5\012\ufff5\013\ufff5\014\ufff5\016\ufff5\001\002\000" +
    "\004\010\075\001\002\000\022\005\ufffa\006\ufffa\007\ufffa" +
    "\010\ufffa\012\ufffa\013\ufffa\014\ufffa\016\ufffa\001\002\000" +
    "\004\010\077\001\002\000\022\005\ufff8\006\ufff8\007\ufff8" +
    "\010\ufff8\012\ufff8\013\ufff8\014\ufff8\016\ufff8\001\002\000" +
    "\004\010\101\001\002\000\022\005\ufff6\006\ufff6\007\ufff6" +
    "\010\ufff6\012\ufff6\013\ufff6\014\ufff6\016\ufff6\001\002\000" +
    "\004\002\001\001\002\000\014\011\110\020\104\021\106" +
    "\022\107\023\111\001\002\000\004\010\122\001\002\000" +
    "\022\005\026\006\023\007\021\010\030\012\025\013\024" +
    "\014\031\016\022\001\002\000\004\010\120\001\002\000" +
    "\006\005\116\010\117\001\002\000\022\005\ufff3\006\ufff3" +
    "\007\ufff3\010\ufff3\012\ufff3\013\ufff3\014\ufff3\016\ufff3\001" +
    "\002\000\006\005\114\010\115\001\002\000\022\005\026" +
    "\006\023\007\021\010\030\012\025\013\024\014\031\016" +
    "\022\001\002\000\004\002\ufffd\001\002\000\022\005\uffed" +
    "\006\uffed\007\uffed\010\uffed\012\uffed\013\uffed\014\uffed\016" +
    "\uffed\001\002\000\022\005\uffef\006\uffef\007\uffef\010\uffef" +
    "\012\uffef\013\uffef\014\uffef\016\uffef\001\002\000\022\005" +
    "\uffee\006\uffee\007\uffee\010\uffee\012\uffee\013\uffee\014\uffee" +
    "\016\uffee\001\002\000\022\005\ufff0\006\ufff0\007\ufff0\010" +
    "\ufff0\012\ufff0\013\ufff0\014\ufff0\016\ufff0\001\002\000\022" +
    "\005\ufff1\006\ufff1\007\ufff1\010\ufff1\012\ufff1\013\ufff1\014" +
    "\ufff1\016\ufff1\001\002\000\004\002\ufffc\001\002\000\022" +
    "\005\ufff2\006\ufff2\007\ufff2\010\ufff2\012\ufff2\013\ufff2\014" +
    "\ufff2\016\ufff2\001\002\000\022\005\026\006\023\007\021" +
    "\010\030\012\025\013\024\014\031\016\022\001\002\000" +
    "\022\005\026\006\023\007\021\010\030\012\025\013\024" +
    "\014\031\016\022\001\002\000\004\002\000\001\002\000" +
    "\004\002\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\124\000\006\002\005\003\011\001\001\000\006\004" +
    "\123\005\122\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\006\026\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\004\111\005" +
    "\104\001\001\000\002\001\001\000\004\006\120\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\006\112\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\125\001\001\000\004\006\124\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
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
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
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

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // COMPLEMENT ::= Conector Article Time_Expression 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPLEMENT",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // COMPLEMENT ::= Article Noun Adverb 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPLEMENT",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // COMPLEMENT ::= Adverb Noun 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPLEMENT",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // COMPLEMENT ::= Adjective Noun 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPLEMENT",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // COMPLEMENT ::= Noun Adverb 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPLEMENT",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // COMPLEMENT ::= Adverb 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPLEMENT",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // COMPLEMENT ::= Verb Article Noun 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPLEMENT",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // COMPLEMENT ::= Adverb Conector Noun 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPLEMENT",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // COMPLEMENT ::= Possessive_Pronoun Noun Conector Time_Expression 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPLEMENT",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // COMPLEMENT ::= Possessive_Pronoun Noun 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPLEMENT",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // COMPLEMENT ::= Time_Expression Noun 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPLEMENT",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // COMPLEMENT ::= Possessive_Pronoun Noun Adverb 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPLEMENT",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // COMPLEMENT ::= Conector Noun 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPLEMENT",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // COMPLEMENT ::= Article Adjective Noun 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPLEMENT",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // COMPLEMENT ::= Adjective Noun Conector Noun 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPLEMENT",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // COMPLEMENT ::= Article Noun 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPLEMENT",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // COMPLEMENT ::= Adverb Time_Expression Time_Expression 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMPLEMENT",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // FS ::= Auxiliary_Future_Negative Adverb 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FS",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // FS ::= Auxiliary_Future Adverb 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FS",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // FS ::= Auxiliary_Future_Negative Verb 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FS",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // FS ::= Auxiliary_Future Verb 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FS",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // PS ::= Auxiliary_Past Verb 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PS",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // PS ::= Auxiliary_Past_Negative Verb 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PS",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // PS ::= Verb_Past 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PS",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // QUESTIONS ::= Interrogative_Pronoun Auxiliary_Future_Negative Subject Verb 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("QUESTIONS",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // QUESTIONS ::= Interrogative_Pronoun Auxiliary_Future Subject Verb 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("QUESTIONS",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // QUESTIONS ::= Auxiliary_Future_Negative Subject Verb 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("QUESTIONS",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // QUESTIONS ::= Auxiliary_Future Subject Verb 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("QUESTIONS",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // QUESTIONS ::= Interrogative_Pronoun Auxiliary_Past_Negative Subject Verb 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("QUESTIONS",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // QUESTIONS ::= Auxiliary_Past_Negative Subject Verb 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("QUESTIONS",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // QUESTIONS ::= Interrogative_Pronoun Auxiliary_Past Subject Verb 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("QUESTIONS",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // QUESTIONS ::= Auxiliary_Past Subject Verb 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("QUESTIONS",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // INICIO ::= Article Noun FS COMPLEMENT 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // INICIO ::= Article Noun PS COMPLEMENT 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INICIO ::= Subject FS COMPLEMENT 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= QUESTIONS COMPLEMENT Question_Mark 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= Subject PS COMPLEMENT 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
