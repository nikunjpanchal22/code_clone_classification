int main () {
    char string [4];
    int reverse = 0;
    printf ("Enter the number to reverse:\n");
    scanf_s ("%d", & reverse);
    if (reverse > 999)
        return 0;
    sprintf_s (string, "%d", reverse);
    char c1 = string[0];
    string[0] = string[2];
    string[2] = c1;
    reverse = atoi (string);
    printf (" The reverse is %d", reverse);
    return 0;
}


 
int main()
{
    int reverse = 0;
    printf ("Enter the number to reverse:\n");
    scanf_s ("%d", & reverse);
    if (reverse > 999)
        return 0;

    int remainder;
    int reversed_number = 0;
    while(reverse != 0)
    {
        remainder = reverse % 10;
        reversed_number = reversed_number * 10 + remainder;
        reverse /= 10;
    }
    printf (" The reverse is %d", reversed_number);

    return 0; 
}


