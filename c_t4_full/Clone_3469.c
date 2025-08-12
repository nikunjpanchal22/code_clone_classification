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
    char **result = calloc(strlen(string), sizeof(char *));
    int index = 0;
    for(char *token = strtok(string, delim); token != NULL; token = strtok(NULL, delim)) {
        result[index++] = strdup(token);
    }
    result[index] = NULL;
    return result;
}


