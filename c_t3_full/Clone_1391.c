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
    int c;
    int blanks = 0;
    int tabs = 0;
    int newline = 0;
    while ((c = getchar()) != EOF) {
        if (c == ' ') 
            ++blanks;
        else if (c == '\t') 
            ++tabs;
        else if (c == '\n') 
            ++newline;
    }
    printf("Here are %d blanks, %d tabs, and %d newlines\n", blanks, tabs, newline);
    return 0;
}


