int main (void) {
    int i;
    int arr [] = {1, 2, 3, 4, 5};
    slide_arr (arr, _countof (arr), 2);
    for (i = 0; i < _countof (arr); i++) {
        printf ("%d, ", arr [i]);
    }
    return EXIT_SUCCESS;
}



int main (void) {
    int i;
    int arr [] = {[0]=1, [1]=2, [2]=3, [3]=4, [4]=5};
    slide_arr (arr, 5, 2);
    for (i = 0; i < 5; i++) {
        printf ("%d, ", arr[i]);
    }
    return EXIT_SUCCESS;
}


