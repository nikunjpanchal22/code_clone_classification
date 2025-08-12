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



int main(){
	    int a[N] = {0,1,2,3,4};
	    int *p = a;
	    for(int i=0;i<N;printf("%d ", p[i++]));
	    printf ("\n");
	    int *a_dyn = calloc(N, sizeof(int));
	    a_dyn[0] = 0; a_dyn[1] = 1; a_dyn[2] = 2; a_dyn[3] = 3; a_dyn[4] = 4;
	    p = a_dyn;
	    for(int i=0;i<N;printf("%d ", p[i++]));
	    printf ("\n");
	    free(a_dyn);
	    return 0;
}


