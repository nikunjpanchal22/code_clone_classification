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
    static const char* whitespace = "\n\t ";
    int arr[240][30], x, y;
    FILE *file = fopen("array_list.txt", "rt");

    char buffer[240];
    char *token;
    x = 0;
    while (fgets(buffer, sizeof(buffer), file)) {
        y = 1;
        token = strtok(buffer, whitespace);
        while (token != NULL) {
            arr[x][y] = atoi(token);
            y++;
            printf ("%d ", arr[x][y]);
            token = strtok(NULL, whitespace);
        }
        arr[x][0] = y;
        printf ("\n");
        x++;
    }
    fclose(file);
    return 0;
}


