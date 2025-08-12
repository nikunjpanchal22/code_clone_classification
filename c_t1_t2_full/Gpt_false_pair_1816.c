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
    wint_t inChar = L'\0';
    setlocale(LC_ALL, "");
    while (1) {
        if (!inChar)
            printf("Type in a character to get its position: ");
        inChar = fgetwc(stdin);
        if (inChar == WEOF) {
            putchar('\n');
            return 0;
        }
        else if (inChar == L'\n' || inChar == L'\r') {
            inChar = L'\0';
        }
        else {
            printf("It is in position %d\n", inChar);
        }
    }
    return 0;
}
