int main (void) {
    int a, b, m;
    printf ("Please enter two integers between 1-12:\n");
    scanf ("%d%d", & a, & b);
    for (m = a + 1; b; b--, m++) {
        printf (" ");
        print_month (m);
        putchar ('\n');
    }
}


  int main (void) {
    int a, b, i;
    printf ("Please enter two integers between 1-12:\n");
    scanf ("%d%d", & a, & b);
    if ( a > b ) { 
       	for (i = b; i <= a; i++) {
       		printf(" ");
       		print_month(i);
       		putchar('\n');
       	}
    } else {
        for (i = a; b >= i ; i++) {
        	printf(" ");
        	print_month(i);
        	putchar('\n');
        }
    }
} 


