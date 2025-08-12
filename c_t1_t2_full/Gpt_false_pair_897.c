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


 

int main() 
{
    float manyTest = 0, gr = 0, avg = 0;
    int i;
    printf("How many tests do you want to average? (Minimum 1 Maximum 25)\n");
    scanf("%f", &manyTest);
    if (manyTest < 1) 
    {
        printf("The Minimum is 1!\n");
    }
    else if (manyTest > 25) 
    {
        printf("The Maximum is 25!\n");
    } 
    else 
    {
        printf("Please enter the grades of each of your tests, up to a maximum of %.2f:\n", manyTest);
        for (i = 0; i < manyTest; i++) 
        {
            scanf(" %f", &gr);
            avg += gr;
        } 
        printf("Your average grade is: %.2f\n", avg / manyTest);
    }
    system("pause");
    return 0;
}
