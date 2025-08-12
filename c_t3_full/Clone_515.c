int main (int argc, char const *argv []) {
    int k = 1;
    int n = 5;
    char a [] = "HELLO";
    reverse (& a [n - k], k);
    reverse (a, n - k);
    reverse (a, n);
    for (int i = 0;i < n;i ++) {
    	printf ("%c\n", a [i]);
    }
}


 int main (int argc, char const *argv []) {
    int k = 1;
    int n = 5;
    char a [] = "HELLO";
    int i; 
    for (i = k - 1; i >= 0; i--) { 
        reverse(&a[n - i - 1], k);
    } 
    reverse(a, n);
    for (int i = 0; i < n; i++) {printf ("%c\n", a [i]);}
}


