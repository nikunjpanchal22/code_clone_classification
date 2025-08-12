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
#define MAX 100
int main () {
	    int i, N, sum = 0;
	    scanf ("%d", &N);
	    int ar[MAX];
	    i=0;
	    while(i < N) {
		scanf ("%d", & ar[i]);
		i++;
	    }
	    i=0;
	    while(i < N) {
		sum += ar[i];
		i++;
	    }
	    printf ("%d\n", sum);
	    return 0;
}


