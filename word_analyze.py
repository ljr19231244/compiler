import sys

Letter = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
          'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
          'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
Digit = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
Underline = ['_']
Non_digit = Underline + Letter
key = ['if', 'else', 'while', 'break', 'continue', 'return']
sign = ['=', ';', '(', ')', '{', '}', '+', '*', '/', '<', '>']
tmp = ''

file = open(sys.argv[1])
# file = open('input.txt')
char = file.read(1)
while char:
    if char in Non_digit or char in Digit or char in sign:
        # 判断是不是字符串（含标识符）
        if char in Non_digit:
            tmp = tmp + char
            char = file.read(1)
            while char:
                if char in Non_digit or char in Digit:
                    tmp = tmp + char
                    char = file.read(1)
                else:
                    break
            if tmp in key:
                print(tmp.capitalize())
            else:
                print('Ident(' + tmp + ')')
            tmp = ''

        # 判断是不是无符号整数
        elif char in Digit:
            tmp = tmp + char
            char = file.read(1)
            while char:
                if char in Digit:
                    tmp = tmp + char
                    char = file.read(1)
                else:
                    break
            print('Number(' + tmp + ')')
            tmp = ''

        # 是符号，分情况输出
        else:
            if char == '=':
                char = file.read(1)
                if char == '=':
                    print('Eq')
                    char = file.read(1)
                    continue
                else:
                    print('Assign')
                    continue
            elif char == ';':
                print('Semicolon')
            elif char == '(':
                print('LPar')
            elif char == ')':
                print('RPar')
            elif char == '{':
                print('LBrace')
            elif char == '}':
                print('RBrace')
            elif char == '+':
                print('Plus')
            elif char == '*':
                print('Mult')
            elif char == '/':
                print('Div')
            elif char == '<':
                print('Lt')
            elif char == '>':
                print('Gt')
            char = file.read(1)

    # 是空格或者是回车
    elif char == ' ' or char == '\n' or char == '\t' or char == '\r':
        char = file.read(1)

    # 报错
    else:
        print('Err')
        break
file.close()
