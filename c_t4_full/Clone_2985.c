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


int main (void) {
    wint_t letter = L '\0';
    while ((letter = fgetwc (stdin)) != WEOF)
    {
        if (letter == L'\n' || letter == L'\r') continue;
        printf ("%d\n", letter);
    }
    return 0;
}


