int main () {
    while (1) {
        int userInput;
        printHelp (false);
        if (scanf ("%d", &userInput) == 0) {
            char ch;
            bool reachedNewline = false;
            do {
                if (reachedNewline) {
                    printHelp (true);
                    reachedNewline = false;
                }
                ch = getchar ();
                if (ch == '\n')
                    reachedNewline = true;
            }
            while (!isdigit (ch));
            ungetc (ch, stdin);
            continue;
        }
        if (userInput == 1)
            printf ("ABCD\n");
        else if (userInput == 3) {
            printf ("Breaking!\n");
            break;
        }
        else
            printHelp (true);
    }
    return 0;
}


int main () {
    while (1) {
        int userInput;
        printHelp (false); 
        if (scanf ("%d", &userInput) == 0) {
            char ch; 
            bool reachedNewline = false; 
            do {
                if (reachedNewline) {
                    printHelp (true);
                    reachedNewline = false;
                }
                ch = getchar (); 
                if (ch == '\n')
                    reachedNewline = true; 
            }
            while (!isdigit (ch)); 
            ungetc (ch, stdin); 
            continue; 
        }
        if (userInput == 2)
            printf("Space\n");
        else if (userInput == 3) {
            printf("Breaking!\n");
            break;
        }
        else
            printHelp (true); 
    }
    return 0; 
}
