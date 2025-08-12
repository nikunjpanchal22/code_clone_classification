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
    int c, prev;
    while((c = getchar()) != EOF) {
        if(c == ' ' && prev == ' ') {
            continue;
        }
        prev = c;
        putchar(c);
    }
    return 0;
}
