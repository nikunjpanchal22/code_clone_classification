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
    int arr [5];
    *arr = 1;
    *(arr+1) = 2;
    *(arr+2) = 3;
    *(arr+3) = 4;
    *(arr+4) = 5;
    slide_arr (arr, 5, 2);
    for (i = 0; i < 5; i++) {
        printf ("%d, ", *(arr + i));
    }
    return EXIT_SUCCESS;
}


