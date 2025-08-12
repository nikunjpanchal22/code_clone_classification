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
    int no;
    printf("Please enter the number: ");
    scanf("%d", &no);
    printf("The entered number is: %d\n", no);
    char ch[no];
    int i;
    for (i = 0; i < no; i++)
    {
        printf("Enter letter %d: ", i+1);
        scanf(" %c", &ch[i]);
    }
    printf("The entered letters are: ");
    for (i = 0; i < no; i++)
    {
        printf("%c ", ch[i]);
    }
    return 0;
}
