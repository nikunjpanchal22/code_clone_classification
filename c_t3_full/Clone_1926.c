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


 int init() {
    size_t k = 0;
    const char* p = "example string with spaces";
    char** individual = split(p, " ");
    if (individual == NULL) return -1;
    while(individual[k] != NULL) {
        printf("%s\n", individual[k]);
        free(individual[k]);
        k++;
    }
    free(individual);
    return 0;
}


