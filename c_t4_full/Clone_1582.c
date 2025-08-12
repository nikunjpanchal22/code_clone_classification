int main () {
    int i = 0, N, sum = 0;
    scanf ("%d", & N);
    int ar [N];
    for (i = 0; i < N; i++) {
        scanf ("%d", & ar [i]);
    }
    for (i = 0; i < N; i++) {
        sum = sum + ar[i];
    }
    printf ("%d\n", sum);
    return 0;
}



#include <stdio.h>
int main() {
    int N, sum = 0, i = 0;
    scanf("%d", &N);
    int array[N];
    while (i < N) {
        scanf("%d", &array[i]);
        i++;
    }
    i = 0;
    while (i < N) {
        sum += array[i];
        i++;
    }
    printf("%d\n", sum);
    return 0;
}


