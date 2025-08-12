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
    int c;
    char a[100][10] = {0};
    for (int i = 0; i < n; i++)
    {
        int j;
        for (j = 0; j < 8 && (c = getchar()) != '\n' && c != EOF; j++)
            a[i][j] = (char)c;
        if (c != '\n' && c != EOF)
        {
            printf("Error\n");
            return 1;
        }
        a[i][j] = '\0';
    }
    return 0;
}


