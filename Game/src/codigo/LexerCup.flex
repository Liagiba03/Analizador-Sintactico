package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    public Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    public Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%
I | Kevin | you | Shakespeare | Aristotle |
They | It | elect
{return new Symbol(sym.Subject, yychar, yyline, yytext());}
well | tomorrow | home | never {return new Symbol(sym.Adverb, yychar, yyline, yytext());}
many | Greek | elect {return new Symbol(sym.Adjective, yychar, yyline, yytext());}
last | night | this | next | month {return new Symbol(sym.Time_Expression, yychar, yyline, yytext());}
sleep| like| enjoy| go| repair | snow | begin | be | guess {return new Symbol(sym.Verb, yychar, yyline, yytext());}
wrote | was {return new Symbol(sym.Verb_Past, yychar, yyline, yytext());}
the | a {return new Symbol(sym.Article, yychar, yyline, yytext());}
game | weekend | plays | sonnets | philosopher |
vacation | TV | period | answer | president | dinner {return new Symbol(sym.Noun, yychar, yyline, yytext());}
and | until | on | for {return new Symbol(sym.Conector, yychar, yyline, yytext());}
Where {return new Symbol(sym.Interrogative_Pronoun, yychar, yyline, yytext());}
my | his {return new Symbol(sym.Possessive_Pronoun, yychar, yyline, yytext());}
{espacio} {/*Ignore*/}
"?" {return new Symbol(sym.Question_Mark, yychar, yyline, yytext());}
"didn´t" {return new Symbol(sym.Auxiliary_Past_Negative, yychar, yyline, yytext());}
Did | did {return new Symbol(sym.Auxiliary_Past, yychar, yyline, yytext());}
"will" {return new Symbol(sym.Auxiliary_Future, yychar, yyline, yytext());}
"won´t" {return new Symbol(sym.Auxiliary_Future_Negative, yychar, yyline, yytext());}
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
