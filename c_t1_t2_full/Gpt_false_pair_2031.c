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
    int select, num1, num2, hold;
    do {
        printf("\n");
        printf("1: Sum of two numbers \n");
        printf("2: Difference of two numbers\n");
        printf("3: Product of two numbers\n");
        printf("<0:Press 0 to close the program\n");
        printf("Pick calculation:");
        scanf("%d", &select);
        if (select < 0) {
            printf("Closing the program...");
            break;
        }
        printf("Enter first number:");
        scanf("%d", &num1);
        printf("Enter second number:");
        scanf("%d", &num2);
        if (select == 1) {
            hold = addNums (num1, num2);
            showSum (num1, num2, hold);
        }
        else if (select == 2) {
            hold = diffNums (num1, num2);
            showDiff (num1, num2, hold);
        }
        else if (select == 3) {
            hold = multNums (num1, num2);
            showProd (num1, num2, hold);
        }
    }
    while (select > 0);
    return 0;
}
