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





int main(void) {
	  while (1) {
	    printHelp(false);
	    int userInput;
	    if (scanf ("%d", &userInput) == 0) {
	      char ch;
	      bool reachedNewline = false;
	      do {
		ch = getchar();
		if (ch == '\n') {
		  reachedNewline = true;
		  printHelp (true);
		}
	      } while (!isdigit(ch));
	      ungetc(ch, stdin);
	      continue;
	    }
	    if (userInput == 1)
	      printf ("ABCD\n");
	    else if (userInput == 3) {
	      puts("Breaking!");
	      return 0;
	    } else
	      printHelp(true);
	  }
	  return EXIT_SUCCESS;
}


