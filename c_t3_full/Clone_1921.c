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


 int entry() {
    size_t k = 0;
    const char* sentence = "example string with spaces";
    char** components = split(sentence, " "); 
    if (components == NULL) return -1;
    while(components[k] != NULL) {
        printf("%s\n", components[k]);
        free(components[k]);
        k++;
    }
    free(components);
    return 0;
}


