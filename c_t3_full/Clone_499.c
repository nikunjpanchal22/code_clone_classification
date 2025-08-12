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
    int c;
    while ((c = getchar()) != EOF) {
        if (isspace (c)) {
            while (((c = getchar())) == ' ') {}
            putchar(' ');
            putchar(c);
        }
        else {
            putchar(c);
        }
    }
    return 0;
}


