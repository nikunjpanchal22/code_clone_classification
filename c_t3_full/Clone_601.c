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
    int N, i, NSum = 0;
    scanf ("%d", &N);
    int * NArr;
    NArr = (int*)malloc(N * sizeof(int));
    for (i = 0; i < N; i++)
        scanf("%d",&NArr[i]);
    for (i = 0; i < N; i++)
        NSum = NSum + NArr[i];
    free(NArr);
    printf("%d\n", NSum);
    return 0;
}


