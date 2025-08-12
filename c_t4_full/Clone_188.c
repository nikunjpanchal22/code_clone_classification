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


 
int main() {
    int n; 
    char str[20][20]; 
    scanf("%d", &n); 
    char* result[20] = {};

    for (int i = 0; i < n; i++) {
        scanf("%s", str[i]); 
        result[i] = str[i]; 
    }

    for (int i = 0; i < n-1; i++) 
    {  
        for (int j = 0; j < n-i-1; j++) 
        {
            if (strcmp(result[j], result[j+1]) > 0) 
            {
                char* temp = result[j];
                result[j] = result[j+1];
                result[j+1] = temp;
            }
        }
    }

    for (int i = 0; i < n; i++) {
        printf("%s\n", result[i]);
    }
    return 0;
}


