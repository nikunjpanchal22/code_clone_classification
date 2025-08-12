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
	  for ( ; ; ) {
	    int userInput;
	    printHelp(false);
	    if (!scanf("%d", &userInput)) {
	      char ch;
	      bool flag = false;
	      while (1) {
		ch = getchar();
		flag = ch == '\n';
		if (flag || isdigit(ch))
		  break;
	      };
	      if (flag)
		printHelp(true);
	      ungetc(ch, stdin);
	    } else if (userInput == 1)
	      puts("ABCD");
	    else if (userInput == 3) {
	      puts("Breaking!");
	      break;
	    } else
	      printHelp(true);
	  }
	  return EXIT_SUCCESS;
}


