int main () {
    int i = 1, fibonacci = 1;
    do {
        printf ("The %2dst Fibonacci number is %3d\n", i, fibonacci);
        fibonacci = Fibonacci (++i);
    }
    while (fibonacci <= 100);
    return 0;
}


int main () {
    int i = 1, FibonacciNum = 1;
    do {
        printf ("The %2dst Fibonacci number is %3d\n", i, FibonacciNum);
        FibonacciNum = Fibonacci (++i);
    }
    while (FibonacciNum <= 100);
    return 0;
}
