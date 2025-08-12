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


 int main (void) {
    int no;
    printf("Enter the number: ");
    scanf("%d", &no);
    printf("The entered number is: %d\n", no);
    char data[no];
    int index;
    for (index = 0; index < no; index++) {
        printf("Enter the letter: ");
        scanf(" %c", &data[index]);
    }
    printf("The entered letters are: ");
    for (index = 0; index < no; index++) {
        printf("%c ", data[index]);
    }
    return 0;
}
