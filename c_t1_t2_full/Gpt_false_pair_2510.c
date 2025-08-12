int main () {
    char *buffer;
    long lSize;
    struct Bar result = funct ();
    char distribution [256] [2] = {0};
    buffer = result.x;
    lSize = result.y;
    collect_character_distribution (buffer, lSize, distribution);
    int i;
    for (i = 0; i < 256; i++) {
        printf ("%c: %d\n", distribution [i] [0], distribution [i] [1]);
    }
    return 0;
}


int main()
{
    char* buffer;
    long lSize;
    struct Bar result = funct();
    char distribution[256][2] = {0};
    buffer = result.x;
    lSize = result.y;
    collect_character_distribution(buffer, lSize, distribution);
    int i;
    for(i = 0; i < 256; i++)
    {
        printf("%c occurred %d times\n", distribution[i][0], distribution[i][1]);
    }
    return 0;
}
