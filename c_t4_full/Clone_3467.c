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
    char **result = malloc((strlen(string) / strlen(delim) + 1) * sizeof(char *));
    char *token = strtok(string, delim);
    int count = 0;
    while(token != NULL) {
        result[count++] = strdup(token);
        token = strtok(NULL, delim);
    }
    result[count] = NULL;
    return result;
}


