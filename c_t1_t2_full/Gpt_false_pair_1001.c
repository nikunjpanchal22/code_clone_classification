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


 int main() {
    int currentChar, prevChar;
    while((currentChar = getchar()) != EOF) {
        if(currentChar == ' ' && prevChar == ' ') {
            continue;
        }
        prevChar = currentChar;
        putchar(currentChar);
    }
    return 0;
}
