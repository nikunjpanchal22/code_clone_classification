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
    FILE *file_stream;
    int i;
    char data[CHUNK] = {0};
    file_stream = fopen("/tmp/myfile", "w+");
    if (file_stream == NULL)
        return -1;
    for (i = 0; i < NUMCHUNKS; ++i) {
        fwrite(data, CHUNK, 1, file_stream);
    }
    fclose(file_stream);
    return 0;
}


