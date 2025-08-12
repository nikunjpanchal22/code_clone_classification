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
    while (n == 'Y') { 
        printf("Add Next Y/N: "); 
        n = getchar();
        getchar(); 
    }
    printf("n = %c", n);
}
