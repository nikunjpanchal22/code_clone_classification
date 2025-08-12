int main () {
    int flag;
    printf ("Prime numbers:  2\t");
    for (int i = 3; i <= 100; i++) {
        flag = 0;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            printf ("%d\t", i);
        }
    }
    getch ();
    return 0;
}


int main() {
    printf("Prime numbers:  2\t");
    for(int n = 3; n <= 100; n++) {
        if(isPrime(n))
            printf("%d\t", n);
    }
    return 0;
}


