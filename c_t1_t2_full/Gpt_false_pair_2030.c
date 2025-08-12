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
    int choice, first, second, sum;
    do {
        printf ("\n");
        printf ("1: Add two numbers \n");
        printf ("2: Subtract two numbers\n");
        printf ("3: Multiply two numbers\n");
        printf ("< 0:Enter 0 to terminate the program\n");
        printf ("Choose calculation:");
        scanf ("%d", &choice);
        if (choice < 0) {
            printf ("Terminating the program...");
            break;
        }
        printf ("Enter first number:");
        scanf ("%d", &first);
        printf ("Enter second number:");
        scanf ("%d", &second);
        if (choice == 1) {
            sum = add (first, second);
            step (first, second, sum);
        }
        else if (choice == 2) {
            sum = sub (first, second);
            step (first, second, sum);
        }
        else if (choice == 3) {
            sum = multi (first, second);
            step (first, second, sum);
        }
    }
    while (choice > 0);
    return 0;
}
