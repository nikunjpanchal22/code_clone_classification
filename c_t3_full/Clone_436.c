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


 int main() { 
    int a [N]; 
    int i; 
    for (i = N-1; i >= 0; i--) 
        a[i] = (i+5)*5; 
    for (i = N-1; i >= 0; i--) 
        printf("%d ", a[i]); 
    printf("\n"); 
    int *a_dyn; 
    a_dyn = (int*)malloc(N * sizeof(int)); 
    for (i = N-1; i >= 0; i--) 
        a_dyn[i] = (i+2)*2; 
    for (i = N-1; i >= 0; i--) 
        printf("%d ", a[i]); 
    printf("\n"); 
    free(a_dyn); 
    return 0; 
} 


