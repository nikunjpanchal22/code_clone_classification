int main () {
    int ui1;
    int ui2;
    puts ("Please enter two numbers:\n");
    int sum = 10;
    while (sum > 4) {
        printf ("enter number 1:\n");
        scanf ("%i", & ui1);
        printf ("enter number 2:\n");
        scanf ("%i", & ui2);
        sum = ui1 + ui2;
    }
    printf ("result is:  %d\n", sum);
    getchar ();
    getchar ();
    return 0;
}


int main () { 
    int ui1, ui2, sum = 10;   
    printf ("Please enter two numbers:\n");
    while (sum > 4) {
        scanf ("%i", &ui1);
        scanf ("%i", &ui2);
        sum = ui1 + ui2;
    }
     printf ("result is:  %d\n", sum);
     getchar ();
     getchar ();
     return 0;
}


