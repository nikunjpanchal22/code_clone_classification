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
		  int a = 0, b = 1, fibonacci = 0;
		   for(int j = 2; j <= i; j++){
		      fibonacci=b+a;
		      a=b;
		      b=fibonacci;
		   }
		   return(fibonacci);
		}

		int main() {
		    int i = 1, fibonacci;
		    do
		    {
			fibonacci = Fibonacci(i);
			printf("The %2dst Fibonacci number is %3d\n", i, fibonacci); 
			i++;
		    }
		    while (fibonacci < 100);       
		    return 0;
}


