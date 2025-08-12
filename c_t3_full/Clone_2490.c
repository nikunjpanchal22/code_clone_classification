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
    char buf[100];
    char oprtr;
    int num, reslt;
    fgets (buf, sizeof (buf), stdin);
    sscanf (buf, "%d", & num);
    reslt = num;
    do {
        fgets (buf, sizeof (buf), stdin);
        sscanf (buf, "%c %d", & oprtr, & num);
        if (oprtr == '+') { reslt += num; }
        else if (oprtr == '*') { reslt *= num; }
        else if (oprtr == '%') { reslt %= num; }
    }
    while (oprtr != '%');
    printf ("%d\n", reslt);
    return 0;
}


