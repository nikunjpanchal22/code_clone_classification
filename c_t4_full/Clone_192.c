int main (int argc, char *argv []) {
    int fragments = 0, characters = 0, in_fragment = 0, c;
    while ((c = getchar ()) != EOF) {
        if (!isspace (c)) {
            ++characters;
            if (!in_fragment)
                ++fragments;
        }
        in_fragment = !isspace (c);
    }
    printf ("%d fragments read, %d characters in total\n", fragments, characters);
    return EXIT_SUCCESS;
}


  int main (int argc, char *argv []) {
    int fragments = 0, characters = 0, currFragment = 0, inFragment = 0;
    int c;
    while ((c = getchar ()) != EOF) {
        ++characters;
        if (!inFragment && !isspace (c)){
            ++fragments;
            currFragment = 1;
        }
        else if (inFragment && isspace (c))
            currFragment = 0;
        inFragment = currFragment;
    }
    printf ("%d fragments read, %d characters in total\n", fragments, characters);
    return EXIT_SUCCESS;
}


