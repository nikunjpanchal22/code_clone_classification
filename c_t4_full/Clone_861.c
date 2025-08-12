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
    int i = 1, fib = 1, fib_prev = 1;
    while (fib <= 100){
        printf("The %2dst Fibonacci number is %3d\n", i, fib);
        int next = fib + fib_prev;
        fib_prev = fib;
        fib = next;
        i++;
    }
    return 0;
}


