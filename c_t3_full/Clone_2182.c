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

void add(int a, int b, int *c) {
	    *c = a + b;
	}

	int main () {
	    int v1 [3], v2 [3], v3 [3], i;
	    void (*addPtr)(int, int, int*) = add;
	    for (i = 0; i < 3; i++) {
		scanf("%d", & v1 [i]);
	    }
	    for (i = 0; i < 3; i++) {
		scanf("%d", & v2 [i]);
	    }
	    for (i = 0; i < 3; i++) {
		addPtr(v1[i], v2[i], &v3[i]);
		printf("Sum: %d\n", v3[i]);
	    }
}


