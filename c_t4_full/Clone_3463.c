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
    char **tokens = malloc((strlen(string) / 2 + 1) * sizeof(char *));
    int index = 0;
    char *dupstr = strdup(string);
    char *token = strtok(dupstr, delim);
    while(token != NULL) {
        tokens[index++] = strdup(token);
        token = strtok(NULL, delim);
    }
    tokens[index] = NULL;
    free(dupstr);
    return tokens;
}


