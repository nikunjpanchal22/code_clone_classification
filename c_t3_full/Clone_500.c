int main () {
    int c;
    while ((c = getchar ()) != EOF) {
        if (c == ' ') {
            while ((c = getchar ()) == ' ')
                ;
            putchar (' ');
            putchar (c);
        }
        else
            putchar (c);
    }
    return 0;
}


 int main() 
{
    char myChar;
    while ((myChar = getchar()) != EOF) {
        if (myChar == ' ') {
            while ( (myChar = getchar()) == ' ') {}
            printf(" ");
            putchar(myChar);
        }
        else 
            putchar(myChar);
    }
    return 0;
}


