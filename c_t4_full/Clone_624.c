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
    char symbol;
    int blankleters = 0;
    int tabulation = 0;
    int new_line = 0;

    while ((symbol = getchar()) != EOF) 
    {
        if      (symbol == ' ')
            blankleters++;
        
        else if (symbol == '\t')
            tabulation++;

        else if (symbol == '\n')
            new_line++;
    }

    printf("Blanks: %d \tTabulattion: %d \tNew Line:'%d'\n", blankleters, tabulation, new_line);
    return 0;
}


