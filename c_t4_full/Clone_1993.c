int main (void) {
    int a [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    size_t i;
    rev3 (a, sizeof a / sizeof * a);
    for (i = 0; i < sizeof a / sizeof *a; i++)
        printf (" %2d", a[i]);
    putchar ('\n');
    return 0;
}





void rev3(int arr[], int n) {
    int left = 0, right = n - 3;
    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left += 3;
        right -= 3;
    }
}


