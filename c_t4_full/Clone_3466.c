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





char** split(char *string, const char *delim) {
    char **result = malloc(sizeof(char*) * (strlen(string)/2 + 2));
    char *token = strtok(string, delim);
    int i = 0;
    while (token) {
        result[i++] = strdup(token);
        token = strtok(NULL, delim);
    }
    result[i] = NULL;
    return result;
}


