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
		   if (n==1 || n==2){
		      return 1;
		   } else {
		      int fib1 = 1, fib2 = 1, fibonacci = 1;
		      for(int i = 3; i <= n; i++){
			 fibonacci = fib1 + fib2;
			 fib1 = fib2;
			 fib2 = fibonacci;
		      }
		      return fibonacci;
		   }
		}

		int main() {
		    int i = 1, fibonacci_num;

		    do {
			fibonacci_num = fibonacci(i);
			printf("The %2dst Fibonacci number is %3d\n", i, fibonacci_num);
			i++;
		    } while (fibonacci_num <= 100);

		    return 0;
}


