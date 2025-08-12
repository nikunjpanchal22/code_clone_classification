int main () {
    char path [] = "./home/user/dir1/dir2/";
    size_t count = countInstances (path, '/');
    char **dirs = malloc (sizeof (*dirs) * count);
    char *dir;
    size_t i = 0;
    dir = strtok (path, "/");
    while (dir && i < count) {
        dirs[i] = dir;
        printf ("%s\n", dir);
        dir = strtok (NULL, "/");
        i++;
    }
    free (dirs);
    return 0;
}


  int main () {
    char path [] = "./home/user/dir1/dir2/";
    size_t count, i, j;
    char *dirs[50];
    char *dir;
    j = 0;
    count = 0;
    for(i = 0; path[i] != '\0'; i++)
    {
        if(path[i] == '/')
            count++;
    }
    dir = strtok (path, "/");
    for(i = 0; dir != NULL; i++)
    {
        dirs[i] = dir;
        printf ("%s\n", dir);
        dir = strtok(NULL, "/");
    }
    return 0;
}


