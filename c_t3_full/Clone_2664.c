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
    int firstNumber, secondNumber, addedSum = 10;
    puts("Input two numbers:");
    do {
        printf("Input number 1:\n");
        scanf("%d", &firstNumber);
        printf("Input number 2:\n");
        scanf("%d", &secondNumber);
        addedSum = firstNumber + secondNumber;
    } while (addedSum > 4);
    printf("The sum is: %d\n", addedSum);
    getchar();
    return 0;
}


