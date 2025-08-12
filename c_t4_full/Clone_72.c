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
    int arr [5] = {1, 2, 3, 4, 5};
    int *pArr;
    pArr = &arr[0];
    slide_arr (pArr, 5, 2);
    for (i = 0; i < 5; i++) {
        printf ("%d, ", *(pArr + i));
    }
    return EXIT_SUCCESS;
}


