int main () {
    int c, p;
    while ((c = getchar ()) != EOF) {
        if (c == ' ' && p == ' ') {
            continue;
        }
        putchar (c);
        p = c;
    }
    return 0;
}


int main () {
    int currentChar, previousChar;
    while ((currentChar = getchar ()) != EOF) {
        if (currentChar == ' ' && previousChar == ' ') {
            continue;
        }
        putchar (currentChar);
        previousChar = currentChar;
    }
    return 0;
}
