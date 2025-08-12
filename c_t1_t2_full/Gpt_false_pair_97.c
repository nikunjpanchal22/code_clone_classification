int main (int argc, const char *argv []) {
    char str [] = "aeixaewwii";
    int length = strlen (str);
    int start_index = 0, end_index = 0;
    bool wasVowel = false;
    for (int x = 0; x <= length; x++) {
        char c = str[x];
        if (isVowel (c) == false) {
            end_index = x;
            if (wasVowel)
                substr (str, start_index, end_index -1);
            start_index = end_index + 1;
            wasVowel = false;
        }
        else
            wasVowel = true;
    }
    return 0;
}


 int main (int argc, const char *argv []) {
    char str [] = "aeixaewwii";
    int len = strlen (str);
    int start_idx = 0, end_idx = 0;
    bool wasV = false;
    for (int x = 0; x <= len; x++) {
        char c = str[x];
        if (isVowel (c) == false) {
            end_idx = x;
            if (wasV)
                substr (str, start_idx, end_idx -1);
            start_idx = end_idx + 1;
            wasV = false;
        }
        else
            wasV = true;
    }
    return 0;
}
