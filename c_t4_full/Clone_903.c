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
unsigned long fib(unsigned int n) {
		   unsigned long fib1= 1, fib2 = 1, checker = 1;
		   for (unsigned int i= 3; i<= n; i++) {
		       checker = fib1+ fib2;
		       fib1 = fib2;
		       fib2 = checker;
		   }
		   return checker;
		}

		int main() {
		   int i= 1;
		   unsigned long fibonacci= fib(i);
		   do {
		       printf("The %dth Fibonacci number is: %lu\n", i, fibonacci);
		       fibonacci= fib(++i);
		   } while (fibonacci <= 100);
		   return 0;
}


