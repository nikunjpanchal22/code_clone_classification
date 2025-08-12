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
    int num1, num2;
    char answer;

    printf("Do you want to play? \nInput 'Y' for 'Yes' or 'N' for 'No'. \n"); 
    scanf(" %c", &answer); 

    if(answer != 'Y' && answer != 'y')
        return 0;

    printf("Please enter two values to compare: \n");
    scanf("%d %d", &num1, &num2);

    if(num1 == num2)
        printf("The two numbers are the same!\n");
    else
        printf("The two numbers are different!\n");

    printf("Thank you for playing!");
    getchar();
    return 0;
}


