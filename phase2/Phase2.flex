package com.phase1;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;

class MainClass{      								
public static void main(String[] args) {
        FileReader filereader = null;
        String input = "testcase.txt";
        try {
            filereader = new FileReader(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
System.out.println("Lexeme \t\t\t Token \t\t\t ");
        Yylex yylex = new Yylex(filereader);
        try {
            yylex.yylex();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

%%

%byaccj

 SINGLE_QUOTE_KW = "\u0027"
 BOOLSABET = (true)|(false)
LETTER= [a-zA-Z]
DIGIT= [0-9]
SHENASE = (#)({LETTER}{LETTER} )( {DIGIT}{DIGIT}{DIGIT} )
ADADSABET ={DIGIT}+
REALCONST = {ADADSABET }{DOT_KW}{ADADSABET}
NEWLINE_KW=[\n]
NULL_KW=[\0]
HARF= ({SINGLE_QUOTE_KW}({LETTER}|{DIGIT}){SINGLE_QUOTE_KW}) |([\\]({LETTER}))|([\\]({DIGIT}))                
WHITESPACE = [ \n\t\r]               
COMMENTS = "//".*                             
PROGRAM_KW=(program)
MAIN_KW=(main)
INTEGER_KW=(int)
FLOAT_KW=(float)
CHAR_KW=(char)
BOOLEAN_KW = (boolean)
DOWNTO =(DOWNTO)
TWO_DOTS_KW="\.\."
DOT_KW="\."
RAVIE_KW=(ravie)                 
AGAR_KW=(agar)
ANGAH_KW=(angah)
VAGARNA_KW=(vagarna)
DO_KW=(do)
WHILE_KW=(while) 
WHEN_KW=(when)                    
FOR_KW=(for)
SWITCH_KW=(switch)
GOZINESH_KW=(GOZINESH)
EXIT_KW=(exit)
END_KW=(end)
BAZGASHT_KW=(bazgasht)
UPTO=(upto)
               
UPTO_KW= "["                   
DOWNTO_KW="]"
LP_KW="("
RP_KW=[)]
LCB_KW=[{]
RCB_KW=[}]

SEMICOLON_KW=[;]
COLON_KW=[:]
COMMA_KW=[,]

ASS_KW = (:=)

MORED_KW=(mored)                     
AND_KW=(va)
OR_KW=(YA)
NAGHIZ_KW=(naghiz)
DEFAULT_KW=(default)

PLUS_KW =[+]
MINUS_KW =[-]
MUL_KW=[*]
DIV_KW=[/]
MOD_KW=[%]

EQ_KW = [=]
NE_KW = (<>)
LE_KW = (<=)
LT_KW = [<]
GE_KW = (>=)
GT_KW = [>]

%%


{SHENASE} {
return YYParser.SHENASE;
}
{ADADSABET} {
return YYParser.ADADSABET;
}
{HARF} {
return YYParser.HARF;
}
{REALCONST} {
return YYParser.REALCONST;
}
{BOOLSABET} {
return YYParser.BOOLSABET;
}
{NEWLINE_KW} {
return YYParser.NEWLINE_KW;
}
{WHITESPACE} {
return YYParser.WHITESPACE;
}
{COMMENTS} {
return YYParser.COMMENTS;}
{PROGRAM_KW} {return YYParser.PROGRAM_KW;}
{MAIN_KW} {return YYParser.MAIN_KW;}
{INTEGER_KW} {return YYParser.INTEGER_KW;}
{FLOAT_KW} {return YYParser.FLOAT_KW;}
{CHAR_KW} {return YYParser.CHAR_KW;}
{BOOLEAN_KW}  {return YYParser.BOOLEAN_KW;}
{TWO_DOTS_KW} {return YYParser.TWO_DOTS_KW;}
{DOT_KW} {return YYParser.DOT_KW;}
{RAVIE_KW} {return YYParser.RAVIE_KW;}
{AGAR_KW} {return YYParser.AGAR_KW;}
{ANGAH_KW} {return YYParser.ANGAH_KW;}
{VAGARNA_KW} {return YYParser.VAGARNA_KW;}
{DO_KW} {return YYParser.DO_KW;}
{WHILE_KW} {return YYParser.WHILE_KW;}
{WHEN_KW} {return YYParser.WHEN_KW;}
{FOR_KW} {return YYParser.FOR_KW;}
{SWITCH_KW} {return YYParser.SWITCH_KW;}
{END_KW} {return YYParser.END_KW;}
{BAZGASHT_KW} {return YYParser.BAZGASHT_KW;}
{EXIT_KW} {return YYParser.EXIT_KW;}
{UPTO} {return YYParser.UPTO;}
{DOWNTO} {return YYParser.DOWNTO;}


{UPTO_KW} {return YYParser.UPTO_KW;}
{DOWNTO_KW} {return YYParser.DOWNTO_KW;}
{LP_KW} {return YYParser.LP_KW;}
{RP_KW} {return YYParser.RP_KW;}
{LCB_KW} {return YYParser.LCB_KW;}
{RCB_KW} {return YYParser.RCB_KW;}
{SEMICOLON_KW} {return YYParser.SEMICOLON_KW;}
{COLON_KW} {return YYParser.COLON_KW;}
{COMMA_KW} {return YYParser.COMMA_KW;}
{SINGLE_QUOTE_KW} {return YYParser.SINGLE_QUOTE_KW;}
{ASS_KW} {return YYParser.ASS_KW;}
{MORED_KW} {return YYParser.MORED_KW;}
{AND_KW} {return YYParser.AND_KW;}
{OR_KW} {return YYParser.OR_KW;}
{NAGHIZ_KW} {return YYParser.NAGHIZ_KW;}
{PLUS_KW} {return YYParser.PLUS_KW;}
{MINUS_KW} {return YYParser.MINUS_KW;}
{MUL_KW} {return YYParser.MUL_KW;}
{DIV_KW} {return YYParser.DIV_KW;}
{MOD_KW} {return YYParser.MOD_KW;}
{EQ_KW} {return YYParser.EQ_KW;}
{NE_KW} {return YYParser.NE_KW;}
{LE_KW} {return YYParser.LE_KW;}
{LT_KW} {return YYParser.LT_KW;}
{GE_KW} {return YYParser.GE_KW;}
{GT_KW} {return YYParser.GT_KW;}
{NULL_KW} {return YYParser.NULL_KW;}
{DEFAULT_KW} {return YYParser.DEFAULT_KW;}


"\s"|"\n"|"\r"|"\t" {
}
. {
}








