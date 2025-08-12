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


int main () {
    float manyTest = 0, grade = 0, avgGrade = 0;
    int i;
    printf ("How many tests should be averaged? (Minimum 1 Maximum 25)\n");
    scanf (" %f", & manyTest);
    if (manyTest <= 0) {
        printf ("The Minimum must be 1!\n");
    }
    else if (manyTest > 25) {
        printf ("The Maximum is 25!\n");
    }
    else {
        printf ("Enter the grades for those tests:\n");
        for (i = 0; i < manyTest; ++i) {
            scanf (" %f", & grade);
            avgGrade += grade;
        }
        printf ("Your average grade is: %.2f\n", avgGrade / manyTest);
    }
    system ("pause");
    return 0;
}
