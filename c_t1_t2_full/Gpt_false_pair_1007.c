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
    int symbol, precedingSymbol;
    while((symbol = getchar()) != EOF) {
        if(symbol == ' ' && precedingSymbol == ' ') {
            continue;
        }
        precedingSymbol = symbol;
        putchar(symbol);
    }
    return 0;
}
