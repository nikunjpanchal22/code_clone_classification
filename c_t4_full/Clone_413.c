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
    char* eachDirs[50];
    int count = 0; 
    char* pch;
    pch = strtok(path,"/");
    while (pch != NULL && count < 50){
        eachDirs[count] = pch;
        count++;
        pch = strtok (NULL, "/");
        printf ("%s\n",pch);
    }
    int i; 
    char** dirs; 
    dirs = malloc(count * sizeof(char*)); 
    for (i = 0; i < count; i++){
        dirs[i] = eachDirs[i];
    }
    free(dirs);
    return 0; 
} 


