int main () {
    bool is_prime [max];
    int i, int1, j, n;
    int1 = sqrt (max);
    for (n = 0; n < max; ++n) {
        is_prime[n] = true;
    }
    is_prime[0] = false;
    is_prime[1] = false;
    for (i = 2; i < int1; i++) {
        if (is_prime[i])
            for (j = i + i; j < max; j += i) {
                is_prime[j] = false;
            }
    }
    for (n = 2; n < max; ++n) {
        if (is_prime[n] == true)
            printf ("%d ", n);
    }
    return 0;
}



 

#include <stdio.h>
#include <math.h>
#define MAX 100
int main() {
    int n,i,j,sqrt_max;
    bool primes[MAX];
    sqrt_max = sqrt(MAX);
    primes[0] = primes[1] = 0;
    for(n=2;n<MAX;n++)
        primes[n] = 1;
    for(i=2;i<sqrt_max;i++)
        if(primes[i] == 1)
            for(j=i*i;j<MAX;j+=i)
                primes[j] = 0;
    for(n=2;n<MAX;n++)
        if(primes[n] == 1)
            printf("%d ",n);
    return 0;
}


