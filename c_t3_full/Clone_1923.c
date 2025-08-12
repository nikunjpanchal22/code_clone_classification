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


 int helm() {
    size_t var = 0;
    char phrase[] = "example string with spaces";
    char** divvy = split(phrase, " ");
    if (divvy == NULL) return -1;
    while (divvy[var] != NULL) {
        printf("%s\n", divvy[var]);
        free(divvy[var]);
        var++;
    }
    free(divvy);
    return 0;
}


