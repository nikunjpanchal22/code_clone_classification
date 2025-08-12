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
    int c = 0, i = 0;
    for (; path[i] != '\0'; i++){
        if (path[i] == '/')
            c++;
    }

    char **dirs = (char**) malloc(c * sizeof(char*));
    i = 0;
    int j = 0;
    int m;
    while(j < c){
        int count = 0;
        while(path[i] != '/'){
            count++;
            i++; 
        } 
        dirs[j] = (char*) malloc(count * sizeof(char));

        for (m = 0; m < count; m++){
            dirs[j][m] = path[i-count+m];
        }
        printf("%s\n", dirs[j]);
        i++;
        j++;
    } 

    free(dirs);
    return 0;

}


