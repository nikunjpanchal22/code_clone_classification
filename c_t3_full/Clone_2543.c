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

int main(){
    int i, num_tests;
    float grade, avg = 0.f;
    printf("Enter number of tests (1-25)\n");
    scanf("%d", &num_tests);

    if(num_tests<1) {
        printf("Minimum test number is 1.\n");
    }
    else if(num_tests>25){
        printf("Maximum test number is 25.\n");
    }
    else {
        printf("Enter grades out of 100 \n");

        for(i=0; i<num_tests; i++){
            scanf("%f", &grade);
            avg += grade/num_tests;
        }
        printf("Average grade: %.2f out of 100 \n",avg);
    }
}


