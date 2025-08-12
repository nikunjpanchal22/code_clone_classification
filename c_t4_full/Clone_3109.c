int main (void) {
    int number;
    printf ("\nenter a number: ");
    scanf ("%i", & number);
    int power = 1;
    while (number / power > 9)
        power *= 10;
    int sum = 0;
    do {
        int digit = number / power;
        if (power != 1)
            sum += digit;
        number %= power;
        power /= 10;
    }
    while (power > 0);
    printf ("sum (skipping last digit) = %i\n", sum);
    return 0;
}



 
#include <stdio.h>
void sum_n_minus_1(int num);

int main(void){
            int number;
            printf("\nenter a number:");
            scanf("%i", &number);

            sum_n_minus_1(number);

            return 0;
        }

        void sum_n_minus_1(int num){
            int sum=0;
            while(num>=10){
                sum+=num%10;
                num/=10;
            }

            printf("sum (skipping last digit) = %i\n",sum);
} 


