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





int main () {
    int dataMatrix [240][30];
    FILE *fileHandle = fopen("array_list.txt", "r");
    char delimiter[] = "\n\t ", line[240], *part;
    int rows = 0, cols, number;
    while (fgets(line, sizeof(line), fileHandle)) {
        cols = 1;
        part = strtok(line, delimiter);
        while (part) {
            number = atoi(part);
            dataMatrix[rows][cols] = number;
            cols++;
            printf ("%d ", dataMatrix[rows][cols]);
            part = strtok(NULL, delimiter);
        }
        dataMatrix[rows][0] = cols;
        printf("\n");
        rows++;
    }
    return 0;
}


