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



 

#include<stdio.h>
#include<math.h>
#define MAX 100
int main() {
    bool arr[MAX] = {false};
    int i, j;
    for(i=2; i<=sqrt(MAX); i++) {
        if(!arr[i]) {
            for(j=i*i; j<MAX; j+=i) {
                arr[j] = true;
            }
    	}
    }
    for(i=2; i<MAX; i++) {
        if(!arr[i]) {
            printf("%d ",i);
        }
    }
    return 0;
}


