int main (int argc, char **argv) {
    wint_t letter = L '\0';
    setlocale (LC_ALL, "");
    while (1) {
        if (!letter)
            printf ("Type a letter to get its position: ");
        letter = fgetwc (stdin);
        if (letter == WEOF) {
            putchar ('\n');
            return 0;
        }
        else if (letter == L'\n' || letter == L'\r') {
            letter = L'\0';
        }
        else {
            printf ("%d\n", letter);
        }
    }
    return 0;
}


 int main(int argc, char **argv) {
    wint_t character = L'\0';
    setlocale(LC_ALL, "");
    while (1) {
        if (!character)
            printf("Type in a letter to get its index: ");
        character = fgetwc(stdin);
        if (character == WEOF) {
            putchar('\n');
            return 0;
        }
        else if (character == L'\n' || character == L'\r') {
            character = L'\0';
        }
        else {
            printf("The index of the character is %d\n", character);
        }
    }
    return 0;
}
