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

int fibonacci(int num)
{
		    if(num <= 2)return 1;
		    int a = 1, b = 1, sum = 2, fib;
		    for(int i = 2; i < num; i++)
		    {
			fib = a + b;
			a = b;
			b = fib;
		    }
		    return fib;
		}

		int main()
		{
		    int i = 1, fib;
		    while((fib = fibonacci(i)) <= 100)
		    {
			printf("The %2dst Fibonacci number is %3d\n", i, fib);
			i++;
		    }
		    return 0;
}


