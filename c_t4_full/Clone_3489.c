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



 

#include<math.h>
#include <stdio.h>
#define N 100
int main() {
    bool prime[N]={0};
    for (auto i{2}; i*i<N; i++)
        if (prime[i]==0)
            for (int h{i*i}; h<N; h+=i)
                prime[h] = 1;
    for (int i{2}; i<N; i++)
        if (prime[i]==0)
            printf("%d ",i);
    return 0;
}


