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
    int decision, num1, num2, output; 
    do 
    { 
        printf("\n"); 
        printf("1: Addition of two numbers \n"); 
        printf("2: Subtraction of two numbers\n"); 
        printf("3: Multiplication of two numbers\n"); 
        printf("<0:Enter 0 to terminate the program\n"); 
        printf("Select calculation:"); 
        scanf("%d", &decision); 
        if (decision < 0) 
        { 
            printf("Terminating the program..."); 
            break; 
        } 
        printf("Input the first number:"); 
        scanf("%d", &num1); 
        printf("Input the second number:"); 
        scanf("%d", &num2); 
        if (decision == 1) 
        { 
            output = addNumber (num1, num2); 
            showSum (num1, num2, output); 
        } 
        else if (decision == 2) 
        { 
            output = subtractNumber (num1, num2); 
            showDiff ( num1, num2, output); 
        } 
        else if (decision == 3) 
        { 
            output = multiplyNumber (num1, num2); 
            showProduct ( num1, num2, output); 
        } 
    } 
    while (decision > 0); 
    return 0; 
} 
