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



int main () {
		    int a [N] = {0, 1, 2, 3, 4};
		    for (int i=0;i<N;printf("%d ", a[i++]));
		    printf("\n");
		    int *a_dyn = malloc(sizeof(int)*N);
		    int b[5] = {0, 1, 2, 3, 4};
		    for (int i=0;i<N;i++) a_dyn[i]=b[i];
		    for (int i=0;i<N;printf("%d ", a_dyn[i++]));
		    printf("\n");
		    free(a_dyn);
		    return 0;
}


