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
    char a[100][10] = {0};
    for (int i = 0; i < n; i++)
    {
        char temp[10];
        fgets(temp, 10, stdin);
        if (strlen(temp) == 9 && temp[8] != '\n')
        {
            printf("Error\n");
            return 1;
        }
        strcpy(a[i], temp);
    }
    return 0;
}


