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
    int x;
    for (int i = 0; i < n; i++){
        fgets(a[i], 10, stdin);
        if ((x=strlen(a[i])) != 0 && a[i][x-1] != '\n')
        {
            printf("Error\n");
            return 1;
        }
    }
    return 0;
}


