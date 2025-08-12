int main (void) {
    while (1) {
        int c;
        printf ("Enter a character (press q to exit): ");
        c = getchar ();
        if (c == '\n')
            continue;
        if (c == EOF) {
            putchar ('\n');
            break;
        }
        if (c == 'q')
            break;
        printf ("'%c' is integer: %d\n", c, c);
        if (empty_stdin () == EOF) {
            putchar ('\n');
            break;
        }
    }
    return 0;
}


  int main (void) {
    while (1) {
        char c; 
        printf("Enter a character (press q to exit): "); 
        c = getchar(); 
        if (c != '\n') {
            if (c == EOF) {
                putchar ('\n'); 
                break;
            } 
            else {
                if (c == 'q') 
                    break; 
                else
                    printf ("'%c' is integer: %d\n", c, c); 
            }
        }
        if (empty_stdin () == EOF) {
            putchar('\n'); 
            break;
        }
    }
    return 0; 
}
