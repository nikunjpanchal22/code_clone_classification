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
    printf ("Choose a number to process.\n");
    int num = GetInt ();
    if (num < 0) {
        int transformed_num = -num;
        printf ("Printing the opposite of the number ");
    }
    else {
        int transformed_num = num;
    }
    printNumber (transformed_num, 0);
    printf ("\n");
}


