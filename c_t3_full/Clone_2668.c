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
    int input1, input2, combine = 10;
    printf("Provide two numbers:\n");
    while(combine > 4) {
        printf("Please provide your first number:\n");
        scanf("%d", &input1);
        printf("Please provide your second number:\n");
        scanf("%d", &input2);
        combine = input1 + input2;
    }
    printf("Combined: %d\n", combine); 
    getchar();
    return 0;
}


