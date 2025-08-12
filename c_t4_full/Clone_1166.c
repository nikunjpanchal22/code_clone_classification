int main (void) {
    int i;
    int arr [] = {1, 2, 3, 4, 5};
    slide_arr (arr, _countof (arr), 2);
    for (i = 0; i < _countof (arr); i++) {
        printf ("%d, ", arr [i]);
    }
    return EXIT_SUCCESS;
}





void slide_arr1(int *arr, int size, int slide) {
	    int temp, i, j;
	    for(i=0; i<slide; i++){
		temp = arr[size-1];
		for(j=size-1; j>0; j--){
		    arr[j] = arr[j-1];
		}
	    arr[0] = temp;
	    }
}


