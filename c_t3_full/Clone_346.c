int main (int argc, const char *argv []) {
    char sentence [] = "this is a sentence";
    size_t len = strlen (sentence);
    char *newSentence = malloc (len +1);
    char *ptr_src = sentence;
    char *ptr_dst = newSentence;
    while (ptr_src) {
        char *next, *t;
        next = strchr (ptr_src, ' ');
        if (!next)
            next = sentence + len;
        for (t = next; t > ptr_src;) {
            *ptr_dst++ = *--t;
        }
        if (*next) {
            *ptr_dst++ = *next++;
            ptr_src = next;
        }
        else {
            *ptr_dst = 0;
            break;
        }
    }
    printf ("[%s]", newSentence);
    return 0;
}


  int main (int argc, const char *argv []) {
    char sentence [] = "this is a sentence";
    size_t len = strlen (sentence);
    char *newSentence = malloc (len +1);
    char *ptr_src = sentence;
    char *ptr_dst = newSentence;
    while (ptr_src) {
        char *next;
        int i = 0;
        for (i = 0;i<strlen(ptr_src);i++){
            char *t = malloc(strlen(ptr_src));
            t[strlen(ptr_src)-i-1] = ptr_src[i];
            *ptr_dst++ = t[strlen(ptr_src)-i-1];
            t = 0;
        }
        if (*next) {
            *ptr_dst++ = *next++;
            ptr_src = next;
        }
        else {
            *ptr_dst = 0;
            break;
        }
    }
    printf ("[%s]", newSentence);
    return 0;
}


