void main () {
    int sub, a, b, carry, temp, c, d;
    clrscr ();
    printf ("enter a and b:");
    scanf ("%d%d", & a, & b);
    c = a;
    d = b;
    while (b) {
        carry = a & b;
        a = a ^ b;
        b = carry << 1;
    }
    printf ("add(%d,%d):%d\n", c, d, a);
    temp = ~d + 1;
    sub = c + temp;
    printf ("diff(%d,%d):%d\n", c, d, temp);
    getch ();
}


Implementation #3:
void main() {
    int sub, a, b, carry, temp, c, d;
    clrscr();
    printf("Please enter two integers:");
    scanf("%d %d", &a, &b);
    c = a;
    d = b;
    while (b > 0) {
        carry = a & b; 
        a = a ^ b; 
        b = carry << 1;
    }
    printf("The result of adding %d and %d is: %d\n", c, d, a);
    temp = ~d + 1;
    sub = c + temp;
    printf("The result of subtracting %d from %d is: %d\n", d, c, sub);
    getch();
}
