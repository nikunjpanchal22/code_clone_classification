int main () {
    int var;
    scanf ("%d", & var);
    if (var > 5)
        printf ("var > 5\n");
    else
        printf ("var <= 5\n");
    return 0;
}


 


#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
void printVar(int var) {
            if (var > 5)
                printf("var > 5\n");
            else
                printf("var <= 5\n");
        }
        int main() {
            int var;
            scanf("%d", &var);
            printVar(var);
            return 0;
}


