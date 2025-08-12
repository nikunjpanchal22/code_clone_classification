int main () {
    int a [N];
    int i;
    for (i = 0; i < N; ++i)
        a[i] = i;
    for (i = 0; i < N; ++i)
        printf ("%d ", a[i]);
    printf ("\n");
    int *a_dyn;
    a_dyn = malloc (N * sizeof (int));
    for (i = 0; i < N; ++i)
        a_dyn[i] = i;
    for (i = 0; i < N; ++i)
        printf ("%d ", a[i]);
    printf ("\n");
    free (a_dyn);
    return 0;
}



#define SIZE (5)
#define printarr(elt) printf(#elt"[%%u] = %%d\n", i, elt[i])
#define printpointer(ptr) printf(#ptr"[%%u] = %%d\n", i, ptr[i])

int main() {
	    unsigned int i;
	    int a[SIZE] = {0, 1, 2, 3, 4};
	    int *p = malloc(sizeof (int) * SIZE);

	    for (i = 0; i < SIZE; ++i) {
		printarr(a);
		p[i] = i;
	    }

	    printf("\n");

	    for (i = 0; i < SIZE; ++i) {
		printpointer(p);
	    }

	    free(p);
	    return 0;
}


