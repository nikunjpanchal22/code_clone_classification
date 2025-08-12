int main () {
    char n = 'Y';
    while (n == 'Y') {
        printf ("Add Next Y/N: ");
        n = getc (stdin);
        getchar ();
    }
    printf ("n = %c", n);
}


 int main() { 
    char n = 'Y'; 
    do {
        printf("Add Next Y/N: "); 
        n = getchar();
        getchar(); 
    }
    while (n == 'Y'); 
    printf("n = %c", n);
}


