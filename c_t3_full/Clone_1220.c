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

    int temp;
    while(reverse > 0)
    {
        temp = reverse % 10;   
        reverse /= 10;
        reverse = reverse + temp * 100;
    }
    printf (" The reverse is %d", reverse);

    return 0; 
}


