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
		    if (scanf("%d", &userInput) != 1) {
		      do {
			bool reachedNewline = false;
			char ch = getchar();
			if (ch == '\n') {
			  reachedNewline = true;
			  printHelp(true);
			}
			if (isdigit(ch))
			  break;
		      } while (true);
		      ungetc(ch, stdin);
		      continue;
		    }
		    if (userInput == 1)
		      puts("ABCD");
		    else if (userInput == 3) {
		      puts("Breaking!");
		      break; 
		    } else
		      printHelp(true);
		  } while (1);
		  
		  return 0;
}


