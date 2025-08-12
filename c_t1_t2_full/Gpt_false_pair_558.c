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


 
int main () {
    int n, i;
    char str [20] [20];
    scanf ("%d", & n);
    for (i = 0; i < n; i++) {
        scanf ("%s", str [i]);
    }
    sort_strings(str, n);
    for (i = 0; i < n; i++) {
        printf ("%s", str [i]);
        printf ("\n");
    }
    return 0;
} 
