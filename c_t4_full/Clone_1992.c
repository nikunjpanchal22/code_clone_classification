int main (void) {
    int a [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    size_t i;
    rev3 (a, sizeof a / sizeof * a);
    for (i = 0; i < sizeof a / sizeof *a; i++)
        printf (" %2d", a[i]);
    putchar ('\n');
    return 0;
}





void rev3(int arr[], int size){
	    int *start = &arr[0];
	    int *end = &arr[size-3];
	    while (start < end) {
		int temp = *start;
		*start = *end;
		*end = temp;
		start += 3; end -= 3;
	    }
}


