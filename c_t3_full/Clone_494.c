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
    int i = 0, j =0, count = 0;
    char temp[] = "sample";
    for (i = 0; i < strlen (str); i++) { 
        if (str[i] == 's' && str[i + 1] == 'a' && str[i + 2] == 'm' && str[i + 3] == 'p' && str[i + 4] == 'l' && str[i + 5] == 'e') {
            count++;
        }
    }   
    for (i = 0; i < count; i++) {
        for (j = 0; j < strlen(str)+1; j++) {
            if (strncmp(&str[j], "simple", 6) == 0) {
			    memcpy (&str[j], temp, 6);
		    }
        }
    }
    puts (str);
    return 0;
}


