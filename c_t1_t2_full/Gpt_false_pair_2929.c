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
    int counter = 1, FibonacciValue = 1;
    do {
        printf ("The %2dst Fibonacci number is %3d\n", counter, FibonacciValue);
        FibonacciValue = Fibonacci (++counter);
    }
    while (FibonacciValue <= 100);
    return 0;
}
