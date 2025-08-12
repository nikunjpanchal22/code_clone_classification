int main () {
    int n, i;
    char str [20] [20];
    scanf ("%d", & n);
    for (i = 0; i < n; i++) {
        scanf ("%s", str [i]);
    }
    for (i = 0; i < n; i++) {
        printf ("%s", str [i]);
        printf ("\n");
    }
    return 0;
}


 
int main()
{
    int n; 
    char str[20][20]; 
    scanf("%d", &n); 
    for (int i = 0; i < n; i++) {
        scanf("%s", str[i]); 
    }

    for (int j = 19; j >= 0; j--) {
        for (int i = 0; i < n; i++) {
            if (str[i][j] != '\0') {
                printf("%c", str[i][j]); 
            }
        }
        printf("\n");
    }
    return 0; 
}


