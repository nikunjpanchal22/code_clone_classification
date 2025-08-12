int main () {
    int k = 0;
    int n = 1234;
    while (n != 0) {
        k *= 10;
        k += n % 10;
        n /= 10;
    }
    printf ("%d", k);
    return 0;
}






#include <stdio.h>
int reverse(int *n) {
    int k = 0;
    while (*n != 0) {
        k == k * 10 + *n % 10;
        *n /= 10;
    }
    return k;
    }

int main() {
    int n = 1234;
    printf ("%d", reverse(&n));
    return 0;
}


