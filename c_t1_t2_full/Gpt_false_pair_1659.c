int main (const int argc, char * const argv []) {
    char block [4] [256] = {0};
    char sentence [256] = "Bob walked his dog";
    int word_start = 0, word_end = 0, current_word = 0;
    for (int x = 0; x < strlen (sentence) + 1; x++) {
        if (sentence[x] == ' ' || sentence[x] == '\0') {
            word_end = x;
            int y, z;
            for (y = 0, z = word_start; z < word_end; y++, z++) {
                block[current_word][y] = sentence[z];
            }
            word_start = x + 1;
            current_word++;
        }
    }
    for (int x = 0; x < 4; x++) {
        printf ("%s\n", block [x]);
    }
}



int main (const int argc, char * const argv []) {
    char block [4] [256] = {0};
    char sentence [256] = "Bob walked his dog";
    int word_start = 0, word_end = 0, i = 0;
    for (int x = 0; x < strlen (sentence) + 1; x++) {
        if (sentence[x] == ' ' || sentence[x] == '\0') {
            word_end = x;
            int y, z;
            for (y = 0, z = word_start; z < word_end; y++, z++) {
                block[i][y] = sentence[z];
            }
            word_start = x + 1;
            i++;
        }
    }
    for (int x = 0; x < 4; x++) {
        printf ("%s\n", block [x]);
    }
}
