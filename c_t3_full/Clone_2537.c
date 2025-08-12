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

#define MAX_TESTS 25
#define MIN_TESTS 1

int main () {
    int testsNum, i;
    float gt, average = 0;
    printf ("Enter number of tests (1 to 25): ");
    scanf ("%d", & testsNum);
    if (testsNum < MIN_TESTS) {
        puts("Enter at least 1 test");
    }
    else if (testsNum > MAX_TESTS) {
        puts("Cannot enter more than 25 tests");
    }
    else {
        puts("Enter the grades: ");
        for (i = 0; i < testsNum; i++) {
            scanf ("%f", & gt);
            average += gt;
        }
        printf ("The average mark is %.2f\n", average / testsNum);
    }
    system ("pause");
    return 0;
}


