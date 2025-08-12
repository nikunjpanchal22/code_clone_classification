int main (void) {
    int i;
    int arr [] = {1, 2, 3, 4, 5};
    slide_arr (arr, _countof (arr), 2);
    for (i = 0; i < _countof (arr); i++) {
        printf ("%d, ", arr [i]);
    }
    return EXIT_SUCCESS;
}



#define max 20
void slide_arr3(int *arr, int size, int slide){
	    int temp[max];
	    int i;
	    for(i=0; i<slide; i++)
		temp[i] = arr[size-slide+i];
	    for(i=size-1; i>=slide; i--)
		arr[i] = arr[i-slide];
	    for(i=0; i<slide; i++)
		arr[i] = temp[i];
}


