int main () {
    int num, x, tmp, sum = 0;
    scanf ("%d", & num);
    tmp = num;
    printf ("Factors are: ");
    while (1) {
        x = getFirst (tmp);
        printf ("%d ", x);
        if (x == tmp)
            break;
        tmp /= x;
    }
    printf ("\n");
    printf ("Sum of factors is: ");
    tmp = num;
    while (1) {
        x = getFirst (tmp);
        printf ("%d ", x);
        sum += x;
        if (x == tmp)
            break;
        printf ("+ ");
        tmp /= x;
    }
    printf ("= %d\n", sum);
}



 
#include <stdio.h>

int getFirst(int num){
    for (int i = 2; i <= num; i++){
        if (num % i == 0) return i;
    }
    return num;
}


