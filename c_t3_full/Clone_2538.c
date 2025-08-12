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
int main(void)
{
    int nbtest;
    float i, grades;
    printf("How many tests you wanna average? (1-25)\n");
    scanf("%f",&nbtest );
    if(nbtest < 1)
        printf("You must have at least one test\n");
    else if(nbtest > 25)
        printf("You can't have more than 25 tests\n");
    else{
        float gradesum=0;
        for(i = 0; i < nbtest; ++i){
            printf("Enter grade for test %d\n",(int)i+1 );
            scanf("%f",&grades );
            gradesum += grades;
        }
        printf("Your average grade is: %.2f\n", gradesum/nbtest);
    }
    return 0;
}


