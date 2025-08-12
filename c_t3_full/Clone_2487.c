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
    char buffer[100];   
    char operator;
    int numbr, rsult;
    fgets (buffer, sizeof (buffer), stdin);
    sscanf (buffer, "%d", & numbr);
    rsult = numbr;
    do {
        fgets (buffer, sizeof (buffer), stdin);
        sscanf (buffer, "%c %d", & operator, & numbr);
        if(operator == '+')rsult += numbr;
        else if(operator == '*')rsult *= numbr;
        else if(operator == '%')rsult %= numbr;
    }
    while (operator != '%');
    printf("   result is: %d\n", rsult);
    return 0;
}


