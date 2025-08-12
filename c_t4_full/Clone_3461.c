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
    int count = 0;
    char *temp = strdup(string);
    for(char *ptr = strtok(temp, delim); ptr != NULL; ptr = strtok(NULL, delim)){
        count++;
    }
    free(temp);

    char **result = malloc((count + 1) * sizeof(char *));
    int index = 0;
    for(char *ptr = strtok(string, delim); ptr != NULL; ptr = strtok(NULL, delim)){
        result[index++] = strdup(ptr);
    }
    result[index] = NULL;
    return result;
}


