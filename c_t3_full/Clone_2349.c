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
#include <stdlib.h>
int main() {
	    int i, N, sum = 0;
	    scanf ("%d", &N);
	    int* ar;
	    ar = malloc(N * sizeof(int));
	    for (i = 0; i < N; i++) {
		scanf ("%d", &ar[i]);
		sum = sum + ar[i];
	    }
	    printf ("%d\n", sum);
	    free(ar);
	    return 0;
}


