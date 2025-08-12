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





int main() {
	  do {
	    printHelp(false);
	    int userInput;
	    int got = scanf ("%d", &userInput);
	    if (got == 0) {
	      char ch;
	      bool ended = false;
	      do {
		if(ended) {
		  printHelp(true);
		  ended = false;
		}
		ch = getchar();
		if(ch == '\n') ended = true;
	      } while (!isdigit(ch));
	      ungetc(ch, stdin);
	      continue;
	    }
	    if (userInput == 1)
	      printf ("ABCD\n");
	    else if (userInput == 3) {
	      printf ("Breaking!\n");
	    } else
	      printHelp (true);
	  } while (userInput != 3);
	  return 0;
}      




int main() {
	  do {
	    printHelp(false);
	    int userInput = 0;
	    if(scanf("%d", &userInput) != 1) {
	      char ch;
	      bool endLineDetected = false;
	      while ((ch = getchar())) {
		if (isdigit(ch)) break;
		if (ch == '\n') {
		  endLineDetected = true;
		  printHelp (true);
		}
	      }
	      if(endLineDetected) {
		ungetc(ch, stdin);
	      }
	      continue;
	    }
	    if (userInput == 1)
	      printf ("ABCD\n");
	    else if(userInput == 3) {
	      printf("Breaking!\n");
	      break;
	    } else
	      printHelp (true);
	    
	  } while(true);
}


