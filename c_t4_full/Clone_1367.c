int main () {
    int v1 [3], v2 [3], v3 [3], i;
    for (i = 0; i < 3; i++) {
        printf ("Type a number : \n");
        scanf ("%d", & v1 [i]);
    }
    for (i = 0; i < 3; i++) {
        printf ("Type a number : \n");
        scanf ("%d", & v2 [i]);
    }
    for (i = 0; i < 3; i++) {
        v3[i] = v1[i] + v2[i];
        printf ("Total : %d\n", v3 [i]);
    }
}





#include <stdio.h>

void addArrays(int a[], int b[], int c[], int size) {
    int i;
	    for (i=0; i<size; i++) {
		c[i] = a[i] + b[i];
		printf("Sum: %d\n", c[i]);
	    }
	}

	int main() {
	    int v1[3] = {1, 2, 3}, v2[3] = {4, 5, 6}, v3[3];
	    addArrays(v1, v2, v3, 3);
	    return 0;
}


