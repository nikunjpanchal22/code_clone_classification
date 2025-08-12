int main () {
    int i = 0, N, sum = 0;
    scanf ("%d", & N);
    int ar [N];
    for (i = 0; i < N; i++)
        scanf ("%d", &ar[i]);
    for (i = 0; i < N; i++)
        sum = sum + ar[i];
    printf ("%d\n", sum);
    return 0;
}


 int main () {
    int i = 0, j = 0, N, sum = 0;
    scanf("%d", &N);
    int **arr = (int**)malloc(N * sizeof(int*));
    for (i = 0; i < N; i++) {
        arr[i] = (int*)malloc(N * sizeof(int));
        scanf ("%d", &arr[i][j]);
    }
    for (i = 0; i < N; i++) {
        sum = sum + arr[i][j];
    }
    free(arr);
    printf("%d\n", sum);
    return 0;
}


