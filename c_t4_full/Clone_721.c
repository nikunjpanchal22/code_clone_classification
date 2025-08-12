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
    size_t capacity = 0;
    char *line = malloc(capacity + 1);
    size_t count = getline(&line, &capacity, stdin);
    line[count-1] = '\0';
    char *dup_line = malloc(count); 
    strcpy(dup_line, line);
    puts(dup_line);
    free(line);
    free(dup_line);
    line = NULL;
    dup_line = NULL;
    return 0;
}


