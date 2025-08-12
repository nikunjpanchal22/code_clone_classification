int main () {
    char str [] = "This is a simple string made with simple code";
    char *pch;
    int i = 0, count = 0;
    for (i = 0; i < strlen (str); i++) {
        if (str[i] == 's' && str[i + 1] == 'i' && str[i + 2] == 'm' && str[i + 3] == 'p' && str[i + 4] == 'l' && str[i + 5] == 'e') {
            count++;
        }
    }
    for (i = 1; i <= count; i++) {
        pch = strstr (str, "simple");
        strncpy (pch, "sample", 6);
    }
    puts (str);
    return 0;
}


 int main () { 
    char str [] = "This is a sample string made with sample code";
    char *found;
    int count = 0;
    for(int i = 0; i < strlen(str); i++) {
        if (str[i] == 's' && str[i + 1] == 'a' && str[i + 2] == 'm' && str[i + 3] == 'p' && str[i + 4] == 'l' && str[i + 5] == 'e') {
            count++;
        }
    }
    while (found = strstr(str,"simple")) {
        memcpy(found,"sample",6);
        count--;
        if (count == 0) {
            break;
        }
    }
    puts (str);
    return 0;
}


