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
    char buff[80];
    char opr;
    int nmbr, rsult;
    gets(buff);
    sscanf (buff, "%d", & nmbr);
    rsult = nmbr;
    do {
        gets(buff);
        sscanf (buff, "%c %d", & opr, & nmbr);
        if (opr == '+') {rsult += nmbr;}
        else if (opr == '*'){ rsult *= nmbr;}
        else if (opr == '%') { rsult %= nmbr; }
    }
    while (opr != '%');
    printf (" %d ", rsult);
    return 0;
}


