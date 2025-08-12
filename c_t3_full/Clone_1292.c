int main (void) {
    int digit;
    printf ("Choose a number.\n");
    int num = GetInt ();
    if (num < 0) {
        num = -num;
        printf ("minus ");
    }
    printNumber (num, 0);
    printf ("\n");
}


 int main (void) {
    int digit;
    printf ("Select an integer.\n");
    int num = GetInt ();
    if (num < 0) {
        int transformed_num = -num;
        printf ("minus ");
    }
    else {
        int transformed_num = num;
    }
    printNumber (transformed_num, 0);
    printf ("\n");
}


