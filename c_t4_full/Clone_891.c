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

int Fibonacci(int i) {
		   int a = 0, b = 1, next, nth = 0;
		   for (int j = 1; j <= i; j++) {
		      if (j == 1) {
			 next = a;
		      } else if (j == 2) {
			 next = b;
		      } else {
			 nth = a + b;
			 a = b;
			 b = nth;
		      }
		   }
		   return nth;
		}

		int main() {
		   int i = 1, fibonacci;
		    do {
		       fibonacci = Fibonacci(i);
		       printf("The %2dst Fibonacci number is %3d\n", i, fibonacci); 
		       i++;
		    } while (fibonacci <= 100); 
		   return 0;
}


