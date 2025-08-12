int main () {
    int ret = 0;
    double num = -1;
    printf ("Enter a positive number:");
    ret = scanf ("%lf", &num);
    while (num < 0) {
        if (ret != 1) {
            while (getchar () != '\n')
                ;
            printf ("Error! Please enter a number: ");
        }
        else {
            printf ("Error! Please enter a positive number: ");
        }
        ret = scanf ("%lf", &num);
    }
    printf ("Your number is %.2lf", num);
    return 0;
}



 

#include <stdio.h>
int main(void) {
    double num;
    char ch;
    while ((printf("Enter a positive number: "), scanf("%lf%c", &num, &ch) != 2 || ch != '\n' || num < 0))
    {
        while (getchar() != '\n');
    }
    printf("Your number is %.2lf\n", num);
    return 0;
}


