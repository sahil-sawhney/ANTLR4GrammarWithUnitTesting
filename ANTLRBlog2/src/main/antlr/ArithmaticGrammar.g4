
//grammar to showcase basic arithmatic operations with 2 integer operands only.
grammar ArithmaticGrammar;

startRule : operation space+ operand space+ operand space* semicolon ;

operation : add | sub | div | mul ;

operand : DIGIT + ;

space : ' ' ;
semicolon : ';' ;
DIGIT : [0-9] ;
add : ('add'|'ADD') ;
sub : ('sub'|'SUB') ;
mul : ('mul'|'MUL') ;
div : ('div'|'DIV') ;

WS : [\t\r\n]+ -> skip ;		//skip tabs, newlines, \r (Windows)