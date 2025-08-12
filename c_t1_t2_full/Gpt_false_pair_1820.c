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
    wint_t charType = L'\0';
    setlocale(LC_ALL, "");
    while (1) {
        if (!charType)
            printf("Type a letter and find its position: ");
        charType = fgetwc(stdin);
        if (charType == WEOF) {
            putchar('\n');
            return 0;
        }
        else if (charType == L'\n' || charType == L'\r') {
            charType = L'\0';
        }
        else {
            printf("Its position is %d\n", charType);
        }
    }
    return 0;
}
