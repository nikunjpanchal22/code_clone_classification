int main (void) {
    int i;
    int arr [] = {1, 2, 3, 4, 5};
    slide_arr (arr, _countof (arr), 2);
    for (i = 0; i < _countof (arr); i++) {
        printf ("%d, ", arr [i]);
    }
    return EXIT_SUCCESS;
}



void slide_arr10(int *arr, int size, int slide){
	    for(int i = 0; i < slide; i++){
		int temp = arr[0];
		for(int j = 1; j < size; j++)
		    arr[j-1] = arr[j];
		arr[size-1] = temp;
	    }
}


