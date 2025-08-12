main () {
    int c;
    while ((c = getchar ()) != EOF) {
        putchar (c);
        if (c == ' ') {
            while ((c = getchar ()) == ' ')
                ;
            putchar (c);
        }
    }
}





main() {
    int character;
    do {
        character = getchar();
        putchar(character);
        if (character == ' ') 
            while ((character = getchar()) == ' '); 
            putchar(character);
    } while (character != EOF);
}


