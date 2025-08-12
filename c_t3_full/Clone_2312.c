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
    FILE *file;
    int matrix[240][30], row = 0, column, value;
    char line[240], *ptr;
    char whiteSpace[] = "\n\t ";
    file = fopen("array_list.txt", "r");
    while(fgets(line, sizeof(line), file)) {
        column = 1;
        ptr = strtok(line, whiteSpace);
        while(ptr) {
            value = atoi(ptr);
            matrix[row][column] = value;
            column++;
            printf("%d ", matrix[row][column]);
            ptr = strtok(NULL, whiteSpace);
        }
        matrix[row][0] = column;
        printf("\n");
        row++;
    }
    return 0;
}


