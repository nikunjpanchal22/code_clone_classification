int main (void) {
    char buf [80];
    char oper;
    int number, result;
    fgets (buf, sizeof (buf), stdin);
    sscanf (buf, "%d", & number);
    printf ("   saw input: %d\n", number);
    result = number;
    do {
        fgets (buf, sizeof (buf), stdin);
        sscanf (buf, "%c %d", & oper, & number);
        printf ("   saw input: %c %d\n", oper, number);
        printf ("   computing: %d %c %d\n", result, oper, number);
        if (oper == '+') {
            result = result + number;
        }
        else if (oper == '*') {
            result = result * number;
        }
        else if (oper == '%') {
            result = result % number;
        }
        printf ("   result   : %d\n", result);
    }
    while (oper != '%');
    return 0;
}





#include <stdio.h>
int main (){
    char data[80];
    int nr, res;
    char op;
    fgets (data, 10, stdin);
    sscanf (data, "%d", & nr);
    res = nr;
    do {
        fgets (data,10, stdin);
        sscanf (data, "%c %d", & op, & nr);
        if (op == '+'){ res += nr;}
        else if (op == '*') {res *= nr; }
        else if (op == '%') {res %= nr; }
    }
    while (op != '%');
    printf ("   result   : %d\n", res);
    return 0;
}


