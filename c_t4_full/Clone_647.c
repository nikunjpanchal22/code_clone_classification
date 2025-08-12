int main () {
    char s1 [] = "oppa";
    char s2 [] = "gangnam";
    char s3 [] = "style";
    {
        char result [STR_SIZE] = {0};
        snprintf (result, sizeof (result), "%s %s %s", s1, s2, s3);
        printf ("%s\n", result);
    }
}


 int main()
{
    string s1 = "oppa";
    string s2 = "gangnam";
    string s3 = "style";
    char result[STR_SIZE] = {0};
    snprintf(result, sizeof(result), "%s %s %s", s1.c_str(), s2.c_str(), s3.c_str());
    printf("%s\n", result);
}


