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


 
int main(void) 
{ 
    int selection, first, second, result; 
    do 
    { 
        printf("\n"); 
        printf("1: Add two numbers \n"); 
        printf("2: Subtract two numbers\n"); 
        printf("3: Multiply two numbers\n"); 
        printf("<0:Press 0 to quit the program\n"); 
        printf("Choose operation:"); 
        scanf("%d", &selection); 
        if (selection < 0) 
        { 
            printf("Quitting the program..."); 
            break; 
        } 
        printf("Input first number:"); 
        scanf("%d", &first); 
        printf("Input second number:"); 
        scanf("%d", &second); 
        if (selection == 1) 
        { 
            result = add(first, second); 
            show_result(first, second, result); 
        } 
        else if (selection == 2) 
        { 
            result = subtract(first, second); 
            show_result(first, second, result); 
        } 
        else if (selection == 3) 
        { 
            result = multiply(first, second); 
            show_result(first, second, result); 
        } 
    } 
    while (selection > 0); 
    return 0; 
} 
