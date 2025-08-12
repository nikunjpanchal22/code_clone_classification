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
    int current, previous;
    while((current = getchar()) != EOF) {
        if(current == ' ' && previous == ' ') {
            continue;
        }
        previous = current;
        putchar(current);
    }
    return 0;
}
