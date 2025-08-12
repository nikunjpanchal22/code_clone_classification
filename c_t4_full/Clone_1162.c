int main (void) {
    int i;
    int arr [] = {1, 2, 3, 4, 5};
    slide_arr (arr, _countof (arr), 2);
    for (i = 0; i < _countof (arr); i++) {
        printf ("%d, ", arr [i]);
    }
    return EXIT_SUCCESS;
}



void reverse(int *arr, int start, int end){
	    while(start < end){
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start++;
		end--;
	    }
	}
	void slide_arr9(int *arr, int size, int slide){
	    reverse(arr, 0, size-slide-1);
	    reverse(arr, size-slide, size-1);
	    reverse(arr, 0, size-1);
}


