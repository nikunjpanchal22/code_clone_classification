int main () {
    char z [10];
    int a;
    printf ("enter the no.");
    scanf ("%d", & a);
    printf ("the entered no. is:%d\n", a);
    int i;
    for (i = 0; i < a; i++) {
        printf ("enter the letters:");
        scanf ("%c", & z [i]);
    }
    printf ("the entered letters are:");
    for (i = 0; i < a; i++) {
        printf ("%c\n", z [i]);
    }
    return 0;
}


 int main() 
{
    int n;
    printf("Please enter the no: ");
    scanf("%d", &n);
    printf("the entered no is: %d\n", n);
    char a[n];
    int i;
    for (i = 0; i < n; i++)
    {
        printf("Please enter the letter: ");
        scanf(" %c", &a[i]);
    }
    printf("The entered letters are: ");
    for (i = 0; i < n; i++)
    {
        printf("%c\n", a[i]);
    }
    return 0;
}
