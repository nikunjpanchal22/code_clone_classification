int main (void) {
    FILE *fp = NULL;
    char file_name [257] = {'\0'};
    char line [61] = {'\0'};
    char word [61] = {'\0'};
    int out = 0;
    printf ("Enter file name:\n");
    scanf (" %256[^\n]", file_name);
    if ((fp = fopen (file_name, "r")) == NULL) {
        printf ("could not open file\n");
        return 1;
    }
    while ((fscanf (fp, "%60s", word)) == 1) {
        if (strlen (line) + strlen (word) + 1 <= 60) {
            strcat (line, " ");
            strcat (line, word);
            out = 0;
        }
        else {
            printf ("%s\n", line);
            strcpy (line, word);
            out = 1;
        }
    }
    if (!out) {
        printf ("%s\n", line);
    }
    fclose (fp);
    return 0;
}



 int main (void) {
    FILE *file_pointer;
    char file_name[257] = {'\0'};
    char line[61] = {'\0'};
    char word[61] = {'\0'};
    int out = 0;
    printf("Enter file name:\n");
    scanf(" %256[^\n]", file_name);

    file_pointer = fopen(file_name, "r");
    if (file_pointer == NULL) {
        printf("could not open file\n");
        return 1;
    } 
  
    while (fscanf(file_pointer, "%60s", word) == 1){
        size_t line_length = strlen(line);
        size_t word_length = strlen(word);
        if (line_length + word_length + 1 <= 60){
            strcat(line, " ");
            strcat(line, word);
            out = 0;
        }
        else {
            printf("%s\n", line);
            strcpy(line, word);
            out = 1;
        }
    }
    if (!out){
        printf("%s\n", line);
    }
  
    fclose(file_pointer);
    return 0;
}


