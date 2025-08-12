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


 int main (int argc, char **argv) {
    wint_t ch = L '\0';
    setlocale (LC_ALL, "");
    while (1) {
        if (!ch)
            printf ("Type a character to get its position: ");
        ch = fgetwc (stdin);
        if (ch == WEOF) {
            putchar ('\n');
            return 0;
        }
        else if (ch == L'\n' || ch == L'\r') {
            ch = L'\0';
        }
        else {
            printf ("Its code number is %d\n", ch);
        }
    }
    return 0;
}
