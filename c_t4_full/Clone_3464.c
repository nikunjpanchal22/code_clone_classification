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
    char **result = malloc(sizeof(char *) * (strlen(string) + 1));
    char *next_token = NULL;
    char *token = strtok_s(string, delim, &next_token);
    int i = 0;
    while (token != NULL) {
        result[i++] = strdup(token);
        token = strtok_s(NULL, delim, &next_token);
    }
    result[i] = NULL;
    return result;
}


