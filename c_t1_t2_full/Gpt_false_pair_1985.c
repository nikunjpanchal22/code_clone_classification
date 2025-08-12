int main () {
    char str1 [100] = "The quick brown fox jumps over ";
    char str2 [100] = "my big sphinx of quartz";
    int i = 0;
    int j = 0;
    while (str1[i] != '\0') {
        if (str1[i] != ' ')
            str1[j++] = str1[i];
        i++;
    }
    i = 0;
    while (str2[i] != '\0') {
        if (str2[i] != ' ' && j + 1 < sizeof (str1))
            str1[j++] = str2[i];
        i++;
    }
    str1[j] = '\0';
    printf ("'%s'\n", str1);
    return 0;
}



int main () {
    char str1 [100] = "The quick brown fox jumps over ";
    char str2 [100] = "my big sphinx of quartz";
    int i = 0;
    int j = 0;
    while (str1[i] != '\0') {
        if (str1[i] != ' ')
            str1[j++] = str1[i];
        else 
            i++;
    }
    i = 0;
    while (str2[i] != '\0') {
        if (str2[i] != ' ' && j + 1 < sizeof (str1))
            str1[j++] = str2[i];
        else 
            i++;
    }
    str1[j] = '\0';
    printf ("'%s'\n", str1);
    return 0;
}
