int main()
{
    int a;
    int b;
    char c;
    do
    {
        printf("Would you like to play?\nPress 'Y' for 'Yes' or 'N' for 'No'\n");
        scanf("%c", &c);
        if (c != 'Y' && c != 'y')
            break;
        printf("Enter the two values you like to compare\n");
        scanf(" %d %d", &a, &b);
        if (!(a ^ b))
        {
            printf("both are equal\n");
            getchar();
        }
        else
        {
            printf("both are not equal\n");
            getchar();
        }
    } while (1);
    printf("Thanks for playing.");
    getchar();
    return 0;
}

int main()
{
    int a, b;
    char input;

    printf("Do you want to play?\nInput 'Y' for 'Yes' or 'N' for 'No'\n");
    scanf(" %c", &input);

    if (input != 'Y' && input != 'y')
        return 0;

    printf("Please enter two numbers:\n");
    scanf("%d %d", &a, &b);

    if (a ^ b)
        printf("The numbers are not equal! \n");
    else
        printf("The numbers are equal! \n");

    printf("Thanks for playing");
    getchar();
    return 0;
}
