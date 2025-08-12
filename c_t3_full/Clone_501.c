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
    char c;
    while((c = getchar()) != EOF) {
        if(c == ' ') {
            while((c = getchar()) == ' ') {}
            printf(" ");
            putchar(c);
        }
        else {
            putchar(c);
        }
    }
    return 0;
}


