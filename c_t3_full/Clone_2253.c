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



#define LOOP(x,N) for(x=0;x<N;x++)

int main () {
	    int a[N], i;
	    LOOP(i,N)a[i] = i;
	    LOOP(i,N)printf("%d ", a[i]);
	    printf("\n");
	    int *a_dyn = malloc(sizeof(int)*N);
	    LOOP(i,N)a_dyn[i] = i;
	    LOOP(i,N)printf("%d ", a_dyn[i]);
	    printf("\n");
	    free (a_dyn);
	    return 0;
}


