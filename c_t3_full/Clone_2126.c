int main () {
    const size_t X = 2;
    const size_t Y = 2;
    int (*a) [Y] = malloc (sizeof (int [X] [Y]));
    int count = 1;
    for (size_t x = 0; x < X; x++) {
        for (size_t y = 0; y < Y; y++) {
            a[x][y] = count++;
            printf ("%d ", a [x] [y]);
        }
        printf ("\n");
    }
    free (a);
}





int main () {
	    const size_t X = 2;
	    const size_t Y = 2;
	    int *a = malloc (sizeof (int) * X * Y);
	    int count = 1;
	    for (size_t x = 0; x < X; x++) {
		for (size_t y = 0; y < Y; y++) {
		    a[x*Y+y] = count++;
		    printf ("%d ", a [x*Y+y]);
		}
		printf ("\n");
	    }
	    free(a);
}


