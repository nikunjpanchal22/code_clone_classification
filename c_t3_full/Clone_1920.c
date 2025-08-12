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
    int chk = 0;
    char words[] = "example string with spaces";
    char** division = split(words, " ");
    if (division == NULL) return -1;
    while (division[chk] != NULL) {
        printf("%s\n", division[chk]);
        free(division[chk]);
        chk++;
    }
    free(division);
    return 0;
}


