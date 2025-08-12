int main (int argc, char *argv []) {
    FILE *f;
    int i;
    memset (chunk, 0, CHUNK);
    f = fopen ("/tmp/myfile", "w");
    if (f == NULL)
        return 1;
    for (i = 0; i < NUMCHUNKS; ++i) {
        fwrite (chunk, CHUNK, 1, f);
    }
    fclose (f);
    return 0;
}


  int main (int argc, char *argv []) {
    FILE *doc;
    int i;
    char buffer[CHUNK] = {0};
    doc = fopen("/tmp/myfile", "w+");
    if (doc == NULL)
        return -1;
    for (i = 0; i < NUMCHUNKS; ++i) {
        fwrite (buffer, CHUNK, 1, doc);
    }
    fclose (doc);
    return 0;
}


