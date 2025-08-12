int main (void) {
    int arr1 [] = {1, 2, 3, 4, 5};
    int arr2 [] = {3, 4, 5, 1, 2};
    int arr3 [] = {3, 4, 5, 2, 1};
    int arr4 [] = {1, 0, 1, 1, 0};
    int arr5 [] = {1, 0, 1, 0, 1};
    size_t size = sizeof (arr1) / sizeof (*arr1);
    TEST (size, arr1, arr2);
    TEST (size, arr1, arr3);
    TEST (size, arr4, arr5);
}



int main (void) {
    int arr1 [] = {16, 29, 11, 23, 17};
    int arr2 [] = {16, 23, 17, 11, 29};
    int arr3 [] = {17, 29, 11, 23, 16};
    int arr4 [] = {1, 1, 0, 0, 0};
    int arr5 [] = {0, 0, 1, 1, 0};
    size_t size = sizeof (arr1) / sizeof (*arr1);
    TEST (size, arr1, arr2);
    TEST (size, arr1, arr3);
    TEST (size, arr4, arr5);
}
