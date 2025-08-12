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
	    int i=0, N, sum = 0;
	    scanf ("%d", &N);
	    int ar[N];
	    while(scanf ("%d", & ar[i++]) != EOF);
	    for(i=0; i<N; sum += ar[i++]);
	    printf ("%d\n", sum);
	    return 0;
}


