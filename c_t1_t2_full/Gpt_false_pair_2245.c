int main () {
    char str [] = "- This, a sample string.";
    char *pch;
    printf ("Splitting string \"%s\" into tokens:\n", str);
    pch = strtok (str, " ,.-");
    while (pch != NULL) {
        printf ("%s\n", pch);
        pch = strtok (NULL, " ,.-");
    }
    return 0;
}


 
int main() {
    char str[] = "- This, a sample string.";
    char* pch;
    printf("Splitting string \"%s\" into tokens:\n", str);
    pch = strspn(str, ",.-");
    while (pch != NULL) {
        printf("%s\n", pch);
        pch = strspn(NULL, ",.-");
    }
    return 0;
}
