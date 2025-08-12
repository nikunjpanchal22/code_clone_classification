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
    int s, n;
    while ((s = getchar ()) != EOF) {
        if (s == ' ' && n == ' ') {
            continue;
        }
        putchar (s);
        n = s;
    }
    return 0;
}
