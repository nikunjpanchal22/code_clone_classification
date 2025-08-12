int main () {
    int x, number, fac;
    fac = 1;
    printf ("Enter a number:\n");
    scanf ("%d", & number);
    if (number < 0) {
        printf ("Factorial not defined for negative numbers.\n");
        exit (0);
    }
    for (x = 1; x <= number; x++) {
        if (number >= 0)
            fac = fac * x;
        else
            fac = 1;
    }
    printf ("%d! = %d\n", number, fac);
}




#include <stdio.h>
#define NEGATIVE_ANSWER "Factorial not defined for negative numbers.\n"
int main(void){
    int i, num, factorial=1;
    printf("Enter a number:\n");
    scanf("%d",&num);
    if(num<0){printf("%s",NEGATIVE_ANSWER);return 1;}
    for(i=1;i<=num;i++){if(num>=0){factorial*=i;}else{factorial=1;}}
    printf("%d!=%d\n",num,factorial);
    return 0;
}


