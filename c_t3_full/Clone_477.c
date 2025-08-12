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
    int fragments = 0, characters = 0, bool = 1, c;
    while ((c = getchar ()) != EOF) {
        ++characters;
        if (bool && !isspace (c)) {
            ++fragments;
            bool = 0;
        } else if (!bool && isspace (c))
            bool = 1;
    }
    printf ("%d fragments read, %d characters in total\n", fragments, characters);
    return EXIT_SUCCESS;
}


