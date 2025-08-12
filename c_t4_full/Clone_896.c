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

int Fibonacci(int n) {
	    if (n <= 2)
		return 1;
	    else
		return Fibonacci(n - 1) + Fibonacci(n - 2);
	}

	int main() {
	    int i = 1, fibonacci = 1;
	    do {
		printf("The %2dst Fibonacci number is %3d\n", i, fibonacci);
		fibonacci = Fibonacci(++i);
	    } while (fibonacci <= 100);
	    return 0;
}


