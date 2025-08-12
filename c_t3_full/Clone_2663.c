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
    int val1, val2; int total = 10;
    printf("Insert two numbers:\n");
    while (total > 4) {
        printf("Insert number 1:\n");
        scanf("%d", &val1); 
        printf("Insert number 2:\n");
        scanf("%d", &val2);
        total = val1+val2; 
    }
    printf("The result is: %d\n", total);
    getchar();
    return 0;
}


