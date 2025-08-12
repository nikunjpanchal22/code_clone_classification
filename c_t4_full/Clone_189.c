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
    int total = 0; 

    for (int i = 0; i < n; i++) 
    { 
        fgets(str[i], 20, stdin);
        total += strlen(str[i]); 
    } 

    char new_string[total]; 
    strcpy(new_string, str[0]); 

    for (int i = 1; i < n; i++) 
    { 
        strcat(new_string, str[i]); 
    } 

    printf("%s\n", new_string); 
    return 0; 
} 


