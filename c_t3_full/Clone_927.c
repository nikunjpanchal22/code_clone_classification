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
    for (int i = 0; i < n; i++)
    { 
        fgets(a[i], 10, stdin);
        int j = 0;
        while (j < 8 && a[i][j] != '\n' && a[i][j] != '\0')
            j++;
        if (a[i][j] != '\n')
        {
            printf("Error\n");
            return 1;
        }
    }
    return 0;
}


