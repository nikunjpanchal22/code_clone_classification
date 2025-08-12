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

typedef struct vector {
	    int val[3];
	} Vector;

	int addVectors(Vector v1, Vector v2, Vector *v3) {
	    int i;
	    for (i=0; i<3; i++) {
		v3->val[i] = v1.val[i] + v2.val[i];
		printf("Sum: %d\n", v3->val[i]);
	    }
	    return 0;
	};

	int main() {
	    Vector v1, v2, v3;
	    int i;
	    for(i = 0; i < 3; i++){
		printf("\nEnter First Vector Value:");
		scanf("%d",&v1.val[i]);
	    }
	    for(i = 0; i < 3; i++){
		printf("\nEnter Second Vector Value:");
		scanf("%d",&v2.val[i]);
	    }
	    addVectors(v1, v2, &v3);
	    return 0;
}


