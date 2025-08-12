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


 int main () {
    int a;

    printf ("Please enter a number: ");
    scanf("%d", &a);
    printf("The entered number is: %d\n", a);
	
	char letter = 'a';
    char letters[a];
    int i;

    for (i = 0; i < a; i++) {
        printf("Enter letter no.%d: ", i+1);
        scanf(" %c", &letters[i]);
        if(i == a-1) {
            letter++;
		}
    }
    printf("The entered letters are: ");
    for (i = 0; i < a; i++) {
        printf("%c: ", letters[i]);	
    }
    printf("\n");
    return 0;

}


