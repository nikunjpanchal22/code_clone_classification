int main () {
    int ui1;
    int ui2;
    puts ("Please enter two numbers:\n");
    int sum = 10;
    while (sum > 4) {
        printf ("enter number 1:\n");
        scanf ("%i", & ui1);
        printf ("enter number 2:\n");
        scanf ("%i", & ui2);
        sum = ui1 + ui2;
    }
    printf ("result is:  %d\n", sum);
    getchar ();
    getchar ();
    return 0;
}





int main() {
    int user1, user2, combination = 10;
    printf("Enter 2 numbers below:\n");
    while (combination > 4) {
        printf("Enter the first number: \n");
        scanf("%d", &user1);
        printf("Enter the second number: \n");
        scanf("%d", &user2);
        combination = user1 + user2;
    }
    printf("The sum is: %d\n", combination);
    getchar();
    return 0;
}


