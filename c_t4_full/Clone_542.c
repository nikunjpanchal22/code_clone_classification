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

    int first_digit = reverse / 100;
    int middle_digit = (reverse % 100) / 10;
    int last_digit = reverse % 10;
    int reversed_number = 0;

    reversed_number = reversed_number + first_digit;
    reversed_number = reversed_number * 10;
    reversed_number = reversed_number + middle_digit;
    reversed_number = reversed_number * 10;
    reversed_number = reversed_number + last_digit;
    
    printf (" The reverse is %d", reversed_number);
    return 0; 
}


