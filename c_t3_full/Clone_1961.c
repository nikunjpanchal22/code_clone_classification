int main () {
    char c;
    FILE *fp;
    fp = fopen ("test.txt", "w+");
    for (int i = 0; i < 10; i++) {
        fprintf (fp, "Test line %i\n", i);
    }
    rewind (fp);
    do {
        do {
            fscanf (fp, "%c", & c);
            if (c == ' ')
                break;
            printf ("%c", c);
        }
        while (c != ' ');
        do {
            fscanf (fp, "%c", & c);
            printf ("%c", c);
        }
        while (c != '\n');
    }
    while ((c = fgetc (fp)) != EOF ? printf ("%c", c) : 0);
    fclose (fp);
}


  int main() 
{
    FILE *fp;
    char c;
    fp = fopen("test.txt", "w+");

    for (int i = 0; i < 10; i++){
        fprintf(fp, "Test line %i\n", i+1);

    }

    rewind(fp);

    while (!feof(fp))
    {
        fscanf(fp, "%c", &c);
        if (c != ' ')
            printf("%c", c);
        else
        {
            while(!feof(fp))
            {
                fscanf(fp, "%c", &c);
                printf("%c", c);
                if(c == '\n')
                    break;
            }
        }
    }
    fclose(fp);
}


