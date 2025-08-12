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
    while(n != 0){
        printf("%d ", n%10);
        n /= 10;
    }
}


