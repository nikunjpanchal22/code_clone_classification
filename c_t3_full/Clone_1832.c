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
    int ret = 0;
    double num = -1;
    char input[100];
    printf ("Enter a positive number:");
    fgets(input, sizeof(input), stdin);
    ret = sscanf_s(input, "%lf", &num);
    while (num < 0) {
        if (ret != 1) {
            printf ("Error! Please enter a number: ");
        }
        else {
            printf ("Error! Please enter a positive number: ");
        }
        fgets(input, sizeof(input), stdin);
        ret = sscanf_s(input, "%lf", &num);
    }
    printf ("Your number is %.2lf", num);
    return 0;
}


