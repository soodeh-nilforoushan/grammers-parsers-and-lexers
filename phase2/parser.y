%{
  package jSHLang;
  import java.io.*;
%}

%token UPTO DOWNTO EXIT_KW SINGLE_QUOTE_KW BOOLSABET LETTER DIGIT SHENASE ADADSABET REALCONST NEWLINE_KW NULL_KW HARF WHITESPACE COMMENTS PROGRAM_KW MAIN_KW INTEGER_KW FLOAT_KW CHAR_KW BOOLEAN_KW TWO_DOTS_KW  DOT_KW RAVIE_KW AGAR_KW ANGAH_KW VAGARNA_KW DO_KW WHILE_KW WHEN_KW FOR_KW SWITCH_KW GOZINESH_KW END_KW BAZGASHT_KW  UPTO_KW DOWNTO_KW LP_KW RP_KW LCB_KW RCB_KW SEMICOLON_KW COLON_KW COMMA_KW ASS_KW MORED_KW AND_KW OR_KW NAGHIZ_KW DEFAULT_KW PLUS_KW MINUS_KW MUL_KW DIV_KW MOD_KW EQ_KW NE_KW LE_KW LT_KW GE_KW GT_KW 

%right SEMICOLON_KW
%left OR_KW VAGARNA_KW
%left AND_KW ANGAH_KW
%left EQ_KW NE_KW
%left LE_KW LT_KW GT_KW GE_KW
%left PLUS_KW MINUS_KW
%left MUL_KW DIV_KW 
%right NAGHIZ_KW



