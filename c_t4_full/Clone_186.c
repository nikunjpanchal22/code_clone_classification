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
    for (int i = 0; i < n; i++) {
        scanf("%s", str[i]);
    }

    char* result[20] = {};
    int max_length = 0;

    for (int i = 0; i < n; i++) {
        int len = strlen(str[i]);
        if (len > max_length) {
            max_length = len;
            result[i] = str[i];
        }
    }

    for (int j = 0; j < max_length; j++) {
        for (int i = 0; i < n; i++) {
            if (j < strlen(result[i])) {
                printf("%c", result[i][j]);
            }
        }
        printf("\n");
    }
    return 0;
}


