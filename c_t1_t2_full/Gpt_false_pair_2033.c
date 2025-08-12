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
    int option, num_1, num_2, output; 
    do 
    { 
        printf("\n"); 
        printf("1: Addition of two numbers \n"); 
        printf("2: Subtraction of two numbers\n"); 
        printf("3: Multiplication of two numbers\n"); 
        printf("<0:Enter 0 to close the program\n"); 
        printf("Choose operation:"); 
        scanf("%d", &option); 
        if (option < 0) 
        { 
            printf("Closing the program..."); 
            break; 
        } 
        printf("Input first number:"); 
        scanf("%d", &num_1); 
        printf("Input second number:"); 
        scanf("%d", &num_2); 
        if (option == 1) 
        { 
            output = addNums (num_1, num_2); 
            represent (num_1, num_2, output); 
        } 
        else if (option == 2) 
        { 
            output = subNums (num_1, num_2); 
            represent (num_1, num_2, output); 
        } 
        else if (option == 3) 
        { 
            output = multNums (num_1, num_2); 
            represent (num_1, num_2, output); 
        } 
    } 
    while (option > 0); 
    return 0; 
}
