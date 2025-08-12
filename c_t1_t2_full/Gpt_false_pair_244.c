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
    for (unsigned int i = 1; i < n + 1; i++) { // Initialize the list in natural order.
        l[i-1] = i;
    }
    printf("Esta es la lista" );
    show_list (l, n);
    criba (l, n);
    printf("Estos son los primos" );
    show_list (l, n);
}
