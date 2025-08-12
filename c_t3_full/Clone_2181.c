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





int main() {
	    int *v1, *v2, *v3, i;
	    v1 = (int*)malloc(3 * sizeof(int));
	    v2 = (int*)malloc(3 * sizeof(int));
	    v3 = (int*)malloc(3 * sizeof(int));

	    for (i = 0; i < 3; i++) {
		scanf("%d", &v1[i]);
	    }
	    for (i = 0; i < 3; i++) {
		scanf("%d", &v2[i]);
	    }
	    for (i = 0; i < 3; i++) {
		v3[i] = v1[i] + v2[i];
		printf("Sum: %d\n", v3[i]);
	    }

	    free(v1);
	    free(v2);
	    free(v3);
}


