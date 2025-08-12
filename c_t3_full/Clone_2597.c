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
int main () {
    int k = 0;
    int n = 1234;
    do {
        k = (k * 10) + (n % 10);
        n /= 10;
    } while (n);
    printf("%d", k);
    return 0;
}


