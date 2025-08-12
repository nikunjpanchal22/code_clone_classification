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
    if (n == 0)
        return;
    printNumber (n / 10, index+1);
    printf ("%d ", n % 10);
}


