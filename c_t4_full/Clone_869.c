int main () {
    int i = 1, fibonacci = 1;
    do {
        printf ("The %2dst Fibonacci number is %3d\n", i, fibonacci);
        fibonacci = Fibonacci (++i);
    }
    while (fibonacci <= 100);
    return 0;
}





#include <stdio.h>
int main() {
    int i, fib[15]; 
    fib[0] = 1; fib[1] = 1; 
    for(i = 1; fib[i] <= 100; i++) {
        printf("The %2dst Fibonacci number is %3d\n", i, fib[i]);
        fib[i+1] = fib[i] + fib[i-1];
    }
    return 0;
}


