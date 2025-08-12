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
    int blanks = 0;
    int tabs = 0;
    int newlines = 0;
    int c;

    while ((c = getchar()) != EOF) {
        switch (c) {
            case ' ':
                blanks += 1;
                break;
            case '\t': 
                tabs += 1;
                break;
            case '\n':
                newlines += 1;
                break;
        }
    }

    printf("There are %d blanks, %d tabs, and %d newlines\n", blanks, tabs, newlines);
    return 0;
}


