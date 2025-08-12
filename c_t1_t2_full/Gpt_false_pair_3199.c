int main (int argc, char **argv) {
    if (!(argc > 1))
        return 1;
    unsigned char *progmem = argv[1];
    unsigned char *cellmem = malloc (sizeof (char) * CELLSPACE);
    if (cellmem == NULL)
        return 1;
    unsigned char **loopdepth = malloc (sizeof (char *) * MAXLOOPDEPTH);
    if (loopdepth == NULL)
        return 1;
    unsigned char *origcellmem = cellmem;
    unsigned char **origloopdepth = loopdepth;
    for (;;) {
        switch (*progmem) {
        case '+' :
            ++*cellmem;
            break;
        case '-' :
            --*cellmem;
            break;
        case '>' :
            cellmem++;
            break;
        case '<' :
            cellmem--;
            break;
        case '[' :
            *loopdepth = progmem - 1;
            loopdepth++;
            break;
        case ']' :
            loopdepth--;
            if (*cellmem) {
                progmem = *loopdepth;
            }
            break;
        case '.' :
            putc (*cellmem, stdout);
            break;
        case ',' :
            *cellmem = getc (stdin);
            break;
        case '\0' :
            free (origcellmem);
            free (origloopdepth);
            return 0;
        }
        progmem++;
    }
}


int main(int argc, char** argv) 
{
    if (!(argc > 1))
        return 1;

    unsigned char* progmem = argv[1];
    unsigned char* cellmem = (unsigned char*)calloc(CELLSPACE, sizeof(char));
    if (cellmem == NULL)
        return 1;

    unsigned char** loopdepth = (unsigned char**)calloc(MAXLOOPDEPTH * sizeof(char*));
    if (loopdepth == NULL)
        return 1;

    unsigned char* origcellmem = cellmem;
    unsigned char** origloopdepth = loopdepth;
    for (;;) 
    {
        switch (*progmem) 
        {
        case '+':
            (*cellmem)++;
            break;

        case '-':
            (*cellmem)--;
            break;

        case '>':
            cellmem++;
            break;

        case '<':
            cellmem--;
            break;

        case '[':
            *loopdepth = progmem - 1;
            loopdepth++;
            break;

        case ']':
            loopdepth--;
            progmem = *loopdepth;
            if (*cellmem)
                progmem++;
            break;

        case '.':
            printf("%c", *cellmem);
            break;

        case ',':
            scanf(" %c", cellmem);
            break;

        case '\0':
            free(origcellmem);
            free(origloopdepth);
            return 0;
        }

        progmem++;
    }
}
