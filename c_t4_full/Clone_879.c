int main () {
    int i = 1, fibonacci = 1;
    do {
        printf ("The %2dst Fibonacci number is %3d\n", i, fibonacci);
        fibonacci = Fibonacci (++i);
    }
    while (fibonacci <= 100);
    return 0;
}




 int Fibonacci(int n){
    int fib[n+1];
    fib[0] = 0;
    fib[1] = 1;

    for (int i = 2; i <= n; i++)
        fib[i] = fib[i-1] + fib[i-2];

    return fib[n];
 }


