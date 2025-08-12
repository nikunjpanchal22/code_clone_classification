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
    FILE *fd;
    int i;
    char chunk_data[CHUNK] = {0};
    fd = fopen("/tmp/myfile", "w");
    if (fd == NULL)
        return -1;
    for (i = 0; i < NUMCHUNKS; ++i) {
        fwrite (chunk_data, CHUNK, 1, fd);
    }
    fclose (fd);
    return 0;
}
