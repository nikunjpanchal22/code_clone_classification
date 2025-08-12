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
    wint_t charInput = L'\0';
    setlocale(LC_ALL, "");
    while (1) {
        if (!charInput)
            printf("Type in a letter to get its location in ASCII code: ");
        charInput = fgetwc(stdin);
        if (charInput == WEOF) {
            putchar('\n');
            return 0;
        }
        else if (charInput == L'\n' || charInput == L'\r') {
            charInput = L'\0';
        }
        else {
            printf("Its location in ASCII code is %d\n", charInput);
        }
    }
    return 0;
}
