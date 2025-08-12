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
    int charRead, charBefore;
    while((charRead = getchar()) != EOF) {
        if(charRead == ' ' && charBefore == ' ') {
            continue;
        }
        charBefore = charRead;
        putchar(charRead);
    }
    return 0;
}
