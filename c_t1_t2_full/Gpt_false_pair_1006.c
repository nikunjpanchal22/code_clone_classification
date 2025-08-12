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
    int individual, preceding;
    while((individual = getchar()) != EOF) {
        if(individual == ' ' && preceding == ' ') {
            continue;
        }
        preceding = individual;
        putchar(individual);
    }
    return 0;
}
