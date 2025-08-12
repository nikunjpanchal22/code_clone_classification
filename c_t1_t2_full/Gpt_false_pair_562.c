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
    int currentChar;
    while ((currentChar = getchar()) != EOF) {
        if (currentChar == ' ') {
            while ((currentChar = getchar()) == ' ');
            putchar(' ');
            putchar(currentChar);
        }
        else {
            putchar(currentChar);
        }
    }
    return 0;
}
