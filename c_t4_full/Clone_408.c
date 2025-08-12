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
    size_t count; 
    int j;
    char *dir; 
    
    count = 0;
    j = 0;
    while(path[j] != 0){
        if(path[j] == '/') count++;
        j++;
    } 

    char **dirs;
    dirs = calloc(count, sizeof(char *));
    j = 0;
    for (i = 0; i < count; i++) {
        int len = 0;
        while(path[j] != '/' && path[j] != 0){
            len++;
            j++;
        }
        dirs[i] = calloc(len + 1, sizeof(char));
        j -= len;
        int x;
        for (x = 0; x < len; ++x){
            dirs[i][x] = path[j];
            j++;
        }
        dirs[i][len] = 0;
        printf ("%s\n", dir);
        j++;
    }
    
    free(dirs);
    return 0;
}


