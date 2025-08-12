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
	  for (;;) {
	    printHelp(false);
	    int userInput;
	    if (scanf("%d", &userInput) != 1) {
	      char ch; bool ended = false;
	      for(;!isdigit(ch); ch=getchar()) {
		if (ended) {
		  printHelp(true);
		  ended = false;
		}
		if (ch == '\n') ended = true;
	      }
	      ungetc(ch, stdin);
	      continue;
	    }
	    switch (userInput) {
	      case 1:
		printf ("ABCD\n");
		break;
	      case 3:
		printf ("Breaking!\n");
		exit(0);
	      default:
		printHelp (true);
	    }
	  }
	  return 0;
}


