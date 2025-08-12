int main () {
    char str [100];
    int n;
    printf ("Enter a octal number: ");
    scanf ("%o", & n);
    printf ("\nBase Value Highest digit\n");
    for (int i = 2; i < 17; i++) {
        intToStr (n, i, str);
        printf ("%d: %s %c\n", i, str, highestDigit (str));
    }
}



int main() 
{
     char str [100];
     int n;
     printf ("Enter a octal number: ");
     scanf ("%o", & n);
     printf ("Base Value Highest digit\n");
    
     for (int i = 0; i < 8; i++) 
     {
         intToStr(n, 2 + (2 * i), str);
         printf ("%d: %s %c\n", 2 + (2 * i), str, highestDigit (str));
     }
}
