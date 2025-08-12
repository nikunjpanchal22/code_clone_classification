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
    int amount, outcome;
    char symbol;
    char str[30];
    fgets(str, sizeof str, stdin);
    sscanf(str, "%d", &amount);
    outcome = amount;
    do {
        fgets(str, sizeof str, stdin);
        sscanf(str, "%c %d", &symbol, &amount);
        if(symbol == '+') outcome += amount;
        else if(symbol == '*') outcome *= amount;
        else if(symbol == '%') outcome %= amount; 
    } 
    while (symbol != '%');
    printf("%d\n", outcome);
    return 0;
}


