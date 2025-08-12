int main () {
    int a = 85;
    int b = 71;
    int i = 0;
    while (1) {
        scanf ("%d %d", & a, & b);
        printf ("%d: %d + %d = %d\n", ++ i, a, b, sum (a, b));
    }
    return 0;
}





#include <stdio.h>
int add_numbers(int a, int b) {
            return a+b;
        }
        int main () {
            int num1 = 85;
            int num2 = 71;
            int counter = 0;
            while (1) {
                scanf ("%d %d", & num1, & num2);
                printf ("%d: %d + %d = %d\n", ++ counter, num1, num2, add_numbers(num1,num2));
            }
            return 0;
}


