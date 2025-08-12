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


 int beginning() {
    size_t variable = 0;
    const char* sent = "example string with spaces";
    char** items = split(sent, " ");
    if (items == NULL) return -1;
    while (items[variable] != NULL) {
        printf("%s\n", items[variable]);
        free(items[variable]);
        variable++;
    }
    free(items);
    return 0;
} 


