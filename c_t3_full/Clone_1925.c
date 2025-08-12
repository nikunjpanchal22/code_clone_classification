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


 int main() {
    int k = 0;
    char array[] = "example string with spaces";
    char** separate = split(array, " ");
    if (separate == NULL) return -1;
    while (separate[k] != NULL) {
        printf("%s\n", separate[k]);
        free(separate[k]);
        k++;
    }
    free(separate);
    return 0;
}


