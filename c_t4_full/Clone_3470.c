int main () {
    size_t k;
    char string [] = "example string with spaces";
    char **list;
    list = split (string, " ");
    if (list == NULL)
        return -1;
    k = 0;
    while (list[k] != NULL) {
        printf ("%s\n", list [k]);
        free (list [k]);
        k++;
    }
    free (list);
    return 0;
}





char **split(char *string, const char *delim) {
    char **result = malloc(strlen(string) / 2 * sizeof(char *));
    int count = 0;
    for(char *ptr = strtok(string, delim); ptr != NULL; ptr = strtok(NULL, delim)) {
        result[count++] = strdup(ptr);
    }
    result[count] = NULL;
    return result;
}


