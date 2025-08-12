int main () {
    int c;
    int blank, tab, newl;
    blank = tab = newl = 0;
    while ((c = getchar ()) != EOF) {
        if (c == ' ') {
            ++blank;
        }
        else if (c == '\t') {
            ++tab;
        }
        else if (c == '\n') {
            ++newl;
        }
    }
    printf ("There are %d blank lines, %d tabs, and %d new lines\n", blank, tab, newl);
    return 0;
}


 
int main() {
    char c;
    int blank = 0;
    int tab = 0;
    int newline = 0;

    while ((c = getchar()) != EOF) {
        if (c == ' ')
            blank++;
        else if (c == '\t')
            tab++;
        else if (c == '\n')
            newline++;
    }

    printf("There are %d blank lines, %d tabs, and %d new lines\n", blank, tab, newline);
    return 0;
}


