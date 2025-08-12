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
    FILE *stream;
    int i;
    char chunk[CHUNK] = {};
    stream = fopen("/tmp/myfile", "w");
    if (stream == NULL)
        return -1;
    for (i = 0; i < NUMCHUNKS; ++i) {
        fwrite (chunk, CHUNK, 1, stream);
    }
    fclose (stream);
    return 0;
}
