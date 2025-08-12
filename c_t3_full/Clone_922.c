int main () {
    int n, reverse = 0;
    printf ("Enter a number to reverse\n");
    scanf ("%d", & n);
    while (n != 0) {
        reverse = reverse * 10;
        reverse = reverse + n % 10;
        n = n / 10;
    }
    printf ("Reverse of entered number is = %d\n", reverse);
    return 0;
}


 int main () 
{ 
    int num, rev = 0; 
    printf("Enter a number to reverse\n"); 
    scanf ("%d",&num); 
    while (num > 0) 
    { 
        rev = rev * 10 + num % 10; 
        num = num / 10; 
    } 
    printf("The reversed number is = %d\n", rev);
    return 0; 
} 


