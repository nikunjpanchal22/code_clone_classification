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
#define MAX_PRIME 100
int main() {
    int is_prime[MAX_PRIME], i, j;
    for(i = 0; i < MAX_PRIME; i++) {
        is_prime[i] = 1;
    }
    is_prime[0] = 0;
    is_prime[1] = 0;
    for(i = 2; i <= sqrt(MAX_PRIME); i++) {
        if(is_prime[i]) {
            for(j = i*2; j < MAX_PRIME; j += i) {
                is_prime[j] = 0;
            }
    	}
    }
    for(i = 2; i < MAX_PRIME; i++) {
        if(is_prime[i]) {
            printf("%d ", i);
        }
    }
    return 0;
}


