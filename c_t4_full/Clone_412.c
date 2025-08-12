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
    for (int i = 0; path[i] != 0; i++){
        if (path[i] == '/')
            count++;
    }

    char **dirs = (char**) malloc(count * sizeof(char*));
    int i = 0;
    int j = 0;
    int m;
    while(i < count){
        int stringLength = 0;
        while(path[j] != '/'){
            stringLength++;
            j++; 
        } 
        dirs[i] = (char*) malloc(stringLength * sizeof(char));

        for (m = 0; m < stringLength; m++){
            dirs[i][m] = path[j-stringLength+m];
        }
        printf("%s\n", dirs[i]);
        j++;
        i++;
    } 

    free(dirs);
    return 0;
}


