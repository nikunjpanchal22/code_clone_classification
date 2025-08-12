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

#define MIN_TESTS 1
#define MAX_TESTS 25

int main() {
    int count;
    double tests, grades, avg=0;
    printf("Enter number of tests (between 1 and 25): ");
    scanf("%lf", &tests);
    if(tests<MIN_TESTS) {
        printf("Please enter atleast one test.\n");
    } else if(tests>MAX_TESTS) {
        printf("Please enter at most 25 tests.\n");
    } else {
        for(count = 0; count < tests; count++) {
            printf("Enter grade of test %d: ", count+1);
            scanf("%lf", &grades);
            avg+=grades;
        }
        printf("Average is %.2f\n", avg/tests);
    }
}


