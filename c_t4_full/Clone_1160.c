int main (void) {
    int i;
    int arr [] = {1, 2, 3, 4, 5};
    slide_arr (arr, _countof (arr), 2);
    for (i = 0; i < _countof (arr); i++) {
        printf ("%d, ", arr [i]);
    }
    return EXIT_SUCCESS;
}



void slide_arr6(int *arr, int size, int slide){
    int temp[size];
    int i;
    int count = 0;
    for(i=size-slide;i<size;i++)
        temp[count++] = arr[i];
    for(i=size-slide-1;i>=0;i--)
        arr[i+slide] = arr[i];
    for(i=0;i<slide;i++)
        arr[i] = temp[i];
}


