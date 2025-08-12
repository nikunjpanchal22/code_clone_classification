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
int main () {
	    int i = 0, N, sum = 0;
	    N = scanf ("%d", &N);
	    int ar[N];
	    do {
		ar[i] = scanf ("%d", &ar[i]);
		sum += ar[i];
	    } while (++i < N);
	    printf ("%d\n", sum);
	    return 0;
}


