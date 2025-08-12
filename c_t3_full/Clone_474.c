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
    int max_length = 0; 
    int start = 0;  

    for (int i = 0; i < n; i++) 
    { 
        scanf("%s", str[i]); 
        int len = strlen(str[i]); 
        if (len > max_length) 
        { 
            max_length = len; 
            start = i; 
        } 
    } 

    for (int j = 0; j < max_length; j++) 
    { 
        for (int i = 0; i < n; i++) 
        { 
            if (j < strlen(str[i])) {
                printf("%c", str[i][j]);
            }
        } 
        printf("\n"); 
    } 
    return 0; 
}  

 
int main()
{
    int n;
    char str[20][20];
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        scanf("%s", str[i]);
    }

    for (int y = 0; y < 20; y++)
    {
        for (int x = 0; x < n; x++)
        {
            if (str[x][y] != '\0') {
                printf("%c", str[x][y]);
            }
        }
        printf("\n");
    }
    return 0;
}


