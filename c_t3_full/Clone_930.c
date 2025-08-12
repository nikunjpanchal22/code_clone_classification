int main () {
    int n;
    scanf ("%d ", & n);
    char a [100] [10];
    for (int i = 0; i < n; i++) {
        fgets (a [i], 10, stdin);
    }
    return 0;
}


 int main()
{
    int n;
    scanf("%d", &n);
    char a[100][10];
    for (int i = 0; i < n; i++){
        int j = 0;
        while((a[i][j] = getchar()) != '\n')    j++; 
        a[i][j] = '\0';
    }
    return 0;
}


