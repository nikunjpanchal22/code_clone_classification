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
    int option, input1, input2, total; 
    do 
    { 
        printf("\n"); 
        printf("1: Sum of two numbers \n"); 
        printf("2: Difference of two numbers\n"); 
        printf("3: Product of two numbers\n"); 
        printf("<0:Enter 0 to terminate the program\n"); 
        printf("Select calculation:"); 
        scanf("%d", &option); 
        if (option < 0) 
        { 
            printf("Terminating the program..."); 
            break; 
        } 
        printf("Enter the first number:"); 
        scanf("%d", &input1); 
        printf("Enter the second number:"); 
        scanf("%d", &input2); 
        if (option == 1) 
        { 
            total = addition(input1, input2); 
            outputS(input1, input2, total); 
        } 
        else if (option == 2) 
        { 
            total = difference(input1, input2); 
            outputD(input1, input2, total); 
        } 
        else if (option == 3) 
        { 
            total = product(input1, input2); 
            outputM(input1, input2, total); 
        } 
    } 
    while (option > 0); 
    return 0; 
}
