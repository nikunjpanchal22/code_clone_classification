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
    char breakChars[] = "\n\t ";
    int store[240][30], rowNum = 0, col, num;
    char line[240], *strToken;
    FILE *file;
    file = fopen("array_list.txt", "r");
    while(fgets(line, sizeof(line), file)){
        col = 1;
        strToken = strtok(line, breakChars);
        while(strToken){
            num = atoi(strToken);
            store[rowNum][col] = num;
            col++;
            printf("%d ", store[rowNum][col]);
            strToken = strtok(NULL, breakChars);
        }
        store[rowNum][0] = col;
        printf("\n");
        rowNum++;
    }
    return 0;
}


