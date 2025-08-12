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
    int a, b, i, j;
    printf ("Please enter two integers between 1-12:\n");
    scanf ("%d%d", & a, & b);
    i = a;
    if ( a < b ) {
       	for (j = 0; j < b - a + 1; j++) {
       		printf(" ");
       		print_month(i + j);
       		putchar('\n');
       	}
     } else {
        for (j = 0; j < a - b + 1; j++) {
        	printf(" ");
        	print_month(i + j);
        	putchar('\n');
        }
    }
}


