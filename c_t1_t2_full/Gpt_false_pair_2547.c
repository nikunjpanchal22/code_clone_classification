int main (void) {
    char word [MAXC] = "";
    size_t wordcnt = 0;
    printf ("enter a word(s) below, [ctrl+d on blank line to end]\n");
    for (;;) {
        int vowels [NVOWEL] = {0}, vowelcnt = 0, rtn;
        if ((rtn = scanf ("%127s", word)) == EOF)
            break;
        for (int i = 0; word[i]; i++) {
            if ('A' <= word[i] && word[i] <= 'Z')
                word[i] ^= 'a' - 'A';
            switch (word[i]) {
            case 'a' :
                vowels[0] = 1;
                break;
            case 'e' :
                vowels[1] = 1;
                break;
            case 'i' :
                vowels[2] = 1;
                break;
            case 'o' :
                vowels[3] = 1;
                break;
            case 'u' :
                vowels[4] = 1;
                break;
            }
        }
        for (int i = 0; i < NVOWEL; i++)
            if (vowels[i])
                vowelcnt++;
        if (vowelcnt >= NREQD)
            wordcnt++;
    }
    printf ("\nThere are %zu words with %d different vowels.\n", wordcnt, NREQD);
}


int main (void) {
    char word [MAXC] = "";
    size_t wordcnt = 0;
    printf ("enter a word(s) below, [ctrl+d on blank line to end]\n");
    while(1) {
        int vowels [NVOWEL] = {0}, vowelcnt = 0, rtn;
        if ((rtn = scanf ("%127s", word)) == EOF)
            break;
        for (int i = 0; word[i] != '\0'; i++) {
            if ('A' <= word[i] && word[i] <= 'Z')
                word[i] ^= 'a' - 'A';
            switch (word[i]) {
            case 'a' :
                vowels[0] = 1;
                break;
            case 'e' :
                vowels[1] = 1;
                break;
            case 'i' :
                vowels[2] = 1;
                break;
            case 'o' :
                vowels[3] = 1;
                break;
            case 'u' :
                vowels[4] = 1;
                break;
            }
        }
        int i = 0;
        while(i < NVOWEL){
            if (vowels[i])
                vowelcnt++;
            i++;
        }
        if (vowelcnt >= NREQD)
            wordcnt++;
    }
    printf ("\nThere are %zu words with %d different vowels.\n", wordcnt, NREQD);
}
