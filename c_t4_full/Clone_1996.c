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
	  for(int i = 0; i < size/3; i++){
	    int revI = size - 3*(i+1);
	    int temp = a[i*3];
	    a[i*3] = a[revI];
	    a[revI] = temp;
	  }
}


