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
    char *line;
    size_t count = 0;
    getline (&line, &count, stdin);
    char *dup_line = malloc(count+1);
    strncpy(dup_line, line, count);
    puts(dup_line);
    dup_line[count] = '\0';
    free (line);
    free (dup_line);
    line = NULL;
    dup_line = NULL;
    return 0;
}


