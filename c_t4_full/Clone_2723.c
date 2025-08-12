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
    for (int i = index; i <= num; i += index)
    {
        printf("%d ", i);
    }
}


