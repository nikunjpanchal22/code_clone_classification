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
    char numStr[50];
    int i = 0;
    while (n > 0){
       numStr[i++] = (n % 10) + '0';
       n /= 10;
    }
    numStr[i] = '\0';
    for(int j = strlen(numStr) -1; j >= 0; j--){
        printf("%c ", numStr[j]);
    }
}


