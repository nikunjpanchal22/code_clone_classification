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





void printNumber (int n, int index) {
    int digit = n%10;
    n /= 10;
    if (n > 0)
        printNumber (n, index+1);
    printf ("%d ", digit);
}


