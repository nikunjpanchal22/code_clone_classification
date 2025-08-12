int main () {
    int i = 1, fibonacci = 1;
    do {
        printf ("The %2dst Fibonacci number is %3d\n", i, fibonacci);
        fibonacci = Fibonacci (++i);
    }
    while (fibonacci <= 100);
    return 0;
}




 int FibMem[100] = {0};
 int Fibonacci(int n){
    if(n <= 1) return n;

    if(FibMem[n] != 0) return FibMem[n];

    FibMem[n] = Fibonacci(n-1) + Fibonacci(n-2);
    return FibMem[n];
 }


