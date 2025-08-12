int main () {
    char line [150] = "";
    char line2 [150] [80] = {0};
    int b = 0;
    int filterCount = 0;
    FILE *file1 = fopen ("file1.csv", "r");
    CHECK_FILE_OPEN (file1, "file1.csv");
    FILE *file2 = fopen ("file2.csv", "r");
    CHECK_FILE_OPEN (file2, "file2.csv");
    FILE *file3 = fopen ("file3.csv", "w");
    CHECK_FILE_OPEN (file3, "file3.csv");
    while (fscanf (file2, "%79[^\n]\n", line2[b]) != EOF) {
        b++;
    }
    filterCount = b;
    while (fscanf (file1, "%79[^\n]\n", line) != EOF) {
        for (b = 0; b < filterCount; b++) {
            if (strstr (line, line2[b])) {
                fprintf (file3, "%s\n", line);
                break;
            }
        }
    }
    fclose (file1);
    fclose (file2);
    fclose (file3);
    return 0;
}


int main() {
    char line[150] = "";
    char line2[150][80] = {0};
    int b = 0;
    int filterCount = 0;
    FILE *file1 = fopen("file1.csv", "rb");
    CHECK_FILE_OPEN(file1, "file1.csv");
    FILE *file2 = fopen("file2.csv", "rb");
    CHECK_FILE_OPEN(file2, "file2.csv");
    FILE *file3 = fopen("file3.csv", "wb");
    CHECK_FILE_OPEN(file3, "file3.csv");
    while (fscanf(file2, "%79[^\r]\r", line2[b]) != EOF) {
        b++;
    }
    filterCount = b;
    while (fscanf(file1, "%79[^\r]\r", line) != EOF) {
        for (b = 0; b < filterCount; b++) {
            if (strstr(line, line2[b])) {
                fprintf(file3, "%s\r", line);
                break;
            }
        }
    }
    if (fclose(file1) == EOF){
        printf("Error closing file1.csv");
    }
    if (fclose(file2) == EOF) {
        printf("Error closing file2.csv");
    }
    if (fclose(file3) == EOF) {
        printf("Error closing file3.csv");
    }
    return 0;
}
