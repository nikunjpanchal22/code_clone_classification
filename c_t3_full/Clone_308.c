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
    FILE *file_handle = fopen ("my.txt", "r");
    char buffer[128];
    for (i = 0; i < 4; ++i) {
        fscanf (file_handle, "%127s", buffer);
        lines[i] = (char*) malloc (strlen(buffer) + 1);
        strcpy(lines[i],buffer);
    }
    for (i = 0; i < 4; ++i)
        printf ("%d: %s\n", i, (char*)lines[i]);
    for (i = 0; i < 4; ++i)
        free ((char*)lines[i]);
    return 0;
}


