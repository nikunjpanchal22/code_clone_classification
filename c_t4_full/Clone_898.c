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
		    if (i <= 1)
			return i;
		    return Fibonacci(i - 1) + Fibonacci(i - 2);
		}

		int main() {
		    int i = 1;
		    for (int fibonacci = 1; fibonacci <= 100; fibonacci = Fibonacci(++i)) {
			printf("The %2dst Fibonacci number is %3d\n", i, fibonacci);
		    }
		    return 0;
}


