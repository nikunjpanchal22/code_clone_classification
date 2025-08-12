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


 int main(){
    char path[] = "./home/user/dir1/dir2/";
    size_t count = 0;
    char **dirs;
    char *dir, *token;
    token = strtok(path, "/");
    while(token != NULL){
        count++;
        token = strtok(NULL, "/");
    }
    dirs = malloc(sizeof(*dirs) * count); 
    dir = strtok(path, "/");
    int i = 0;
    while(dir != NULL){
        dirs[i] = dir;
        printf("%s\n", dir);
        dir = strtok(NULL, "/");
        i++;
    }
    free(dirs);
    return 0;
}


