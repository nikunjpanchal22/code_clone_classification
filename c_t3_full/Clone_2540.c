int main () {
    float manyTest = 0, gr = 0, avg = 0;
    int i;
    printf ("How many tests you wanna average? (Minimum 1 Maximum 25)\n");
    scanf (" %f", & manyTest);
    if (manyTest <= 0) {
        printf ("The Minimum is 1!\n");
    }
    else if (manyTest > 25) {
        printf ("The Maximum is 25!\n");
    }
    else {
        printf ("Write down your grades on those tests:\n");
        for (i = 0; i < manyTest; ++i) {
            scanf (" %f", & gr);
            avg += gr;
        }
        printf ("Your average grade is: %.2f\n", avg / manyTest);
    }
    system ("pause");
    return 0;
}


 

#include <stdio.h>
#include <stdlib.h>

int main () {
    int testNumber, x;
    float grade, total;

    printf ("Please, enter the number of tests (1-25)? ");
    scanf ("%d", &testNumber);

    if(testNumber < 1) {
        printf ("Error: Please enter at least 1 test.\n");
    } else if(testNumber > 25) {
        printf ("Error: Please enter no more than 25 tests.\n");
    } else {
        for (x = 0; x < testNumber; x++) {
            printf("Enter grade #%d: ", x+1);
            scanf ("%f", &grade);
            total += grade;
        }
        printf ("Your average grade is: %.2f\n", total/testNumber);
    }

    return 0;
}


