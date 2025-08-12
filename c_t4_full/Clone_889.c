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
    int a = 0;
    int b = 1;
    for(int i = 2; i <= n; i++){
        int c = a + b;
        a = b;
        b = c;
    }
    return b;
 }


