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
    int num1, num2, totalSum = 10;
    printf("Give two numbers:\n");
    while (totalSum > 4) {
        printf("Give number 1:\n");
        scanf("%d", &num1);
        printf("Give number 2:\n");
        scanf("%d", &num2);
        totalSum = num1 + num2;
    }
    printf("Result is: %d\n", totalSum);
    getchar();
    return 0;
}


