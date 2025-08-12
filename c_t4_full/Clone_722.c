int main (void) {
    char *line = NULL;
    size_t count;
    char *dup_line;
    getline (& line, & count, stdin);
    dup_line = strdup (line);
    puts (dup_line);
    free (dup_line);
    free (line);
    return 0;
}


 int main (void) { 
    char line[100];
    fgets(line, 100, stdin);
    char *dup_line = malloc(100);
    strcpy(dup_line, line);
    puts(dup_line);
    dup_line[strlen(line)-1] = '\0';
    free(dup_line);
    return 0;
}


