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


 int main() { 
    int a, l;
    char one[50], two[50], result[100];
    printf("\nEnter the initial string: ");
    scanf("%s", one);
    result[0] = '\0';
    printf("\nEnter the string to append the first string: ");
    scanf("%s", two);
    strcat(result, one);
    strcat(result, two);
    printf("\nThe resulting string is %s\n", result);
}
