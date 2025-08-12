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





void printNumber (int num, int index){
    char numStr[50];
    sprintf(numStr, "%d", num);
    int i = 0;
    while(numStr[i]){
        printf("%c ", numStr[i]);
        i++;
    }
}


