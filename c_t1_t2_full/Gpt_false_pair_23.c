int main () {
    int i = 2, fibonacci = 0, fParcialone = 1, fParcialtwo = 0;
    printf ("The %2dst Fibonacci number is %3d\n", i - 1, fibonacci + 1);
    fibonacci = fParcialone + fParcialtwo;
    do {
        printf ("The %2dst Fibonacci number is %3d\n", i, fibonacci);
        fParcialtwo = fParcialone;
        fParcialone = fibonacci;
        i++;
    }
    while ((fibonacci = fParcialone + fParcialtwo) <= 100);
    return 0;
}


 int main () {
    int x = 2, Fibonacci_num = 0, First_partial = 1, Second_partial = 0;
    printf("The %2dst Fibonacci number is %3d\n", x - 1, Fibonacci_num);
    Fibonacci_num = First_partial + Second_partial;
    do {
        printf("The %2dst Fibonacci number is %3d\n", x, Fibonacci_num);
        Second_partial = First_partial;
        First_partial = Fibonacci_num;
        x++;
    }while ((Fibonacci_num =First_partial + Second_partial)<=100);
    return 0;
 }
