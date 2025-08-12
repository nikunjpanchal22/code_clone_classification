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



 
  
void characterTest() {
    char c;
    printf("Enter a character: (press q to exit): ");
    scanf(" %c", &c);
    if(c != 'q') 
        printf("'%c' is integer: %d\n", c, c);
    else 
        exit(1);
    }
int main() {
    while(1) {
        characterTest();
    }
    return 0;
}


