int main (void) {
    int choose, number1, number2, total_hold;
    do {
        printf ("\n");
        printf ("1: sum of two numbers \n");
        printf ("2: difference of two numbers\n");
        printf ("3: product of two numbers\n");
        printf ("<0:terminate the program\n");
        printf ("Select calculation:");
        scanf ("%d", & choose);
        if (choose < 0) {
            printf ("Terminating the program...");
            break;
        }
        printf ("Enter the first number:");
        scanf ("%d", & number1);
        printf ("Enter the second number:");
        scanf ("%d", & number2);
        if (choose == 1) {
            total_hold = sumOfNumbers (number1, number2);
            displayS (number1, number2, total_hold);
        }
        else if (choose == 2) {
            total_hold = differenceOfNumbers (number1, number2);
            displayD (number1, number2, total_hold);
        }
        else if (choose == 3) {
            total_hold = MultiplicationOfNumbers (number1, number2);
            displayM (number1, number2, total_hold);
        }
    }
    while (choose > 0);
    return 0;
}


 
int main (void) {
    int choice, num1, num2, result;
    do {
        printf("\n");
        printf("1: Addition of two numbers \n");
        printf("2: Subtraction of two numbers\n");
        printf("3: Multiply of two numbers\n");
        printf("<0:Press 0 to terminate the program\n");
        printf("Choose operation:");
        scanf("%d", &choice);
        if (choice < 0) {
            printf("Terminating the program...");
            break;
        }
        printf("Input first number:");
        scanf("%d", &num1);
        printf("Input second number:");
        scanf("%d", &num2);
        if (choice == 1) {
            result = addition(num1, num2);
            display_result(num1, num2, result);
        }
        else if (choice == 2) {
            result = subtraction(num1, num2);
            display_result(num1, num2, result);
        }
        else if (choice == 3) {
            result = multiplication(num1, num2);
            display_result(num1, num2, result);
        }
    }
    while (choice > 0);
    return 0;
}
