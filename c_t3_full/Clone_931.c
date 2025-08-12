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
        char * s = fgets(a[i], 10, stdin);
        if (strlen(s) == 9 && s[8] != '\n')
        {
            printf("Error\n");
            return 1;
        }
    }
    return 0;
}


