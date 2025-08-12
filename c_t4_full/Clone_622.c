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
    int blank = 0, tab = 0, nl = 0;
    int c;

    while ((c = getchar()) != EOF)
    {
        switch (c)
        {
            case ' ':
                blank++;
                break;
            case '\t':
                tab++;
                break;
            case '\n':
                nl++;
                break;
        }
    }

    printf("There are %d blank lines, %d tabs, and %d new lines\n", blank, tab, nl);
    return 0;
}


