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

int main() {
    int numOfTests, i;
    float grade, totalGrade=0.0;
    printf("Enter number of tests from 1 up to 25: ");
    scanf ("%d", &numOfTests);

    if(numOfTests<1) {printf("Minimum test number is 1.\n");}
    else if(numOfTests>25){printf("Maximum test number is 25.\n");}
    else {
        for (i=0; i<numOfTests; i++) {
            printf("Enter grade for test %d: ", i+1);
            scanf ("%f", &grade);
            totalGrade += grade;
        }
        printf("Your average grade is: %.2f\n", totalGrade/numOfTests);
    }
    return 0;
}


