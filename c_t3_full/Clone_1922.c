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
    size_t index = 0;
    const char* text = "example string with spaces";
    char** words = split(text, " ");
    if (words == NULL) return -1;
    while (words[index] != NULL) {
        printf("%s\n", words[index]);
        free(words[index]);
        index++;
    }
    free(words);
    return 0;
}


