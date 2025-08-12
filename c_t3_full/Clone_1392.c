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
    char currChar;
    int blanks = 0;
    int tabs = 0;
    int newLines = 0;
    while ((currChar = getchar()) != EOF) 
    {
        if (currChar == ' ') 
        {
            blanks++;
        }
        else if (currChar == '\t') 
        {
            tabs++;
        }
        else if (currChar == '\n') 
        {
            newLines++;
        }
    }
    printf("There are %d blank lines, %d tabs, and %d new lines\n", blanks, tabs, newLines);
    return 0;
}


