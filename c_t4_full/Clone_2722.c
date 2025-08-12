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





void printNumber(int num, int index) {
    while (num) {
        printf("%d ", num % 10);
        num /= 10;
    }
}


