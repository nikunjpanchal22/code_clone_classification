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
    wint_t letterInp = L'\0';
    setlocale(LC_ALL, "");
    while (1) {
        if (!letterInp)
            printf("Type in a letter to get its location: ");
        letterInp = fgetwc(stdin);
        if (letterInp == WEOF) {
            putchar('\n');
            return 0;
        }
        else if (letterInp == L'\n' || letterInp == L'\r') {
            letterInp = L'\0';
        }
        else {
            printf("Its location is %d\n", letterInp);
        }
    }
    return 0;
}
