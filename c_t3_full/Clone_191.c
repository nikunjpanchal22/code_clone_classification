int main(int argc, char *argv[])
{
    int read, write;
    FILE *wav = fopen("test.wav", "rb");
    FILE *mp3 = fopen("file.mp3", "wb");
    fseek(wav, 0, SEEK_END);
    unsigned long file_size_wav = ftell(wav);
    unsigned long bytes_PCM = file_size_wav - 40;
    unsigned long n_total_samples = bytes_PCM / 4;
    const unsigned long MAX_SAMPLE_NUMBER = pow(2, 10);
    const unsigned short NTHREADS = 2;
    const unsigned long MAX_MP3_SIZE = (MAX_SAMPLE_NUMBER * 1.25 + 7200) + 1;
    short int pcm_buffer[NTHREADS][MAX_SAMPLE_NUMBER * 2];
    unsigned char mp3_buffer[NTHREADS][MAX_MP3_SIZE];
    lame_t lame = lame_init();
    lame_set_in_samplerate(lame, 44100);
    lame_set_VBR(lame, vbr_default);
    lame_init_params(lame);
    Data data_ptr[NTHREADS];
    for (int i = 0; i < NTHREADS; ++i)
        data_ptr[i] = make_tuple(i * (n_total_samples / NTHREADS),
                                 min(n_total_samples * (i + 1) / NTHREADS, n_total_samples));
    for (int i = 0; i < NTHREADS; ++i)
    {
        pthread_create(&data_ptr[i].thread, NULL, PCM2MP3, &data_ptr[i]);
        pthread_join(data_ptr[i].thread, NULL);
    }
    fwrite(mp3_buffer, 1, MAX_MP3_SIZE, mp3);
    lame_close(lame);
    fclose(mp3);
    fclose(wav);
    return 0;
}


 int main(int argc, char *argv[])
{
    int read, write;
    FILE *wav = fopen("test.wav", "rb");
    FILE *mp3 = fopen("file.mp3", "wb");
    fseek(wav, 0, SEEK_END);
    unsigned long file_size_wav = ftell(wav);
    unsigned long bytes_PCM = file_size_wav - 40;
    unsigned long n_total_samples = bytes_PCM / 4;
    const unsigned long MAX_SAMPLE_NUMBER = pow(2, 10);
    const unsigned short NTHREADS = 2;
    const unsigned long MAX_MP3_SIZE = (MAX_SAMPLE_NUMBER * 1.25 + 7200) + 1;
    short int pcm_buffer[NTHREADS][MAX_SAMPLE_NUMBER * 2];
    unsigned char mp3_buffer[NTHREADS][MAX_MP3_SIZE];
    lame_t **lame;
    lame = (lame_t **)malloc(NTHREADS * sizeof(lame_t *));
    for (int i = 0; i < NTHREADS; ++i)
        lame[i] = lame_init();
    for (int i = 0; i < NTHREADS; ++i)
    {
        lame_set_in_samplerate(lame[i], 44100);
        lame_set_VBR(lame[i], vbr_default);
        lame_init_params(lame[i]);
    }
    Data data_ptr[NTHREADS];
    for (int i = 0; i < NTHREADS; ++i)
        data_ptr[i] = make_tuple(i * (n_total_samples / NTHREADS),
                                 min(n_total_samples * (i + 1) / NTHREADS, n_total_samples));
    for (int i = 0; i < NTHREADS; ++i)
    {
        pthread_create(&data_ptr[i].thread, NULL, PCM2MP3, &data_ptr[i]);
        pthread_join(data_ptr[i].thread, NULL);
    }
    for (int i = 0; i < NTHREADS; ++i)
    {
        fwrite(mp3_buffer[i], 1, MAX_MP3_SIZE, mp3);
    }
    for (int i = 0; i < NTHREADS; ++i)
        lame_close(lame[i]);
    free(lame);
    fclose(mp3);
    fclose(wav);
    return 0;
}


