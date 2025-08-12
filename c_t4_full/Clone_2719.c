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





void printNumber(int num, int index){
   if(index==0){
     printf("%d ", num);
     return;
   }
   printNumber(num/10, index-1);
   printf("%d ", num%10);
}


