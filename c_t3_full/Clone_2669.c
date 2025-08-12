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
    int number1, number2, calculatedSum = 10;
    printf("Enter two numbers below:\n");
    while (calculatedSum > 4) {
        printf ("enter first number:\n");
        scanf("%d", &number1);
        printf ("enter second number:\n");
        scanf("%d", &number2);
        calculatedSum=number1+number2;
   } 
    printf("Sum is: %d", calculatedSum); 
    getchar();
    return 0;
}


