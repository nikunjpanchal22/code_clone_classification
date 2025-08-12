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
    int i=2, fib=1, fib_last=1;
    printf("The  1st Fibonacci number is   1\n");
    while (fib <= 100){
        printf("The %2dst Fibonacci number is %3d\n", i++, fib);
        int temp = fib;
        fib+=fib_last;
        fib_last = temp;
    }
    return 0;
}


