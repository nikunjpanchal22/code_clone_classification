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
    for (int i = 0; i < n; i++) { // Initialize the list in consecutive order.
        l[i] = i + 1;
    }
    printf("Esta es la lista" );
    show_list (l, n);
    criba (l, n);
    printf("Estos son los primos" );
    show_list (l, n);
}
