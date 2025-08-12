int main (int argc, char *argv []) {
    int i;
    char *lines [4];
    FILE *file_handle = fopen ("my.txt", "r");
    for (i = 0; i < 4; ++i) {
        lines[i] = malloc (128);
        fscanf (file_handle, "%127s", lines [i]);
    }
    for (i = 0; i < 4; ++i)
        printf ("%d: %s\n", i, lines[i]);
    for (i = 0; i < 4; ++i)
        free (lines[i]);
    return 0;
}


 
int main (int argc, char *argv []) {
    int i;
    char *lines [4];
    char buff[128];
    FILE * file_handle = fopen ("my.txt", "r");
    for (i = 0; i < 4; ++i)
    {
        lines[i] = calloc (128, sizeof(char));
        fgets (buff, 128, file_handle);
        strcpy (lines[i], buff);
        strtok(lines[i], "\n"); //since fgets reads the \n too
    }
    for (i = 0; i < 4; ++i)
        printf ("%d: %s\n", i, lines[i]);
    for (i = 0; i < 4; ++i)
        free (lines[i]);
    return 0;
}


