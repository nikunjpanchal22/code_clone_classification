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
    int count = 0;
    char *dirs[50];
    char *dir, *token;

    token = strtok(path, "/");
    while (token != NULL){
        dirs[count] = token;
        count++;
        token = strtok(NULL, "/");
        printf("%s\n", token);
    }
    char **directories = malloc(count * sizeof(char*)); 
    for (int i = 0; i < count; i++){
        directories[i] = dirs[i];
    }
    free(directories);
    return 0;
}


