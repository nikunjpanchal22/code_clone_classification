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
int fibo(int n);
		int main() {
		    int i=1;
		    while (fibo(i++) <= 100)
			printf("The %2dst Fibonacci number is %3d\n", i, fibo(i));
		    return 0;
		}

		int fibo(int n) {
		    return n<3 ? 1 : fibo(n-1) + fibo(n-2);
}


