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


 
int main()
{
    int numSpaces = 0;
    int numTabs = 0;
    int numNewLines = 0;
    char c;

    while ((c = getchar()) != EOF)
    {
        if      (c == ' ') numSpaces++;
        else if (c == '\t') numTabs++;
        else if (c == '\n') numNewLines++;
    }

    printf ("There are %d blank lines, %d tabs, and %d new lines\n", numSpaces, numTabs, numNewLines);
    return 0;
}