%code {
    static PrintStream writer;

    public static void main(String args[]) throws IOException, FileNotFoundException {
        YYParser yyparser;
        final Yylex lexer;

        writer = new PrintStream(new File("output.txt"));
        lexer = new Yylex(new InputStreamReader(new FileInputStream(".\\files\\Code.shl")));

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
}



%%
program : PROGRAM_KW SHENASE declarations_list list_ravie MAIN_KW block{
System.out.println("RULE 1.1 :PROGRAM_KW SHENASE declarations_list list_ravie main_KW block");};

declarations_list : declarations {
System.out.println("RULE 2.1 : declarations");};
| declarations_list declarations {
System.out.println("RULE 2.2 : declarations_list declarations");};


declarations : taeen_type declarator_list SEMICOLON_KW {
System.out.println("RULE 3.1 : taeen_type declarator_list SEMICOLON_KW");};
//| {System.out.println("RULE 3 : epsilon");};


taeen_type : INTEGER_KW {System.out.println("RULE 4.1 : INTEGER_KW");}; 
| FLOAT_KW {System.out.println("RULE 4.2 : FLOAT_KW");}; 
| CHAR_KW {System.out.println("RULE 4.3 : CHAR_KW");};
| BOOLEAN_KW {System.out.println("RULE 4.4 : BOOLEAN_KW");};

declarator_list : declarator {
System.out.println("RULE 5.1 : declarator");};
| declarator_list COMMA_KW declarator  {
System.out.println("RULE 5.2 : declarator_list COMMA_KW declarator");};


declarator : dec  {System.out.println("RULE 6.1 : dec");};
| dec ASS_KW meghdar_avalie {
System.out.println("RULE 6.2 : dec ASS_KW meghdar_avalie");};

dec : SHENASE {System.out.println("RULE 7.1 : SHENASE ");}; 
| SHENASE UPTO_KW range DOWNTO_KW {System.out.println("RULE 7.2 : SHENASE UPTO_KW range DOWNTO_KW");}; 
| SHENASE UPTO_KW ADADSABET DOWNTO_KW {System.out.println("RULE 7.3 : SHENASE UPTO_KW ADADSABET DOWNTO_KW");}; 

range : SHENASE TWO_DOTS_KW SHENASE {
System.out.println("RULE 8.1 : SHENASE TWO_DOTS_KW SHENASE");}; 
| ADADSABET TWO_DOTS_KW ADADSABET {
System.out.println("RULE 8.2 : ADADSABET TWO_DOTS_KW ADADSABET ");}; 
|ebarat_riazi TWO_DOTS_KW ebarat_riazi {
System.out.println("RULE 8.3 : ebarat_riazi TWO_DOTS_KW ebarat_riazi ");}; 

meghdar_avalie : ebarat_sabet {
System.out.println("RULE 9.1 : ebarat_sabet ");}; 
| LCB_KW list_meghdar_avalie RCB_KW {System.out.println("RULE 9.2 : LCB_KW list_meghdar_avalie RCB_KW ");}; 

list_meghdar_avalie : ebarat_sabet COMMA_KW list_meghdar_avalie {
System.out.println("RULE 10.1 : ebarat_sabet COMMA_KW list_meghdar_avalie ");}; 
| ebarat_sabet {System.out.println("RULE 10.2 : ebarat_sabet ");};

list_ravie : list_ravie ravie {
System.out.println("RULE 11.1 : list_ravie ravie ");};
| {System.out.println("RULE 11.2 : epsilon ");};

ravie : RAVIE_KW SHENASE parameters LCB_KW declarations_list block RCB_KW SEMICOLON_KW {
System.out.println("RULE 12.1 : ravie_KW SHENASE parameters LCB_KW declarations_list block RCB_KW SEMICOLON_KW ");};

parameters : LP_KW declarations_list RP_KW {System.out.println("RULE 13.1 : LP_KW declarations_list RP_KW ");};

block : LCB_KW statement_list RCB_KW {System.out.println("RULE 14.1 : LCB_KW statement_list RCB_KW ");};

statement_list : statement SEMICOLON_KW {System.out.println("RULE 15.1 : statement SEMICOLON_KW");};
| statement_list statement SEMICOLON_KW {System.out.println("RULE 15.2 : statement_list statement SEMICOLON_KW");};



statement : SHENASE ASS_KW ebarat {
System.out.println("RULE 16.1 : SHENASE ASS_KW ebarat");};

|AGAR_KW ebarat_bool ANGAH_KW statement// %prec VAGARNA_OLAVIAT{System.out.println("RULE 16.1 : AGAR_KW ebarat_bool ANGAH_KW statement");};
|AGAR_KW ebarat_bool ANGAH_KW statement VAGARNA_KW statement {System.out.println("RULE 16.2 : AGAR_KW ebarat_bool ANGAH_KW statement VAGARNA_KW statement");};
|DO_KW statement WHILE_KW ebarat_bool {System.out.println("RULE 16.3 : DO_KW statement WHILE_KW ebarat_bool");};
|FOR_KW SHENASE ASS_KW counter DO_KW statement {System.out.println("RULE 16.4 : FOR_KW SHENASE ASS_KW counter DO_KW statement");};
|GOZINESH_KW ebarat onsor_mored default END_KW {System.out.println("RULE 16.5 : GOZINESH_KW ebarat onsor_mored default END_KW ");};
| SHENASE LP_KW arguments_list RP_KW {System.out.println("RULE 16.6 : SHENASE LP_KW arguments_list RP_KW");};
|SHENASE UPTO_KW ebarat DOWNTO_KW ASS_KW ebarat {System.out.println("RULE 16.7 : SHENASE UPTO_KW ebarat DOWNTO_KW ASS_KW ebarat");};
|BAZGASHT_KW ebarat {System.out.println("RULE 16.8 : BAZGASHT_KW ebarat");};
|EXIT_KW WHEN_KW ebarat_bool {System.out.println("RULE 16.9 : EXIT_KW WHEN_KW ebarat_bool");};
| block {System.out.println("RULE 16.10 : block");};
| {System.out.println("RULE 16.11 : epsilon");};



arguments_list : multi_arguments {System.out.println("RULE 17.1 : multi_arguments");};
// | ebarat {System.out.println("RULE 17.2 : ebarat");};
| {System.out.println("RULE 17.3 : epsilon");};


multi_arguments : multi_arguments COMMA_KW ebarat {System.out.println("RULE 18.1 : multi_arguments COMMA_KW ebarat");};

| ebarat {System.out.println("RULE 18.2 : ebarat");};


counter : ADADSABET UPTO ADADSABET {System.out.println("RULE 19.1 : ADADSABET UPTO ADADSABET");};

| ADADSABET DOWNTO ADADSABET {System.out.println("RULE 19.2 : ADADSABET DOWNTO ADADSABET");};



onsor_mored : MORED_KW ADADSABET COLON_KW block {System.out.println("RULE 20 : MORED_KW ADADSABET COLON_KW block");};

|onsor_mored MORED_KW ADADSABET COLON_KW block {System.out.println("RULE 20 : onsor_mored MORED_KW ADADSABET COLON_KW block");};


default : DEFAULT_KW COLON_KW block {System.out.println("RULE 21 : default_KW colon block");};

| {System.out.println("RULE 21.2 : epsilon");};


ebarat : ebarat_sabet  {System.out.println("RULE 22.1 : ebarat_sabet");};

| ebarat_bool {System.out.println("RULE 22.2 : ebarat_bool");};

| ebarat_riazi {System.out.println("RULE 22.3 : ebarat_riazi");};

|SHENASE {System.out.println("RULE 22.4 : SHENASE");};

| SHENASE UPTO_KW ebarat DOWNTO_KW {System.out.println("RULE 22.5 : SHENASE UPTO_KW ebarat DOWNTO_KW ");};

| SHENASE LP_KW arguments_list RP_KW {System.out.println("RULE 22.6 : SHENASE LP_KW arguments_list RP_KW");};

| LP_KW ebarat RP_KW {System.out.println("RULE 22.7 : LP_KW ebarat RP_KW");};


ebarat_sabet: ADADSABET {System.out.println("RULE 23.1 : ADADSABET");};
| REALCONST {System.out.println("RULE 23.2 : REALCONST");};
| HARF {System.out.println("RULE 23.3 : HARF");};
| BOOLSABET {System.out.println("RULE 23.4 : BOOLSABET");};


ebarat_bool : zojmoratab AND_KW {System.out.println("RULE 24.1 : zojmoratab AND_KW");};

| zojmoratab OR_KW {System.out.println("RULE 24.2.3 : zojmoratab OR_KW");};

| zojmoratab AND_KW ANGAH_KW {System.out.println("RULE 24.4 : zojmoratab AND_KW ANGAH_KW ");};

| zojmoratab OR_KW VAGARNA_KW{System.out.println("RULE 24.5 : zojmoratab OR_KW VAGARNA_KW");};

| zojmoratab LT_KW {System.out.println("RULE 24.6 : zojmoratab LT_KW");};

| zojmoratab LE_KW {System.out.println("RULE 24.7 : zojmoratab LE_KW");};

| zojmoratab GT_KW {System.out.println("RULE 24.8 : zojmoratab GT_KW");};

| zojmoratab GE_KW {System.out.println("RULE 24.9 : zojmoratab GE_KW");};

| zojmoratab EQ_KW {System.out.println("RULE 24.10 : zojmoratab EQ_KW");};

| zojmoratab NE_KW {System.out.println("RULE 24.11 : zojmoratab NE_KW");};

|ebarat NAGHIZ_KW {System.out.println("RULE 24.12 : ebarat NAGHIZ_KW");};


ebarat_riazi : zojmoratab PLUS_KW {System.out.println("RULE 25 : zojmoratab PLUS_KW");};

| zojmoratab MINUS_KW {System.out.println("RULE 25 : zojmoratab MINUS_KW");};

| zojmoratab MUL_KW {System.out.println("RULE 25 : zojmoratab MUL_KW");};

| zojmoratab DIV_KW {System.out.println("RULE 25 : zojmoratab DIV_KW");};

| zojmoratab MOD_KW {System.out.println("RULE 25 : zojmoratab MOD_KW");};

| MINUS_KW ebarat {System.out.println("RULE 25 : MINUS_KW ebarat");};


zojmoratab : LP_KW ebarat COMMA_KW ebarat RP_KW{System.out.println("RULE 26 : LP_KW ebarat comma ebarat RP_KW");};

%%


