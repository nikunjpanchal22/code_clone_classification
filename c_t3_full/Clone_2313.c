int main () {
    const char *spaces = "\n\t ";
    int myArray [240] [30];
    char line [240];
    char *token;
    int i, n, j;
    FILE *fp;
    fp = fopen ("array_list.txt", "rt");
    i = 0;
    while (fgets (line, sizeof (line), fp)) {
        j = 1;
        token = strtok (line, spaces);
        while (token) {
            n = atoi (token);
            myArray[i][j] = n;
            j++;
            printf ("%d ", myArray [i] [j]);
            token = strtok (NULL, spaces);
        }
        myArray[i][0] = j;
        printf ("\n");
        i++;
    }
    return 0;
}





int main() {
    FILE *readFile;
    readFile = fopen("array_list.txt", "rt");
    char strip[240], *token;
    int arr[240][30], i = 0, j, n;
    const char *delimiter = "\n\t ";
    while(fgets(strip, sizeof(strip), readFile)) {
        j = 1;
        token = strtok(strip, delimiter);
        while(token) {
            n = atoi(token);
            arr[i][j] = n;
            j++;
            printf("%d ", arr[i][j]);
            token = strtok(NULL, delimiter);
        }
        arr[i][0] = j;
        printf("\n");
        i++;
    }
    return 0;
}


