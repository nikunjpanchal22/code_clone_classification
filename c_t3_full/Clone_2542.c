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
int main()
{
    int tests = 0, i;
    float score = 0, average = 0;
    printf("Enter the number of tests (1-25)?\n");
    scanf("%d", &tests);
    if(tests < 1){
        printf("The lowest number of tests is 1.\n");
    }
    else if(tests > 25){
        printf("The highest number of tests is 25.\n");
    }
    else{
        printf("Enter your grade for each test:\n");
        for(i = 0; i < tests; ++i){
            scanf("%f", &score);
            average += score;
        }
        printf("Your average score is %.2lf\n", average/tests);
    }
}


