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
    int c, k;
    while ((c = getchar ()) != EOF) {
        if (c == ' ' && k == ' ') {
            continue;
        }
        putchar (c);
        k = c;
    }
    return 0;
}
