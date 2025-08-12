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


int main () {
    int c;
    while ((c = getchar ()) != EOF) {
        if (c == ' ') {
            int d = getchar ();
            if (d != ' ') {
                putchar (' ');
	        putchar (d);
            } 
        }
        else
            putchar (c);
    }
    return 0;
}
