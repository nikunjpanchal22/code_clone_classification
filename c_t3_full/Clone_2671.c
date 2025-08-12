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
    int value1, value2, add = 10;
    printf("Please type two numbers:\n");
    while(add > 4) {
        printf("Enter first number: \n");
        scanf("%d", &value1);
        printf("Enter second number: \n");
        scanf("%d", &value2);
        add = value1 + value2;
    }
    printf("The sum is: %d\n", add); 
    getchar();
    return 0;
}


