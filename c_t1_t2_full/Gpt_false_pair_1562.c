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
    printf ("\nBase Value Highest digit\n");
    
    for (int i = 14; i >=2; i -=2) {
        intToStr(n, i, str);
        printf ("%d: %s %c\n", i, str, highestDigit (str));
    }
}
