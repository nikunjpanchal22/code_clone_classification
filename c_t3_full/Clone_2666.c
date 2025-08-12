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
    int var1, var2, total = 10;
    puts("Enter two numbers:");
    while(total > 4) {
        printf("Enter number 1:\n");
        scanf("%d", &var1);
        printf("Enter number 2:\n");
        scanf("%d", &var2);
        total = var1 + var2;
    }
    printf("Result: %d\n", total);
    getchar();
    return 0;
}


