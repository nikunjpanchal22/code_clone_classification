int main () {
    int ui1;
    int ui2;
    puts ("Please enter two numbers:\n");
    int sum = 10;
    while (sum > 4) {
        printf ("enter number 1:\n");
        scanf ("%i", & ui1);
        printf ("enter number 2:\n");
        scanf ("%i", & ui2);
        sum = ui1 + ui2;
    }
    printf ("result is:  %d\n", sum);
    getchar ();
    getchar ();
    return 0;
}





#include <stdio.h>
int main() {
    int a, b; int c = 10;
    printf("Type 2 numbers:\n");
    while (c > 4){
        printf("Type number a:\n");
        scanf("%d", &a);
        printf("Type number b:\n");
        scanf("%d", &b);
        c = a + b;
    }
    printf("Result: %d\n", c); getchar();
    return 0;
}


