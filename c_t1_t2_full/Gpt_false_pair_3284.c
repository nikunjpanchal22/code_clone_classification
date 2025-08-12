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


int main () {
    int retVal = 0;
    double number = -1;
    printf ("Enter a positive number:");
    retVal = scanf ("%lf", &number);
    while (number < 0) {
        if (retVal != 1) {
            while (getchar () != '\n')
                ;
            printf ("Error! Please enter a number: ");
        }
        else {
            printf ("Error! Please enter a positive number: ");
        }
        retVal = scanf ("%lf", &number);
    }
    printf ("Your number is %.2lf", number);
    return 0;
}
