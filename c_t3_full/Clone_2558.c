int main () {
    int n, a [4], final;
    scanf ("%d", & n);
    for (int i = 3; i >= 0; i--) {
        a[i] = n % 10 + 2;
        n /= 10;
    }
    final = (a[0] * 1000) + (a[1] * 100) + (a[2] * 10) + a[3];
    printf ("%d", final);
    return 0;
}




#include <stdio.h>

int main(void)
{
    int i, n, a[4], f;
    scanf("%d", &n);
    for(i = 3; i >= 0; --i)
    {
        a[i] = n % 10 + 2;
        n /= 10;
    }
    f = (a[0] * 1000) + (a[1] * 100) + (a[2] * 10) + a[3];
    printf("%d", f);
    return 0;
}


