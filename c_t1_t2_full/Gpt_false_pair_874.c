int main () {
    int n1, n2, sum, tmp, digit, dec_digits;
    printf ("Enter the lower limit: ");
    scanf ("%d", & n1);
    printf ("\nEnter the upper limit: ");
    scanf ("%d", & n2);
    while (n1 <= n2) {
        sum = 0;
        dec_digits = decimal_digits (n1);
        tmp = n1;
        while (tmp != 0) {
            digit = tmp % 10;
            sum += (int) uipow ((uint32_t) digit, (uint32_t) dec_digits);
            tmp = tmp / 10;
        }
        if (sum == n1) {
            printf ("%d\n", n1);
        }
        n1++;
    }
    exit (EXIT_SUCCESS);
}


 
int main () 
{  
    int n1, n2, sum, tmp, digit, dec_digits; 
    printf ("Enter the lower limit: "); 
    scanf ("%d", &n1); 
    printf ("\nEnter the upper limit: "); 
    scanf ("%d", &n2); 
    
    for (n1; n1 <= n2; n1++) 
    {
        sum = 0;
        dec_digits = decimal_digits(n1); 
        tmp = n1;
        while (tmp != 0) 
        {
            digit = tmp % 10; 
            sum += pow(digit, dec_digits); 
            tmp = tmp/10; 
        }
        if (sum == n1) 
            printf ("%d\n", n1); 
    }
    exit(EXIT_SUCCESS); 
}
