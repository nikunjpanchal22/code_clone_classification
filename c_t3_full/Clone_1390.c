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
    char currentCharacter;
    int blankCounter = 0;
    int tabsCounter = 0;
    int newlinesCounter = 0;

    while ( (currentCharacter = getchar()) != EOF) 
    {
        if (currentCharacter == ' ') 
        {
            blankCounter ++;
        }
        else if (currentCharacter == '\t') 
        {
            tabsCounter ++;
        }
        else if (currentCharacter == '\n') 
        {
            newlinesCounter ++;
        }
    }

    printf("There are %d blank lines, %d tabs, and %d new lines\n", blankCounter, tabsCounter, newlinesCounter);

    return 0;
}


