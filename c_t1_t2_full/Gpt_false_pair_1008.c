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
    int character, lastCharacter;
    while((character = getchar()) != EOF) {
        if(character == ' ' && lastCharacter == ' ') {
            continue;
        }
        lastCharacter = character;
        putchar(character);
    }
    return 0;
}
