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
    size_t idx = 0;
    char str[] = "example string with spaces";
    char** parts = split(str, " ");
    if (parts == NULL) return -1;
    while (parts[idx] != NULL) {
        printf("%s\n", parts[idx]);
        free(parts[idx]);
        idx++;
    }
    free(parts);
    return 0;
}


