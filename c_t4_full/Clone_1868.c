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
    int numb, resl;
    char buf[100];
    char opr;
    fgets(buf, sizeof(buf), stdin);
    sscanf(buf, "%d", &numb);
    resl = numb;
    do {
        fgets(buf, sizeof(buf), stdin);
        sscanf(buf, "%c %d", &opr, &numb);
        if(opr == '+') resl += numb;
        else if(opr == '*') resl *= numb;
        else if(opr == '%') resl %= numb;
    }
    while(opr != '%');
    printf(" %d", resl);
    return 0;
}


