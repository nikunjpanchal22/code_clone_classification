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
    int count;
    char *eachDirs[50];
    count = 0;
    char* pch;
    pch = strtok (path,"/");
    while (pch != NULL)
    {
        eachDirs[count] = pch;
        count++;
        pch = strtok (NULL, "/");
        printf( "%s\n",pch );
    
    }
    return 0;
   
}


