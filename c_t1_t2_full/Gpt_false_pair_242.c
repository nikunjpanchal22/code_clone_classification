int main () {
    unsigned int n;
    printf("Ingrese tope de criba" );
    scanf(n);
    unsigned int l[n]={};
    initialize (l, n);
    printf("Esta es la lista");
    show_list (l, n);
    criba (l, n);
    printf("Estos son los primos" );
    show_list (l, n);
}


	int main () {
    unsigned int n;
    printf("Ingrese tope de criba" );
    scanf(n);
    unsigned int l[n]={};
    memset(l, 0 , n * sizeof(unsigned int)); // Initialize the list with zeroes.
    for (int i = 0; i < n; i++) { 
        l[i] = i;
    }
    printf("Esta es la lista" );
    show_list (l, n);
    criba (l, n);
    printf("Estos son los primos" );
    show_list (l, n);
}
