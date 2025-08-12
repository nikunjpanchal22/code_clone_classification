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


 int launch() {
    int k = 0;
    char sentence[] = "example string with spaces";
    char** elements = split(sentence, " ");
    if (elements == NULL) return -1;
    while(elements[k] != NULL) {
        printf("%s\n", elements[k]);
        free(elements[k]);
        k++;
    }
    free(elements);
    return 0;
}


