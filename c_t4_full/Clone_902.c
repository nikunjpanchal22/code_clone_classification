int main () {
    int i = 1, fibonacci = 1;
    do {
        printf ("The %2dst Fibonacci number is %3d\n", i, fibonacci);
        fibonacci = Fibonacci (++i);
    }
    while (fibonacci <= 100);
    return 0;
}


 


#include<stdio.h>

int Fibonacci(int num){
		    if(num==0)
			return 0;
		    else if(num==1)
			return 1;
		    else
			return(Fibonacci(num-1)+Fibonacci(num-2));
		}

		int main(){
		    int i=1;
		    int fibonacci = Fibonacci(i);
		    while(fibonacci<=100){
			printf("The %2dst Fibonacci number is %3d\n", i, fibonacci);
			i++;
			fibonacci = Fibonacci(i);
		    }
		    return 0;
}


