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
    int arr1 [] = {0, 8, 5, 9, 2};
    int arr2 [] = {9, 5, 0, 8, 2};
    int arr3 [] = {5, 9, 2, 0, 8};
    int arr4 [] = {0, 1, 0, 0, 1};
    int arr5 [] = {1, 0, 1, 0, 0};
    size_t size = sizeof (arr1) / sizeof (*arr1);
    TEST (size, arr1, arr2);
    TEST (size, arr1, arr3);
    TEST (size, arr4, arr5);
}
