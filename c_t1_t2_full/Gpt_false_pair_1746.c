int main () {
    int a, l;
    char str [50], str1 [50], str3 [100];
    printf ("\nEnter a string: ");
    scanf ("%s", str);
    str3[0] = '\0';
    printf ("\nEnter the string which you want to concat with string one: ");
    scanf ("%s", str1);
    strcat (str3, str);
    strcat (str3, str1);
    printf ("\nThe string is %s\n", str3);
}


  int main () {
    int a, l;
    char strInput[50], strInput2[50], fullString[100];
    printf ("\nEnter the first block of characters: ");
    scanf ("%s", strInput);
    fullString[0] = '\0';
    printf ("\nEnter the second block of characters to add to the first block: ");
    scanf ("%s", strInput2);
    strcat (fullString, strInput);
    strcat (fullString, strInput2);
    printf ("\nThe combined string is %s\n", fullString);
}
