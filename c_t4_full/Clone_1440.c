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



int *init(){
		    static int a[N];
		    for(int i=0; i<N; i++){
			a[i]=i;
		    } 
		    return a;
		}

		int main(){
		    int *a, *a_dyn;
		    a=init();
		    a_dyn=init();
		    int i; for(i=0;i<N;i++){
			printf("%d ",a[i]);
		    } 
		    printf("\n");
		    for(i=0;i<N;i++){
			printf("%d ",a_dyn[i]);
		    } 
		    printf("\n");
		    return 0;
}


