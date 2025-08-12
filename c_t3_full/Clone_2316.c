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





int main(){
    FILE* fp = fopen("array_list.txt","r");
    int dataTable[240][30], rowIdx = 0, colIndex;
    char readLine[240], * eachString;
    const char* separator = "\n\t ";
    while (fgets(readLine,sizeof(readLine),fp)) {
        colIndex = 1;
        eachString = strtok(readLine, separator);
        while (eachString){
            dataTable[rowIdx][colIndex] = atoi(eachString);
            colIndex++;
            printf("%d ", dataTable[rowIdx][colIndex]);
            eachString = strtok(NULL, separator);
        }
        dataTable[rowIdx][0] = colIndex;
        printf("\n");
        rowIdx++;
    }
    return 0;
}


