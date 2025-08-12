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
		    int a[N];
		    int *p = a;
		    for(int i=0;i<N;*p++ = i++);
		    for(int i=0;i<N;printf("%d ", a[i++]));
		    printf ("\n");
		    int *a_dyn;
		    a_dyn = malloc (N * sizeof (*a_dyn));
		    p = a_dyn;
		    for(int i=0;i<N;*p++ = i++);
		    for(int i=0;i<N;printf("%d ", a_dyn[i++]));
		    printf ("\n");
		    free(a_dyn);
		    return 0;
}


