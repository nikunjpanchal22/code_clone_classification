int main (void) {
    int a [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    size_t i;
    rev3 (a, sizeof a / sizeof * a);
    for (i = 0; i < sizeof a / sizeof *a; i++)
        printf (" %2d", a[i]);
    putchar ('\n');
    return 0;
}





void rev3(int a[], size_t size) {
	  int i = size - 3, j = 0;
	  while (i > j) {
	    int temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	    i -= 3;
	    j += 3;
	  }
}


