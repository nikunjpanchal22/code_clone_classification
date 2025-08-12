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
int main() {
    int k = 0, n = 1234;
    while(n)
    {
        k *= 10;
        k += n % 10;
        n /= 10;
    }
    printf ("%d", k);
    return 0;
}


