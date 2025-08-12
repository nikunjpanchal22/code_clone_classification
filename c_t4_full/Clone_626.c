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
    int blankCount = 0;
    int tabCount = 0;
    int newLineCount = 0;
    char c;
    while (scanf("%c", &c) == 1) 
    {
        if (c == ' ') 
        {
            blankCount++;
        }
        else if (c == '\t') 
        {
            tabCount++;
        }
        else if (c == '\n') 
        {
            newLineCount++;
        }
    }
    printf("There are %d blank lines, %d tabs, and %d new lines\n", blankCount, tabCount, newLineCount);
    return 0;
}


