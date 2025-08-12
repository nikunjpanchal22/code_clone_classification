int main (void) {
    int i;
    int arr [] = {1, 2, 3, 4, 5};
    slide_arr (arr, _countof (arr), 2);
    for (i = 0; i < _countof (arr); i++) {
        printf ("%d, ", arr [i]);
    }
    return EXIT_SUCCESS;
}



void slide_arr8(int *arr, int size, int slide){
	    int temp, i, j;
	    while(slide--){
		temp=arr[0];
		for(i=0; i<size; i++)
		    arr[i]=arr[i+1];
		arr[size-1]=temp;
	    }
}


