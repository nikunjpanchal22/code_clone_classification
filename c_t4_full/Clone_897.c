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
int fibonacci(int n) {
		   if(n <= 1)
		      return n;
		   return fibonacci(n-1) + fibonacci(n-2);
		}

		int main() {
		    int i = 1, fibonacci_num = 1;

		    do {
			printf("The %2dst Fibonacci number is %3d\n", i, fibonacci_num);
			fibonacci_num = fibonacci(++i);
		    } while (fibonacci_num <= 100);

		    return 0;
}


