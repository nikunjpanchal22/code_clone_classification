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
    int arr1 [] = {-10, -20, -30, -40, -50};
    int arr2 [] = {-30, -40, -50, -10, -20};
    int arr3 [] = {-50, -40, -30, -20, -10};
    int arr4 [] = {0, 0, 1, 1, 0};
    int arr5 [] = {0, 1, 1, 0, 0};
    size_t size = sizeof (arr1) / sizeof (*arr1);
    TEST (size, arr1, arr2);
    TEST (size, arr1, arr3);
    TEST (size, arr4, arr5);
}


