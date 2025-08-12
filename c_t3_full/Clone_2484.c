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
    char buffer[80];
    char oper;
    int num, rslt;
    fgets (buffer, sizeof (buffer), stdin);
    sscanf (buffer, "%d", & num);
    rslt = num;
    do {
        fgets (buffer, sizeof (buffer), stdin);
        sscanf (buffer, "%c %d", & oper, & num);
        if (oper == '+') { rslt += num; }
        else if (oper == '*') { rslt *= num; }
        else if (oper == '%') { rslt %= num; }
    }
    while (oper != '%');
    printf ("%d\n", rslt);
    return 0;
}


