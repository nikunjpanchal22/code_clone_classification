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
int input() {
	    int num;
	    scanf ("%d", &num);
	    return num;
	}
	int main() {
	    int i, N, sum = 0;
	    N = input();
	    int ar[N];
	    for (i = 0; i < N; i++) {
		ar[i] = input();
	    }
	    for (i = 0; i < N; i++) {
		sum += ar[i];
	    }
	    printf ("%d\n", sum);
	    return 0;
}


