int main () {
    int a;
    int b;
    char c;
    do {
        printf ("Would you like to play?\nPress 'Y' for 'Yes' or 'N' for 'No'\n");
        scanf ("%c", & c);
        if (c != 'Y' && c != 'y')
            break;
        printf ("Enter the two values you like to compare\n");
        scanf (" %d %d", & a, & b);
        if (!(a ^ b)) {
            printf ("both are equal\n");
            getchar ();
        }
        else {
            printf ("both are not equal\n");
            getchar ();
        }
    }
    while (1);
    printf ("Thanks for playing.");
    getchar ();
    return 0;
}


 int main(){
    int x, y;
    char ans; 

    printf("Would you like to play? \nPress 'Y' for 'Yes' or 'N' for 'No'\n");
    scanf(" %c", &ans);

    if(ans != 'Y' && ans != 'y')
        return 0;

    printf("Please enter two values to compare: \n");
    scanf("%d %d", &x, &y);

    if((x ^ y) == 0)
        printf("The two numbers are equal!\n");
    else
        printf("The two numbers are not equal!\n");

    printf("Thank you for playing!");
    getchar();
    return 0;
}


