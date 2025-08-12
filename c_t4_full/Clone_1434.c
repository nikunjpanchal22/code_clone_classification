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
	    int a[N]= {0, 1, 2, 3, 4};
	    for (int i=0;i<N;i++)
		printf("%d ", a[i]);
	    printf ("\n");
	    int *a_dyn = (int*)calloc(N, sizeof(int));
	    *a_dyn=*a;
	    *(a_dyn+1)=*(a+1);
	    *(a_dyn+2)=*(a+1);
	    *(a_dyn+3)=*(a+1);
	    *(a_dyn+4)=*(a+1);
	    for (int i=0;i<N;i++)
		printf("%d ", *(a_dyn+i));
	    printf ("\n");
	    free(a_dyn);
	    return 0;
}


