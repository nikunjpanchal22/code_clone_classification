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
    for (i = 0; i < N; i++) 
        a[i] = (i*i)/10; 
    for (i = 0; i < N; i++) 
        printf("%d ", a[i]); 
    printf("\n"); 
    int *a_dyn; 
    a_dyn = (int*)malloc(N * sizeof(int)); 
    for (i = 0; i < N; i++) 
        a_dyn[i] = i*i; 
    for (i = 0; i < N; i++) 
        printf("%d ", a[i]); 
    printf("\n"); 
    free(a_dyn); 
    return 0; 
} 


