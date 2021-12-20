grammar miniSysY;
//词法规则
FuncType:'int';
Ident:'main';
Left_bracket:'(';
Right_bracket:')';
Left_braces:'{';
Right_braces:'}';
RETURN:'return';
Semicolon:';';
Zero:'0';
Hexadecimal_prefix : '0x' | '0X';
Nonzero_digit      : '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
Octal_digit        : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7';
Hexadecimal_digit  : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'
                      | 'a' | 'b' | 'c' | 'd' | 'e' | 'f'
                      | 'A' | 'B' | 'C' | 'D' | 'E' | 'F';
Notes1:'/*'(.|'/n')*?'*/' -> skip;
Notes2:'//'~[\n\r]*->skip;
Space:' '->skip;
White_space:[\n\r\t] ->skip;

//语法规则
compUnit : funcDef;
funcDef  : FuncType Ident Left_bracket Right_bracket block;
block    : Left_braces stmt Right_braces;
stmt     : RETURN number Semicolon;

number             : decimal_const | octal_const | hexadecimal_const;
decimal_const      : Nonzero_digit | decimal_const digit;
octal_const        : Zero | octal_const Octal_digit;
hexadecimal_const  : Hexadecimal_prefix Hexadecimal_digit
                      | hexadecimal_const Hexadecimal_digit;
digit              : Zero | Nonzero_digit;
