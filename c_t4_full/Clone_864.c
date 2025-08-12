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
int Fibonacci(int n);
int main() {
		    int i=1, fib=1;
		    while (fib <= 100){
			printf("The %2dst Fibonacci number is %3d\n", i++, fib);
			fib = Fibonacci(i);
		    }
		    return 0;
		}

		int Fibonacci(int n) {
		    if(n<=1)
			return n;
		    else
			return(Fibonacci(n-1) + Fibonacci(n-2));
}


