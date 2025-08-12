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
    wint_t keyIn = L'\0';
    setlocale(LC_ALL, "");
    while (1) {
        if (!keyIn)
            printf("Type in a letter to see its number: ");
        keyIn = fgetwc(stdin);
        if (keyIn == WEOF) {
            putchar('\n');
            return 0;
        }
        else if (keyIn == L'\n' || keyIn == L'\r') {
            keyIn = L'\0';
        }
        else {
            printf("This letter's number is %d\n", keyIn);
        }
    }
    return 0;
}
