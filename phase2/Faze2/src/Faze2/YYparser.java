/* A Bison parser, made by GNU Bison 2.5.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java

      Copyright (C) 2007-2011 Free Software Foundation, Inc.

   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* First part of user declarations.  */

/* Line 32 of lalr1.java  */
/* Line 1 of "parser.y"  */

package Faze2;
import java.io.*;


/**
 * A Bison parser, automatically generated from <tt>parser.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
class YYParser
{
    /** Version number for the Bison executable that generated this parser.  */
    public static final String bisonVersion = "2.5";

    /** Name of the skeleton that generated this parser.  */
    public static final String bisonSkeleton = "lalr1.java";


    /** True if verbose error messages are enabled.  */
    public boolean errorVerbose = false;



    /** Token returned by the scanner to signal the end of its input.  */
    public static final int EOF = 0;

/* Tokens.  */
    /** Token number, to be returned by the scanner.  */
    public static final int UPTO = 258;
    /** Token number, to be returned by the scanner.  */
    public static final int DOWNTO = 259;
    /** Token number, to be returned by the scanner.  */
    public static final int EXIT_KW = 260;
    /** Token number, to be returned by the scanner.  */
    public static final int SINGLE_QUOTE_KW = 261;
    /** Token number, to be returned by the scanner.  */
    public static final int BOOLSABET = 262;
    /** Token number, to be returned by the scanner.  */
    public static final int LETTER = 263;
    /** Token number, to be returned by the scanner.  */
    public static final int DIGIT = 264;
    /** Token number, to be returned by the scanner.  */
    public static final int SHENASE = 265;
    /** Token number, to be returned by the scanner.  */
    public static final int ADADSABET = 266;
    /** Token number, to be returned by the scanner.  */
    public static final int REALCONST = 267;
    /** Token number, to be returned by the scanner.  */
    public static final int NEWLINE_KW = 268;
    /** Token number, to be returned by the scanner.  */
    public static final int NULL_KW = 269;
    /** Token number, to be returned by the scanner.  */
    public static final int HARF = 270;
    /** Token number, to be returned by the scanner.  */
    public static final int WHITESPACE = 271;
    /** Token number, to be returned by the scanner.  */
    public static final int COMMENTS = 272;
    /** Token number, to be returned by the scanner.  */
    public static final int PROGRAM_KW = 273;
    /** Token number, to be returned by the scanner.  */
    public static final int MAIN_KW = 274;
    /** Token number, to be returned by the scanner.  */
    public static final int INTEGER_KW = 275;
    /** Token number, to be returned by the scanner.  */
    public static final int FLOAT_KW = 276;
    /** Token number, to be returned by the scanner.  */
    public static final int CHAR_KW = 277;
    /** Token number, to be returned by the scanner.  */
    public static final int BOOLEAN_KW = 278;
    /** Token number, to be returned by the scanner.  */
    public static final int TWO_DOTS_KW = 279;
    /** Token number, to be returned by the scanner.  */
    public static final int DOT_KW = 280;
    /** Token number, to be returned by the scanner.  */
    public static final int RAVIE_KW = 281;
    /** Token number, to be returned by the scanner.  */
    public static final int AGAR_KW = 282;
    /** Token number, to be returned by the scanner.  */
    public static final int ANGAH_KW = 283;
    /** Token number, to be returned by the scanner.  */
    public static final int VAGARNA_KW = 284;
    /** Token number, to be returned by the scanner.  */
    public static final int DO_KW = 285;
    /** Token number, to be returned by the scanner.  */
    public static final int WHILE_KW = 286;
    /** Token number, to be returned by the scanner.  */
    public static final int WHEN_KW = 287;
    /** Token number, to be returned by the scanner.  */
    public static final int FOR_KW = 288;
    /** Token number, to be returned by the scanner.  */
    public static final int SWITCH_KW = 289;
    /** Token number, to be returned by the scanner.  */
    public static final int GOZINESH_KW = 290;
    /** Token number, to be returned by the scanner.  */
    public static final int END_KW = 291;
    /** Token number, to be returned by the scanner.  */
    public static final int BAZGASHT_KW = 292;
    /** Token number, to be returned by the scanner.  */
    public static final int UPTO_KW = 293;
    /** Token number, to be returned by the scanner.  */
    public static final int DOWNTO_KW = 294;
    /** Token number, to be returned by the scanner.  */
    public static final int LP_KW = 295;
    /** Token number, to be returned by the scanner.  */
    public static final int RP_KW = 296;
    /** Token number, to be returned by the scanner.  */
    public static final int LCB_KW = 297;
    /** Token number, to be returned by the scanner.  */
    public static final int RCB_KW = 298;
    /** Token number, to be returned by the scanner.  */
    public static final int SEMICOLON_KW = 299;
    /** Token number, to be returned by the scanner.  */
    public static final int COLON_KW = 300;
    /** Token number, to be returned by the scanner.  */
    public static final int COMMA_KW = 301;
    /** Token number, to be returned by the scanner.  */
    public static final int ASS_KW = 302;
    /** Token number, to be returned by the scanner.  */
    public static final int MORED_KW = 303;
    /** Token number, to be returned by the scanner.  */
    public static final int AND_KW = 304;
    /** Token number, to be returned by the scanner.  */
    public static final int OR_KW = 305;
    /** Token number, to be returned by the scanner.  */
    public static final int NAGHIZ_KW = 306;
    /** Token number, to be returned by the scanner.  */
    public static final int DEFAULT_KW = 307;
    /** Token number, to be returned by the scanner.  */
    public static final int PLUS_KW = 308;
    /** Token number, to be returned by the scanner.  */
    public static final int MINUS_KW = 309;
    /** Token number, to be returned by the scanner.  */
    public static final int MUL_KW = 310;
    /** Token number, to be returned by the scanner.  */
    public static final int DIV_KW = 311;
    /** Token number, to be returned by the scanner.  */
    public static final int MOD_KW = 312;
    /** Token number, to be returned by the scanner.  */
    public static final int EQ_KW = 313;
    /** Token number, to be returned by the scanner.  */
    public static final int NE_KW = 314;
    /** Token number, to be returned by the scanner.  */
    public static final int LE_KW = 315;
    /** Token number, to be returned by the scanner.  */
    public static final int LT_KW = 316;
    /** Token number, to be returned by the scanner.  */
    public static final int GE_KW = 317;
    /** Token number, to be returned by the scanner.  */
    public static final int GT_KW = 318;





    /**
     * Communication interface between the scanner and the Bison-generated
     * parser <tt>YYParser</tt>.
     */
    public interface Lexer {


        /**
         * Method to retrieve the semantic value of the last scanned token.
         * @return the semantic value of the last scanned token.  */
        Object getLVal ();

        /**
         * Entry point for the scanner.  Returns the token identifier corresponding
         * to the next token and prepares to return the semantic value
         * of the token.
         * @return the token identifier corresponding to the next token. */
        int yylex () throws java.io.IOException;

        /**
         * Entry point for error reporting.  Emits an error
         * in a user-defined way.
         *
         *
         * @param s The string for the error message.  */
        void yyerror (String s);
    }

    /** The object doing lexical analysis for us.  */
    private Lexer yylexer;





    /**
     * Instantiates the Bison-generated parser.
     * @param yylexer The scanner that will supply tokens to the parser.
     */
    public YYParser (Lexer yylexer) {
        this.yylexer = yylexer;

    }

    private java.io.PrintStream yyDebugStream = System.err;

    /**
     * Return the <tt>PrintStream</tt> on which the debugging output is
     * printed.
     */
    public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

    /**
     * Set the <tt>PrintStream</tt> on which the debug output is printed.
     * @param s The stream that is used for debugging output.
     */
    public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

    private int yydebug = 0;

    /**
     * Answer the verbosity of the debugging output; 0 means that all kinds of
     * output from the parser are suppressed.
     */
    public final int getDebugLevel() { return yydebug; }

    /**
     * Set the verbosity of the debugging output; 0 means that all kinds of
     * output from the parser are suppressed.
     * @param level The verbosity level for debugging output.
     */
    public final void setDebugLevel(int level) { yydebug = level; }

    private final int yylex () throws java.io.IOException {
        return yylexer.yylex ();
    }
    protected final void yyerror (String s) {
        yylexer.yyerror (s);
    }



    protected final void yycdebug (String s) {
        if (yydebug > 0)
            yyDebugStream.println (s);
    }

    private final class YYStack {
        private int[] stateStack = new int[16];

        private Object[] valueStack = new Object[16];

        public int size = 16;
        public int height = -1;

        public final void push (int state, Object value			    ) {
            height++;
            if (size == height)
            {
                int[] newStateStack = new int[size * 2];
                System.arraycopy (stateStack, 0, newStateStack, 0, height);
                stateStack = newStateStack;


                Object[] newValueStack = new Object[size * 2];
                System.arraycopy (valueStack, 0, newValueStack, 0, height);
                valueStack = newValueStack;

                size *= 2;
            }

            stateStack[height] = state;

            valueStack[height] = value;
        }

        public final void pop () {
            pop (1);
        }

        public final void pop (int num) {
            // Avoid memory leaks... garbage collection is a white lie!
            if (num > 0) {
                java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);

            }
            height -= num;
        }

        public final int stateAt (int i) {
            return stateStack[height - i];
        }

        public final Object valueAt (int i) {
            return valueStack[height - i];
        }

        // Print the state stack on the debug stream.
        public void print (java.io.PrintStream out)
        {
            out.print ("Stack now");

            for (int i = 0; i <= height; i++)
            {
                out.print (' ');
                out.print (stateStack[i]);
            }
            out.println ();
        }
    }

    /**
     * Returned by a Bison action in order to stop the parsing process and
     * return success (<tt>true</tt>).  */
    public static final int YYACCEPT = 0;

    /**
     * Returned by a Bison action in order to stop the parsing process and
     * return failure (<tt>false</tt>).  */
    public static final int YYABORT = 1;

    /**
     * Returned by a Bison action in order to start error recovery without
     * printing an error message.  */
    public static final int YYERROR = 2;

    // Internal return codes that are not supported for user semantic
    // actions.
    private static final int YYERRLAB = 3;
    private static final int YYNEWSTATE = 4;
    private static final int YYDEFAULT = 5;
    private static final int YYREDUCE = 6;
    private static final int YYERRLAB1 = 7;
    private static final int YYRETURN = 8;

    private int yyerrstatus_ = 0;

    /**
     * Return whether error recovery is being done.  In this state, the parser
     * reads token until it reaches a known state, and then restarts normal
     * operation.  */
    public final boolean recovering ()
    {
        return yyerrstatus_ == 0;
    }

    private int yyaction (int yyn, YYStack yystack, int yylen)
    {
        Object yyval;


    /* If YYLEN is nonzero, implement the default value of the action:
       `$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
        if (yylen > 0)
            yyval = yystack.valueAt (yylen - 1);
        else
            yyval = yystack.valueAt (0);

        yy_reduce_print (yyn, yystack);

        switch (yyn)
        {
            case 2:
                if (yyn == 2)

/* Line 351 of lalr1.java  */
/* Line 62 of "parser.y"  */
                {
                    System.out.println("RULE 1.1 :PROGRAM_KW SHENASE declarations_list list_ravie main_KW block");};
                break;


            case 3:
                if (yyn == 3)

/* Line 351 of lalr1.java  */
/* Line 65 of "parser.y"  */
                {
                    System.out.println("RULE 2.1 : declarations");};
                break;


            case 4:
                if (yyn == 4)

/* Line 351 of lalr1.java  */
/* Line 67 of "parser.y"  */
                {
                    System.out.println("RULE 2.2 : declarations_list declarations");};
                break;


            case 5:
                if (yyn == 5)

/* Line 351 of lalr1.java  */
/* Line 71 of "parser.y"  */
                {
                    System.out.println("RULE 3.1 : taeen_type declarator_list SEMICOLON_KW");};
                break;


            case 6:
                if (yyn == 6)

/* Line 351 of lalr1.java  */
/* Line 76 of "parser.y"  */
                {System.out.println("RULE 4.1 : INTEGER_KW");};
                break;


            case 7:
                if (yyn == 7)

/* Line 351 of lalr1.java  */
/* Line 77 of "parser.y"  */
                {System.out.println("RULE 4.2 : FLOAT_KW");};
                break;


            case 8:
                if (yyn == 8)

/* Line 351 of lalr1.java  */
/* Line 78 of "parser.y"  */
                {System.out.println("RULE 4.3 : CHAR_KW");};
                break;


            case 9:
                if (yyn == 9)

/* Line 351 of lalr1.java  */
/* Line 79 of "parser.y"  */
                {System.out.println("RULE 4.4 : BOOLEAN_KW");};
                break;


            case 10:
                if (yyn == 10)

/* Line 351 of lalr1.java  */
/* Line 81 of "parser.y"  */
                {
                    System.out.println("RULE 5.1 : declarator");};
                break;


            case 11:
                if (yyn == 11)

/* Line 351 of lalr1.java  */
/* Line 83 of "parser.y"  */
                {
                    System.out.println("RULE 5.2 : declarator_list COMMA_KW declarator");};
                break;


            case 12:
                if (yyn == 12)

/* Line 351 of lalr1.java  */
/* Line 87 of "parser.y"  */
                {System.out.println("RULE 6.1 : dec");};
                break;


            case 13:
                if (yyn == 13)

/* Line 351 of lalr1.java  */
/* Line 88 of "parser.y"  */
                {
                    System.out.println("RULE 6.2 : dec ASS_KW meghdar_avalie");};
                break;


            case 14:
                if (yyn == 14)

/* Line 351 of lalr1.java  */
/* Line 91 of "parser.y"  */
                {System.out.println("RULE 7.1 : SHENASE ");};
                break;


            case 15:
                if (yyn == 15)

/* Line 351 of lalr1.java  */
/* Line 92 of "parser.y"  */
                {System.out.println("RULE 7.2 : SHENASE UPTO_KW range DOWNTO_KW");};
                break;


            case 16:
                if (yyn == 16)

/* Line 351 of lalr1.java  */
/* Line 93 of "parser.y"  */
                {System.out.println("RULE 7.3 : SHENASE UPTO_KW ADADSABET DOWNTO_KW");};
                break;


            case 17:
                if (yyn == 17)

/* Line 351 of lalr1.java  */
/* Line 95 of "parser.y"  */
                {
                    System.out.println("RULE 8.1 : SHENASE TWO_DOTS_KW SHENASE");};
                break;


            case 18:
                if (yyn == 18)

/* Line 351 of lalr1.java  */
/* Line 97 of "parser.y"  */
                {
                    System.out.println("RULE 8.2 : ADADSABET TWO_DOTS_KW ADADSABET ");};
                break;


            case 19:
                if (yyn == 19)

/* Line 351 of lalr1.java  */
/* Line 99 of "parser.y"  */
                {
                    System.out.println("RULE 8.3 : ebarat_riazi TWO_DOTS_KW ebarat_riazi ");};
                break;


            case 20:
                if (yyn == 20)

/* Line 351 of lalr1.java  */
/* Line 102 of "parser.y"  */
                {
                    System.out.println("RULE 9.1 : ebarat_sabet ");};
                break;


            case 21:
                if (yyn == 21)

/* Line 351 of lalr1.java  */
/* Line 104 of "parser.y"  */
                {System.out.println("RULE 9.2 : LCB_KW list_meghdar_avalie RCB_KW ");};
                break;


            case 22:
                if (yyn == 22)

/* Line 351 of lalr1.java  */
/* Line 106 of "parser.y"  */
                {
                    System.out.println("RULE 10.1 : ebarat_sabet COMMA_KW list_meghdar_avalie ");};
                break;


            case 23:
                if (yyn == 23)

/* Line 351 of lalr1.java  */
/* Line 108 of "parser.y"  */
                {System.out.println("RULE 10.2 : ebarat_sabet ");};
                break;


            case 24:
                if (yyn == 24)

/* Line 351 of lalr1.java  */
/* Line 110 of "parser.y"  */
                {
                    System.out.println("RULE 11.1 : list_ravie ravie ");};
                break;


            case 25:
                if (yyn == 25)

/* Line 351 of lalr1.java  */
/* Line 112 of "parser.y"  */
                {System.out.println("RULE 11.2 : epsilon ");};
                break;


            case 26:
                if (yyn == 26)

/* Line 351 of lalr1.java  */
/* Line 114 of "parser.y"  */
                {
                    System.out.println("RULE 12.1 : ravie_KW SHENASE parameters LCB_KW declarations_list block RCB_KW SEMICOLON_KW ");};
                break;


            case 27:
                if (yyn == 27)

/* Line 351 of lalr1.java  */
/* Line 117 of "parser.y"  */
                {System.out.println("RULE 13.1 : LP_KW declarations_list RP_KW ");};
                break;


            case 28:
                if (yyn == 28)

/* Line 351 of lalr1.java  */
/* Line 119 of "parser.y"  */
                {System.out.println("RULE 14.1 : LCB_KW statement_list RCB_KW ");};
                break;


            case 29:
                if (yyn == 29)

/* Line 351 of lalr1.java  */
/* Line 121 of "parser.y"  */
                {System.out.println("RULE 15.1 : statement SEMICOLON_KW");};
                break;


            case 30:
                if (yyn == 30)

/* Line 351 of lalr1.java  */
/* Line 122 of "parser.y"  */
                {System.out.println("RULE 15.2 : statement_list statement SEMICOLON_KW");};
                break;


            case 31:
                if (yyn == 31)

/* Line 351 of lalr1.java  */
/* Line 126 of "parser.y"  */
                {
                    System.out.println("RULE 16.1 : SHENASE ASS_KW ebarat");};
                break;


            case 33:
                if (yyn == 33)

/* Line 351 of lalr1.java  */
/* Line 130 of "parser.y"  */
                {System.out.println("RULE 16.2 : AGAR_KW ebarat_bool ANGAH_KW statement VAGARNA_KW statement");};
                break;


            case 34:
                if (yyn == 34)

/* Line 351 of lalr1.java  */
/* Line 131 of "parser.y"  */
                {System.out.println("RULE 16.3 : DO_KW statement WHILE_KW ebarat_bool");};
                break;


            case 35:
                if (yyn == 35)

/* Line 351 of lalr1.java  */
/* Line 132 of "parser.y"  */
                {System.out.println("RULE 16.4 : FOR_KW SHENASE ASS_KW counter DO_KW statement");};
                break;


            case 36:
                if (yyn == 36)

/* Line 351 of lalr1.java  */
/* Line 133 of "parser.y"  */
                {System.out.println("RULE 16.5 : GOZINESH_KW ebarat onsor_mored default END_KW ");};
                break;


            case 37:
                if (yyn == 37)

/* Line 351 of lalr1.java  */
/* Line 134 of "parser.y"  */
                {System.out.println("RULE 16.6 : SHENASE LP_KW arguments_list RP_KW");};
                break;


            case 38:
                if (yyn == 38)

/* Line 351 of lalr1.java  */
/* Line 135 of "parser.y"  */
                {System.out.println("RULE 16.7 : SHENASE UPTO_KW ebarat DOWNTO_KW ASS_KW ebarat");};
                break;


            case 39:
                if (yyn == 39)

/* Line 351 of lalr1.java  */
/* Line 136 of "parser.y"  */
                {System.out.println("RULE 16.8 : BAZGASHT_KW ebarat");};
                break;


            case 40:
                if (yyn == 40)

/* Line 351 of lalr1.java  */
/* Line 137 of "parser.y"  */
                {System.out.println("RULE 16.9 : EXIT_KW WHEN_KW ebarat_bool");};
                break;


            case 41:
                if (yyn == 41)

/* Line 351 of lalr1.java  */
/* Line 138 of "parser.y"  */
                {System.out.println("RULE 16.10 : block");};
                break;


            case 42:
                if (yyn == 42)

/* Line 351 of lalr1.java  */
/* Line 139 of "parser.y"  */
                {System.out.println("RULE 16.11 : epsilon");};
                break;


            case 43:
                if (yyn == 43)

/* Line 351 of lalr1.java  */
/* Line 143 of "parser.y"  */
                {System.out.println("RULE 17.1 : multi_arguments");};
                break;


            case 44:
                if (yyn == 44)

/* Line 351 of lalr1.java  */
/* Line 145 of "parser.y"  */
                {System.out.println("RULE 17.3 : epsilon");};
                break;


            case 45:
                if (yyn == 45)

/* Line 351 of lalr1.java  */
/* Line 148 of "parser.y"  */
                {System.out.println("RULE 18.1 : multi_arguments COMMA_KW ebarat");};
                break;


            case 46:
                if (yyn == 46)

/* Line 351 of lalr1.java  */
/* Line 150 of "parser.y"  */
                {System.out.println("RULE 18.2 : ebarat");};
                break;


            case 47:
                if (yyn == 47)

/* Line 351 of lalr1.java  */
/* Line 153 of "parser.y"  */
                {System.out.println("RULE 19.1 : ADADSABET UPTO ADADSABET");};
                break;


            case 48:
                if (yyn == 48)

/* Line 351 of lalr1.java  */
/* Line 155 of "parser.y"  */
                {System.out.println("RULE 19.2 : ADADSABET DOWNTO ADADSABET");};
                break;


            case 49:
                if (yyn == 49)

/* Line 351 of lalr1.java  */
/* Line 159 of "parser.y"  */
                {System.out.println("RULE 20 : MORED_KW ADADSABET COLON_KW block");};
                break;


            case 50:
                if (yyn == 50)

/* Line 351 of lalr1.java  */
/* Line 161 of "parser.y"  */
                {System.out.println("RULE 20 : onsor_mored MORED_KW ADADSABET COLON_KW block");};
                break;


            case 51:
                if (yyn == 51)

/* Line 351 of lalr1.java  */
/* Line 164 of "parser.y"  */
                {System.out.println("RULE 21 : default_KW colon block");};
                break;


            case 52:
                if (yyn == 52)

/* Line 351 of lalr1.java  */
/* Line 166 of "parser.y"  */
                {System.out.println("RULE 21.2 : epsilon");};
                break;


            case 53:
                if (yyn == 53)

/* Line 351 of lalr1.java  */
/* Line 169 of "parser.y"  */
                {System.out.println("RULE 22.1 : ebarat_sabet");};
                break;


            case 54:
                if (yyn == 54)

/* Line 351 of lalr1.java  */
/* Line 171 of "parser.y"  */
                {System.out.println("RULE 22.2 : ebarat_bool");};
                break;


            case 55:
                if (yyn == 55)

/* Line 351 of lalr1.java  */
/* Line 173 of "parser.y"  */
                {System.out.println("RULE 22.3 : ebarat_riazi");};
                break;


            case 56:
                if (yyn == 56)

/* Line 351 of lalr1.java  */
/* Line 175 of "parser.y"  */
                {System.out.println("RULE 22.4 : SHENASE");};
                break;


            case 57:
                if (yyn == 57)

/* Line 351 of lalr1.java  */
/* Line 177 of "parser.y"  */
                {System.out.println("RULE 22.5 : SHENASE UPTO_KW ebarat DOWNTO_KW ");};
                break;


            case 58:
                if (yyn == 58)

/* Line 351 of lalr1.java  */
/* Line 179 of "parser.y"  */
                {System.out.println("RULE 22.6 : SHENASE LP_KW arguments_list RP_KW");};
                break;


            case 59:
                if (yyn == 59)

/* Line 351 of lalr1.java  */
/* Line 181 of "parser.y"  */
                {System.out.println("RULE 22.7 : LP_KW ebarat RP_KW");};
                break;


            case 60:
                if (yyn == 60)

/* Line 351 of lalr1.java  */
/* Line 184 of "parser.y"  */
                {System.out.println("RULE 23.1 : ADADSABET");};
                break;


            case 61:
                if (yyn == 61)

/* Line 351 of lalr1.java  */
/* Line 185 of "parser.y"  */
                {System.out.println("RULE 23.2 : REALCONST");};
                break;


            case 62:
                if (yyn == 62)

/* Line 351 of lalr1.java  */
/* Line 186 of "parser.y"  */
                {System.out.println("RULE 23.3 : HARF");};
                break;


            case 63:
                if (yyn == 63)

/* Line 351 of lalr1.java  */
/* Line 187 of "parser.y"  */
                {System.out.println("RULE 23.4 : BOOLSABET");};
                break;


            case 64:
                if (yyn == 64)

/* Line 351 of lalr1.java  */
/* Line 190 of "parser.y"  */
                {System.out.println("RULE 24.1 : zojmoratab AND_KW");};
                break;


            case 65:
                if (yyn == 65)

/* Line 351 of lalr1.java  */
/* Line 192 of "parser.y"  */
                {System.out.println("RULE 24.2.3 : zojmoratab OR_KW");};
                break;


            case 66:
                if (yyn == 66)

/* Line 351 of lalr1.java  */
/* Line 194 of "parser.y"  */
                {System.out.println("RULE 24.4 : zojmoratab AND_KW ANGAH_KW ");};
                break;


            case 67:
                if (yyn == 67)

/* Line 351 of lalr1.java  */
/* Line 196 of "parser.y"  */
                {System.out.println("RULE 24.5 : zojmoratab OR_KW VAGARNA_KW");};
                break;


            case 68:
                if (yyn == 68)

/* Line 351 of lalr1.java  */
/* Line 198 of "parser.y"  */
                {System.out.println("RULE 24.6 : zojmoratab LT_KW");};
                break;


            case 69:
                if (yyn == 69)

/* Line 351 of lalr1.java  */
/* Line 200 of "parser.y"  */
                {System.out.println("RULE 24.7 : zojmoratab LE_KW");};
                break;


            case 70:
                if (yyn == 70)

/* Line 351 of lalr1.java  */
/* Line 202 of "parser.y"  */
                {System.out.println("RULE 24.8 : zojmoratab GT_KW");};
                break;


            case 71:
                if (yyn == 71)

/* Line 351 of lalr1.java  */
/* Line 204 of "parser.y"  */
                {System.out.println("RULE 24.9 : zojmoratab GE_KW");};
                break;


            case 72:
                if (yyn == 72)

/* Line 351 of lalr1.java  */
/* Line 206 of "parser.y"  */
                {System.out.println("RULE 24.10 : zojmoratab EQ_KW");};
                break;


            case 73:
                if (yyn == 73)

/* Line 351 of lalr1.java  */
/* Line 208 of "parser.y"  */
                {System.out.println("RULE 24.11 : zojmoratab NE_KW");};
                break;


            case 74:
                if (yyn == 74)

/* Line 351 of lalr1.java  */
/* Line 210 of "parser.y"  */
                {System.out.println("RULE 24.12 : ebarat NAGHIZ_KW");};
                break;


            case 75:
                if (yyn == 75)

/* Line 351 of lalr1.java  */
/* Line 213 of "parser.y"  */
                {System.out.println("RULE 25 : zojmoratab PLUS_KW");};
                break;


            case 76:
                if (yyn == 76)

/* Line 351 of lalr1.java  */
/* Line 215 of "parser.y"  */
                {System.out.println("RULE 25 : zojmoratab MINUS_KW");};
                break;


            case 77:
                if (yyn == 77)

/* Line 351 of lalr1.java  */
/* Line 217 of "parser.y"  */
                {System.out.println("RULE 25 : zojmoratab MUL_KW");};
                break;


            case 78:
                if (yyn == 78)

/* Line 351 of lalr1.java  */
/* Line 219 of "parser.y"  */
                {System.out.println("RULE 25 : zojmoratab DIV_KW");};
                break;


            case 79:
                if (yyn == 79)

/* Line 351 of lalr1.java  */
/* Line 221 of "parser.y"  */
                {System.out.println("RULE 25 : zojmoratab MOD_KW");};
                break;


            case 80:
                if (yyn == 80)

/* Line 351 of lalr1.java  */
/* Line 223 of "parser.y"  */
                {System.out.println("RULE 25 : MINUS_KW ebarat");};
                break;


            case 81:
                if (yyn == 81)

/* Line 351 of lalr1.java  */
/* Line 226 of "parser.y"  */
                {System.out.println("RULE 26 : LP_KW ebarat comma ebarat RP_KW");};
                break;




/* Line 351 of lalr1.java  */
/* Line 1128 of "parser.java"  */
            default: break;
        }

        yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

        yystack.pop (yylen);
        yylen = 0;

    /* Shift the result of the reduction.  */
        yyn = yyr1_[yyn];
        int yystate = yypgoto_[yyn - yyntokens_] + yystack.stateAt (0);
        if (0 <= yystate && yystate <= yylast_
                && yycheck_[yystate] == yystack.stateAt (0))
            yystate = yytable_[yystate];
        else
            yystate = yydefgoto_[yyn - yyntokens_];

        yystack.push (yystate, yyval);
        return YYNEWSTATE;
    }

    /* Return YYSTR after stripping away unnecessary quotes and
       backslashes, so that it's suitable for yyerror.  The heuristic is
       that double-quoting is unnecessary unless the string contains an
       apostrophe, a comma, or backslash (other than backslash-backslash).
       YYSTR is taken from yytname.  */
    private final String yytnamerr_ (String yystr)
    {
        if (yystr.charAt (0) == '"')
        {
            StringBuffer yyr = new StringBuffer ();
            strip_quotes: for (int i = 1; i < yystr.length (); i++)
                switch (yystr.charAt (i))
                {
                    case '\'':
                    case ',':
                        break strip_quotes;

                    case '\\':
                        if (yystr.charAt(++i) != '\\')
                            break strip_quotes;
              /* Fall through.  */
                    default:
                        yyr.append (yystr.charAt (i));
                        break;

                    case '"':
                        return yyr.toString ();
                }
        }
        else if (yystr.equals ("$end"))
            return "end of input";

        return yystr;
    }

  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

    private void yy_symbol_print (String s, int yytype,
                                  Object yyvaluep				 )
    {
        if (yydebug > 0)
            yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
                    + yytname_[yytype] + " ("
                    + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
    }

    /**
     * Parse input from the scanner that was specified at object construction
     * time.  Return whether the end of the input was reached successfully.
     *
     * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
     *          imply that there were no syntax errors.
     */
    public boolean parse () throws java.io.IOException
    {
        /// Lookahead and lookahead in internal form.
        int yychar = yyempty_;
        int yytoken = 0;

    /* State.  */
        int yyn = 0;
        int yylen = 0;
        int yystate = 0;

        YYStack yystack = new YYStack ();

    /* Error handling.  */
        int yynerrs_ = 0;


        /// Semantic value of the lookahead.
        Object yylval = null;

        int yyresult;

        yycdebug ("Starting parse\n");
        yyerrstatus_ = 0;


    /* Initialize the stack.  */
        yystack.push (yystate, yylval);

        int label = YYNEWSTATE;
        for (;;)
            switch (label)
            {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
	   pushed when we come here.  */
                case YYNEWSTATE:
                    yycdebug ("Entering state " + yystate + "\n");
                    if (yydebug > 0)
                        yystack.print (yyDebugStream);

        /* Accept?  */
                    if (yystate == yyfinal_)
                        return true;

        /* Take a decision.  First try without lookahead.  */
                    yyn = yypact_[yystate];
                    if (yy_pact_value_is_default_ (yyn))
                    {
                        label = YYDEFAULT;
                        break;
                    }

        /* Read a lookahead token.  */
                    if (yychar == yyempty_)
                    {
                        yycdebug ("Reading a token: ");
                        yychar = yylex ();

                        yylval = yylexer.getLVal ();
                    }

        /* Convert token to internal form.  */
                    if (yychar <= EOF)
                    {
                        yychar = yytoken = EOF;
                        yycdebug ("Now at end of input.\n");
                    }
                    else
                    {
                        yytoken = yytranslate_ (yychar);
                        yy_symbol_print ("Next token is", yytoken,
                                yylval);
                    }

        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
                    yyn += yytoken;
                    if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
                        label = YYDEFAULT;

        /* <= 0 means reduce or error.  */
                    else if ((yyn = yytable_[yyn]) <= 0)
                    {
                        if (yy_table_value_is_error_ (yyn))
                            label = YYERRLAB;
                        else
                        {
                            yyn = -yyn;
                            label = YYREDUCE;
                        }
                    }

                    else
                    {
            /* Shift the lookahead token.  */
                        yy_symbol_print ("Shifting", yytoken,
                                yylval);

            /* Discard the token being shifted.  */
                        yychar = yyempty_;

            /* Count tokens shifted since error; after three, turn off error
               status.  */
                        if (yyerrstatus_ > 0)
                            --yyerrstatus_;

                        yystate = yyn;
                        yystack.push (yystate, yylval);
                        label = YYNEWSTATE;
                    }
                    break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
                case YYDEFAULT:
                    yyn = yydefact_[yystate];
                    if (yyn == 0)
                        label = YYERRLAB;
                    else
                        label = YYREDUCE;
                    break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
                case YYREDUCE:
                    yylen = yyr2_[yyn];
                    label = yyaction (yyn, yystack, yylen);
                    yystate = yystack.stateAt (0);
                    break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
                case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
                    if (yyerrstatus_ == 0)
                    {
                        ++yynerrs_;
                        if (yychar == yyempty_)
                            yytoken = yyempty_;
                        yyerror (yysyntax_error (yystate, yytoken));
                    }


                    if (yyerrstatus_ == 3)
                    {
	    /* If just tried and failed to reuse lookahead token after an
	     error, discard it.  */

                        if (yychar <= EOF)
                        {
	      /* Return failure if at end of input.  */
                            if (yychar == EOF)
                                return false;
                        }
                        else
                            yychar = yyempty_;
                    }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
                    label = YYERRLAB1;
                    break;

      /*---------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `---------------------------------------------------*/
                case YYERROR:


        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
                    yystack.pop (yylen);
                    yylen = 0;
                    yystate = yystack.stateAt (0);
                    label = YYERRLAB1;
                    break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
                case YYERRLAB1:
                    yyerrstatus_ = 3;	/* Each real token shifted decrements this.  */

                    for (;;)
                    {
                        yyn = yypact_[yystate];
                        if (!yy_pact_value_is_default_ (yyn))
                        {
                            yyn += yyterror_;
                            if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
                            {
                                yyn = yytable_[yyn];
                                if (0 < yyn)
                                    break;
                            }
                        }

	    /* Pop the current state because it cannot handle the error token.  */
                        if (yystack.height == 1)
                            return false;


                        yystack.pop ();
                        yystate = yystack.stateAt (0);
                        if (yydebug > 0)
                            yystack.print (yyDebugStream);
                    }



        /* Shift the error token.  */
                    yy_symbol_print ("Shifting", yystos_[yyn],
                            yylval);

                    yystate = yyn;
                    yystack.push (yyn, yylval);
                    label = YYNEWSTATE;
                    break;

        /* Accept.  */
                case YYACCEPT:
                    return true;

        /* Abort.  */
                case YYABORT:
                    return false;
            }
    }

    // Generate an error message.
    private String yysyntax_error (int yystate, int tok)
    {
        if (errorVerbose)
        {
        /* There are many possibilities here to consider:
           - Assume YYFAIL is not used.  It's too flawed to consider.
             See
             <http://lists.gnu.org/archive/html/bison-patches/2009-12/msg00024.html>
             for details.  YYERROR is fine as it does not invoke this
             function.
           - If this state is a consistent state with a default action,
             then the only way this function was invoked is if the
             default action is an error action.  In that case, don't
             check for expected tokens because there are none.
           - The only way there can be no lookahead present (in tok) is
             if this state is a consistent state with a default action.
             Thus, detecting the absence of a lookahead is sufficient to
             determine that there is no unexpected or expected token to
             report.  In that case, just report a simple "syntax error".
           - Don't assume there isn't a lookahead just because this
             state is a consistent state with a default action.  There
             might have been a previous inconsistent state, consistent
             state with a non-default action, or user semantic action
             that manipulated yychar.  (However, yychar is currently out
             of scope during semantic actions.)
           - Of course, the expected token list depends on states to
             have correct lookahead information, and it depends on the
             parser not to perform extra reductions after fetching a
             lookahead from the scanner and before detecting a syntax
             error.  Thus, state merging (from LALR or IELR) and default
             reductions corrupt the expected token list.  However, the
             list is correct for canonical LR with one exception: it
             will still contain any token that will not be accepted due
             to an error action in a later state.
        */
            if (tok != yyempty_)
            {
                // FIXME: This method of building the message is not compatible
                // with internationalization.
                StringBuffer res =
                        new StringBuffer ("syntax error, unexpected ");
                res.append (yytnamerr_ (yytname_[tok]));
                int yyn = yypact_[yystate];
                if (!yy_pact_value_is_default_ (yyn))
                {
                /* Start YYX at -YYN if negative to avoid negative
                   indexes in YYCHECK.  In other words, skip the first
                   -YYN actions for this state because they are default
                   actions.  */
                    int yyxbegin = yyn < 0 ? -yyn : 0;
                /* Stay within bounds of both yycheck and yytname.  */
                    int yychecklim = yylast_ - yyn + 1;
                    int yyxend = yychecklim < yyntokens_ ? yychecklim : yyntokens_;
                    int count = 0;
                    for (int x = yyxbegin; x < yyxend; ++x)
                        if (yycheck_[x + yyn] == x && x != yyterror_
                                && !yy_table_value_is_error_ (yytable_[x + yyn]))
                            ++count;
                    if (count < 5)
                    {
                        count = 0;
                        for (int x = yyxbegin; x < yyxend; ++x)
                            if (yycheck_[x + yyn] == x && x != yyterror_
                                    && !yy_table_value_is_error_ (yytable_[x + yyn]))
                            {
                                res.append (count++ == 0 ? ", expecting " : " or ");
                                res.append (yytnamerr_ (yytname_[x]));
                            }
                    }
                }
                return res.toString ();
            }
        }

        return "syntax error";
    }

    /**
     * Whether the given <code>yypact_</code> value indicates a defaulted state.
     * @param yyvalue   the value to check
     */
    private static boolean yy_pact_value_is_default_ (int yyvalue)
    {
        return yyvalue == yypact_ninf_;
    }

    /**
     * Whether the given <code>yytable_</code> value indicates a syntax error.
     * @param yyvalue   the value to check
     */
    private static boolean yy_table_value_is_error_ (int yyvalue)
    {
        return yyvalue == yytable_ninf_;
    }

    /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
       STATE-NUM.  */
    private static final short yypact_ninf_ = -46;
    private static final short yypact_[] =
            {
                    33,     8,    61,   112,   -46,   -46,   -46,   -46,   -46,   112,
                    -46,    76,   -46,     7,    51,    46,   -46,    49,    29,   101,
                    -46,    13,   -46,    76,    20,    75,   -46,    58,    85,    -2,
                    0,     0,    77,    90,    70,   -46,   -46,   -46,   -46,   -46,
                    72,   -46,   -46,    86,     3,     0,    75,   118,     0,     0,
                    -46,    64,    92,   112,   110,   120,   142,   -46,    55,     0,
                    22,   -46,   -46,   -46,    88,   103,   -46,   -15,   -46,   -46,
                    -46,   -46,   -46,   113,   109,     0,     0,     0,     0,   103,
                    129,   127,   114,    30,   103,   -46,   115,   -46,    99,   112,
                    -46,   -46,     0,     0,    24,     0,   -46,   -46,   -46,   -46,
                    -46,   -46,   -46,   -46,   -46,   -46,   -46,    72,   111,   -23,
                    119,   117,   103,   103,    75,     0,   153,   154,   -14,   -46,
                    -46,    35,   -22,   125,   -46,     1,   -46,   121,   -46,     0,
                    -46,   111,    42,   137,   124,   159,   126,   136,   130,   -46,
                    -46,   -46,     0,   103,   163,   164,    75,    29,   131,    29,
                    -46,   133,   103,   -46,   -46,   -46,   -46,    29,   -46,   -46,
                    -46
            };

    /* YYDEFACT[S] -- default reduction number in state S.  Performed when
       YYTABLE doesn't specify something else to do.  Zero means the
       default is an error.  */
    private static final byte yydefact_[] =
            {
                    0,     0,     0,     0,     1,     6,     7,     8,     9,    25,
                    3,     0,     4,     0,    14,     0,    10,    12,     0,     0,
                    24,     0,     5,     0,     0,    42,     2,     0,     0,     0,
                    0,     0,     0,     0,     0,    11,    63,    60,    61,    62,
                    0,    13,    20,     0,     0,     0,    42,     0,     0,     0,
                    41,    42,     0,     0,     0,     0,     0,    16,    56,     0,
                    0,    53,    54,    55,     0,    80,    15,     0,    75,    76,
                    77,    78,    79,     0,    23,     0,     0,    44,     0,     0,
                    54,     0,     0,     0,    39,    28,     0,    29,     0,     0,
                    17,    18,     0,    44,     0,     0,    74,    64,    65,    72,
                    73,    69,    68,    71,    70,    19,    21,     0,    40,     0,
                    0,    43,    46,    31,    42,     0,     0,     0,    52,    30,
                    27,     0,     0,     0,    59,     0,    22,     0,    37,     0,
                    32,    34,     0,     0,     0,     0,     0,     0,     0,    57,
                    58,    81,     0,    45,     0,     0,    42,     0,     0,     0,
                    36,     0,    38,    47,    48,    35,    49,     0,    51,    26,
                    50
            };

    /* YYPGOTO[NTERM-NUM].  */
    private static final short yypgoto_[] =
            {
                    -46,   -46,   -45,    -6,   -46,   -46,   155,   -46,   -46,   -46,
                    73,   -46,   -46,   -46,   -18,   -46,   -42,    89,   -46,   -46,
                    -46,   -46,   -29,   -19,   -39,    -8,    -7
            };

    /* YYDEFGOTO[NTERM-NUM].  */
    private static final short
            yydefgoto_[] =
            {
                    -1,     2,     9,    10,    11,    15,    16,    17,    32,    41,
                    73,    13,    20,    54,    50,    51,    52,   110,   111,   133,
                    118,   137,    79,    61,    62,    63,    64
            };

    /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
       positive, shift that token.  If negative, reduce the rule which
       number is the opposite.  If YYTABLE_NINF_, syntax error.  */
    private static final short yytable_ninf_ = -55;
    private static final short
            yytable_[] =
            {
                    26,    60,    65,    12,    81,    42,    80,    36,    88,    86,
                    58,    37,    38,    33,    34,    39,   127,   139,     3,    83,
                    84,    74,    56,    28,    29,    30,    18,    36,    96,    96,
                    94,    37,    38,    19,   135,    39,   108,    57,   136,    31,
                    59,    76,   141,    77,   121,   144,   145,   109,   112,   113,
                    78,     1,    96,    30,    31,     5,     6,     7,     8,   105,
                    34,     4,    40,   122,   112,   124,   125,    31,    95,    43,
                    95,    25,   130,    96,    44,    96,   131,    25,   117,    36,
                    43,    96,    12,    37,    38,    44,    14,    39,    74,    21,
                    22,    45,    23,    92,    46,    93,    24,    47,    53,    48,
                    143,    49,    45,   138,   155,    46,    25,    85,    47,    55,
                    48,    27,    49,   152,    67,    12,    66,    25,    75,     5,
                    6,     7,     8,    68,    69,    70,    71,    72,    82,   156,
                    90,   158,     5,     6,     7,     8,    87,    97,    98,   160,
                    120,    68,    69,    70,    71,    72,    99,   100,   101,   102,
                    103,   104,    89,    91,    96,   107,   106,   114,   115,   119,
                    128,   116,   -54,   129,   132,   134,   140,   146,   142,   147,
                    148,   149,   150,   151,   153,   154,   157,   159,    35,     0,
                    126,     0,   123
            };

    /* YYCHECK.  */
    private static final short
            yycheck_[] =
            {
                    18,    30,    31,     9,    46,    24,    45,     7,    53,    51,
                    10,    11,    12,    21,    21,    15,    39,    39,    10,    48,
                    49,    40,    24,    10,    11,    40,    19,     7,    51,    51,
                    59,    11,    12,    26,    48,    15,    75,    39,    52,    54,
                    40,    38,    41,    40,    89,     3,     4,    76,    77,    78,
                    47,    18,    51,    40,    54,    20,    21,    22,    23,    67,
                    67,     0,    42,    92,    93,    41,    95,    54,    46,     5,
                    46,    42,   114,    51,    10,    51,   115,    42,    48,     7,
                    5,    51,    88,    11,    12,    10,    10,    15,   107,    38,
                    44,    27,    46,    38,    30,    40,    47,    33,    40,    35,
                    129,    37,    27,   121,   146,    30,    42,    43,    33,    24,
                    35,    10,    37,   142,    24,   121,    39,    42,    32,    20,
                    21,    22,    23,    53,    54,    55,    56,    57,    10,   147,
                    10,   149,    20,    21,    22,    23,    44,    49,    50,   157,
                    41,    53,    54,    55,    56,    57,    58,    59,    60,    61,
                    62,    63,    42,    11,    51,    46,    43,    28,    31,    44,
                    41,    47,    51,    46,    11,    11,    41,    30,    47,    45,
                    11,    45,    36,    43,    11,    11,    45,    44,    23,    -1,
                    107,    -1,    93
            };

    /* STOS_[STATE-NUM] -- The (internal number of the) accessing
       symbol of state STATE-NUM.  */
    private static final byte
            yystos_[] =
            {
                    0,    18,    65,    10,     0,    20,    21,    22,    23,    66,
                    67,    68,    67,    75,    10,    69,    70,    71,    19,    26,
                    76,    38,    44,    46,    47,    42,    78,    10,    10,    11,
                    40,    54,    72,    89,    90,    70,     7,    11,    12,    15,
                    42,    73,    87,     5,    10,    27,    30,    33,    35,    37,
                    78,    79,    80,    40,    77,    24,    24,    39,    10,    40,
                    86,    87,    88,    89,    90,    86,    39,    24,    53,    54,
                    55,    56,    57,    74,    87,    32,    38,    40,    47,    86,
                    88,    80,    10,    86,    86,    43,    80,    44,    66,    42,
                    10,    11,    38,    40,    86,    46,    51,    49,    50,    58,
                    59,    60,    61,    62,    63,    89,    43,    46,    88,    86,
                    81,    82,    86,    86,    28,    31,    47,    48,    84,    44,
                    41,    66,    86,    81,    41,    86,    74,    39,    41,    46,
                    80,    88,    11,    83,    11,    48,    52,    85,    78,    39,
                    41,    41,    47,    86,     3,     4,    30,    45,    11,    45,
                    36,    43,    86,    11,    11,    80,    78,    45,    78,    44,
                    78
            };

    /* TOKEN_NUMBER_[YYLEX-NUM] -- Internal symbol number corresponding
       to YYLEX-NUM.  */
    private static final short
            yytoken_number_[] =
            {
                    0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
                    265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
                    275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
                    285,   286,   287,   288,   289,   290,   291,   292,   293,   294,
                    295,   296,   297,   298,   299,   300,   301,   302,   303,   304,
                    305,   306,   307,   308,   309,   310,   311,   312,   313,   314,
                    315,   316,   317,   318
            };

    /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
    private static final byte
            yyr1_[] =
            {
                    0,    64,    65,    66,    66,    67,    68,    68,    68,    68,
                    69,    69,    70,    70,    71,    71,    71,    72,    72,    72,
                    73,    73,    74,    74,    75,    75,    76,    77,    78,    79,
                    79,    80,    80,    80,    80,    80,    80,    80,    80,    80,
                    80,    80,    80,    81,    81,    82,    82,    83,    83,    84,
                    84,    85,    85,    86,    86,    86,    86,    86,    86,    86,
                    87,    87,    87,    87,    88,    88,    88,    88,    88,    88,
                    88,    88,    88,    88,    88,    89,    89,    89,    89,    89,
                    89,    90
            };

    /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
    private static final byte
            yyr2_[] =
            {
                    0,     2,     6,     1,     2,     3,     1,     1,     1,     1,
                    1,     3,     1,     3,     1,     4,     4,     3,     3,     3,
                    1,     3,     3,     1,     2,     0,     8,     3,     3,     2,
                    3,     3,     4,     6,     4,     6,     5,     4,     6,     2,
                    3,     1,     0,     1,     0,     3,     1,     3,     3,     4,
                    5,     3,     0,     1,     1,     1,     1,     4,     4,     3,
                    1,     1,     1,     1,     2,     2,     3,     3,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     5
            };

    /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
       First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
    private static final String yytname_[] =
            {
                    "$end", "error", "$undefined", "UPTO", "DOWNTO", "EXIT_KW",
                    "SINGLE_QUOTE_KW", "BOOLSABET", "LETTER", "DIGIT", "SHENASE",
                    "ADADSABET", "REALCONST", "NEWLINE_KW", "NULL_KW", "HARF", "WHITESPACE",
                    "COMMENTS", "PROGRAM_KW", "MAIN_KW", "INTEGER_KW", "FLOAT_KW", "CHAR_KW",
                    "BOOLEAN_KW", "TWO_DOTS_KW", "DOT_KW", "RAVIE_KW", "AGAR_KW", "ANGAH_KW",
                    "VAGARNA_KW", "DO_KW", "WHILE_KW", "WHEN_KW", "FOR_KW", "SWITCH_KW",
                    "GOZINESH_KW", "END_KW", "BAZGASHT_KW", "UPTO_KW", "DOWNTO_KW", "LP_KW",
                    "RP_KW", "LCB_KW", "RCB_KW", "SEMICOLON_KW", "COLON_KW", "COMMA_KW",
                    "ASS_KW", "MORED_KW", "AND_KW", "OR_KW", "NAGHIZ_KW", "DEFAULT_KW",
                    "PLUS_KW", "MINUS_KW", "MUL_KW", "DIV_KW", "MOD_KW", "EQ_KW", "NE_KW",
                    "LE_KW", "LT_KW", "GE_KW", "GT_KW", "$accept", "program",
                    "declarations_list", "declarations", "taeen_type", "declarator_list",
                    "declarator", "dec", "range", "meghdar_avalie", "list_meghdar_avalie",
                    "list_ravie", "ravie", "parameters", "block", "statement_list",
                    "statement", "arguments_list", "multi_arguments", "counter",
                    "onsor_mored", "default", "ebarat", "ebarat_sabet", "ebarat_bool",
                    "ebarat_riazi", "zojmoratab", null
            };

    /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
    private static final byte yyrhs_[] =
            {
                    65,     0,    -1,    18,    10,    66,    75,    19,    78,    -1,
                    67,    -1,    66,    67,    -1,    68,    69,    44,    -1,    20,
                    -1,    21,    -1,    22,    -1,    23,    -1,    70,    -1,    69,
                    46,    70,    -1,    71,    -1,    71,    47,    73,    -1,    10,
                    -1,    10,    38,    72,    39,    -1,    10,    38,    11,    39,
                    -1,    10,    24,    10,    -1,    11,    24,    11,    -1,    89,
                    24,    89,    -1,    87,    -1,    42,    74,    43,    -1,    87,
                    46,    74,    -1,    87,    -1,    75,    76,    -1,    -1,    26,
                    10,    77,    42,    66,    78,    43,    44,    -1,    40,    66,
                    41,    -1,    42,    79,    43,    -1,    80,    44,    -1,    79,
                    80,    44,    -1,    10,    47,    86,    -1,    27,    88,    28,
                    80,    -1,    27,    88,    28,    80,    29,    80,    -1,    30,
                    80,    31,    88,    -1,    33,    10,    47,    83,    30,    80,
                    -1,    35,    86,    84,    85,    36,    -1,    10,    40,    81,
                    41,    -1,    10,    38,    86,    39,    47,    86,    -1,    37,
                    86,    -1,     5,    32,    88,    -1,    78,    -1,    -1,    82,
                    -1,    -1,    82,    46,    86,    -1,    86,    -1,    11,     3,
                    11,    -1,    11,     4,    11,    -1,    48,    11,    45,    78,
                    -1,    84,    48,    11,    45,    78,    -1,    52,    45,    78,
                    -1,    -1,    87,    -1,    88,    -1,    89,    -1,    10,    -1,
                    10,    38,    86,    39,    -1,    10,    40,    81,    41,    -1,
                    40,    86,    41,    -1,    11,    -1,    12,    -1,    15,    -1,
                    7,    -1,    90,    49,    -1,    90,    50,    -1,    90,    49,
                    28,    -1,    90,    50,    29,    -1,    90,    61,    -1,    90,
                    60,    -1,    90,    63,    -1,    90,    62,    -1,    90,    58,
                    -1,    90,    59,    -1,    86,    51,    -1,    90,    53,    -1,
                    90,    54,    -1,    90,    55,    -1,    90,    56,    -1,    90,
                    57,    -1,    54,    86,    -1,    40,    86,    46,    86,    41,
                    -1
            };

    /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
       YYRHS.  */
    private static final short yyprhs_[] =
            {
                    0,     0,     3,    10,    12,    15,    19,    21,    23,    25,
                    27,    29,    33,    35,    39,    41,    46,    51,    55,    59,
                    63,    65,    69,    73,    75,    78,    79,    88,    92,    96,
                    99,   103,   107,   112,   119,   124,   131,   137,   142,   149,
                    152,   156,   158,   159,   161,   162,   166,   168,   172,   176,
                    181,   187,   191,   192,   194,   196,   198,   200,   205,   210,
                    214,   216,   218,   220,   222,   225,   228,   232,   236,   239,
                    242,   245,   248,   251,   254,   257,   260,   263,   266,   269,
                    272,   275
            };

    /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
    private static final short yyrline_[] =
            {
                    0,    62,    62,    65,    67,    71,    76,    77,    78,    79,
                    81,    83,    87,    88,    91,    92,    93,    95,    97,    99,
                    102,   104,   106,   108,   110,   112,   114,   117,   119,   121,
                    122,   126,   129,   130,   131,   132,   133,   134,   135,   136,
                    137,   138,   139,   143,   145,   148,   150,   153,   155,   159,
                    161,   164,   166,   169,   171,   173,   175,   177,   179,   181,
                    184,   185,   186,   187,   190,   192,   194,   196,   198,   200,
                    202,   204,   206,   208,   210,   213,   215,   217,   219,   221,
                    223,   226
            };

    // Report on the debug stream that the rule yyrule is going to be reduced.
    private void yy_reduce_print (int yyrule, YYStack yystack)
    {
        if (yydebug == 0)
            return;

        int yylno = yyrline_[yyrule];
        int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
        yycdebug ("Reducing stack by rule " + (yyrule - 1)
                + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
        for (int yyi = 0; yyi < yynrhs; yyi++)
            yy_symbol_print ("   $" + (yyi + 1) + " =",
                    yyrhs_[yyprhs_[yyrule] + yyi],
                    ((yystack.valueAt (yynrhs-(yyi + 1)))));
    }

    /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
    private static final byte yytranslate_table_[] =
            {
                    0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
                    5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
                    15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
                    25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
                    35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
                    45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
                    55,    56,    57,    58,    59,    60,    61,    62,    63
            };

    private static final byte yytranslate_ (int t)
    {
        if (t >= 0 && t <= yyuser_token_number_max_)
            return yytranslate_table_[t];
        else
            return yyundef_token_;
    }

    private static final int yylast_ = 182;
    private static final int yynnts_ = 27;
    private static final int yyempty_ = -2;
    private static final int yyfinal_ = 4;
    private static final int yyterror_ = 1;
    private static final int yyerrcode_ = 256;
    private static final int yyntokens_ = 64;

    private static final int yyuser_token_number_max_ = 318;
    private static final int yyundef_token_ = 2;

/* User implementation code.  */
/* Unqualified %code blocks.  */

/* Line 927 of lalr1.java  */
/* Line 19 of "parser.y"  */

    static PrintStream writer;

    public static void main(String args[]) throws IOException, FileNotFoundException {
        YYParser yyparser;
        final Yylex lexer;

        writer = new PrintStream(new File("output.txt"));
        lexer = new Yylex(new InputStreamReader(new FileInputStream("input.txt")));

        yyparser = new YYParser(new Lexer() {

            @Override
            public int yylex() {
                int yyl_return = -1;
                try {

                    yyl_return = lexer.yylex();
                } catch (IOException e) {
                    System.err.println("IO error :" + e);
                }
                return yyl_return;
            }

            @Override
            public void yyerror(String error) {
                System.err.println("Error : " + error);
            }

            @Override
            public Object getLVal() {
                return null;
            }
        });
        yyparser.parse();

        return;
    }



/* Line 927 of lalr1.java  */
/* Line 1927 of "parser.java"  */

}


/* Line 931 of lalr1.java  */
/* Line 228 of "parser.y"  */




