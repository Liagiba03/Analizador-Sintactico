package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%
I | Kevin | you | Shakespeare | Aristotle |
They | It
{lexeme=yytext(); return Subject;}
well | tomorrow | home | never {lexeme=yytext(); return Adverb;}
many | Greek | elect {lexeme=yytext(); return Adjective;}
last | night | this | next | month {lexeme=yytext(); return Time_Expression;}
sleep| like| enjoy| go| repair | snow | begin | be | guess {lexeme=yytext(); return Verb;}
wrote | was {lexeme=yytext(); return Verb_Past;}
the | a {lexeme=yytext(); return Article;}
game | weekend | plays | sonnets | philosopher |
vacation | TV | period | answer | president | dinner {lexeme=yytext(); return Noun;}
and | until | on | for {lexeme=yytext(); return Conector;}
Where {lexeme=yytext(); return Interrogative_Pronoun;}
my | his {lexeme=yytext(); return Possessive_Pronoun;}
{espacio} {/*Ignore*/}
"?" {lexeme=yytext(); return Question_Mark;}
"didn´t" {lexeme=yytext(); return Auxiliary_Past_Negative;}
Did | did {lexeme=yytext(); return Auxiliary_Past;}
"will" {lexeme=yytext(); return Auxiliary_Future;}
"won´t" {lexeme=yytext(); return Auxiliary_Future_Negative;}
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}
