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
    char buff[100];
    char operator;
    int nm, resl;
    fgets (buff, sizeof (buff), stdin);
    sscanf (buff, "%d", & nm);
    resl = nm;
    do {
        fgets (buff, sizeof (buff), stdin);
        sscanf (buff, "%c %d", & operator, & nm);
        if (operator == '+') {resl += nm;}
        else if (operator == '*'){ resl *= nm;}
        else if (operator == '%') { resl %= nm;}
    }
    while (operator != '%');
    printf (" %d ", resl);
    return 0;
}


