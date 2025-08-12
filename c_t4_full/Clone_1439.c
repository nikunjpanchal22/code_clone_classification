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



void print_array(int *a, int n){
		    for(int i=0; i<n; i++){
			printf("%d ", a[i]);
		    }
		    printf("\n");
		}

		void init_array(int *a, int n){
		    for(int i=0; i<n; i++){
			a[i]=i;
		    }
		}

		int main () {
		    int a [N];
		    init_array(a,N);
		    print_array(a,N);
		    int *a_dyn;
		    a_dyn = malloc (N * sizeof (int));
		    init_array(a_dyn,N);
		    print_array(a_dyn,N);
		    free (a_dyn);
		    return 0;
}


