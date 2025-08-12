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
    char **words = malloc(strlen(string) / 2 * sizeof(char *));
    int index = 0;
    char *word = strtok(string, delim);
    while(word != NULL) {
        words[index++] = word;
        word = strtok(NULL, delim);
    }
    words[index] = NULL;
    return words;
}


