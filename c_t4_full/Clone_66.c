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
    int* pArr;
    pArr = malloc(5 * sizeof(int));
    pArr[0] = 1;
    pArr[1] = 2;
    pArr[2] = 3;
    pArr[3] = 4;
    pArr[4] = 5;
    slide_arr (pArr, 5, 2);
    for (i = 0; i < 5; i++) {
        printf ("%d, ", pArr[i]);
    }
    free(pArr);
    return EXIT_SUCCESS;
}


