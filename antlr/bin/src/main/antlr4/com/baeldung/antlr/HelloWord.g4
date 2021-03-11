grammar HelloWord;

options
{
  // antlr will generate java lexer and parser
  language = Java;
  // generated parser should create abstract syntax tree
  output = AST;
}

// ***************** lexer rules:
//the grammar must contain at least one lexer rule
//SALUTATION:'Hello word';   
//ENDSYMBOL:'!';

// ***************** parser rules:
//our grammar accepts only salutation followed by an end symbol
//expression : SALUTATION ENDSYMBOL;

expression : entry+;
entry : salutation ' ' ender;

salutation : (TEXT | ' ' )+;
ender : '!';
fragment LETTER : [A-Za-z];

TEXT : LETTER+;