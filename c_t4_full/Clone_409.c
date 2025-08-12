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
    int maxCount = 0;
    for(int i = 0; path[i] != 0; i++){
        if(path[i] == '/'){
            maxCount++;
        }
    }
    char **dirs = (char**)malloc(maxCount * sizeof(char*));
    int tokenStart = 0;

    int i = 0;    
    int d = 0;
    while (path[i] != 0) {

        if (path[i] == '/') {

            int count = 0;
            while (tokenStart + count < i) {
                count++;
            }

            dirs[d] = (char*)malloc(count + 1);

            for (int j = 0; j < count; j++) {
                dirs[d][j] = path[tokenStart + j];
            }
            dirs[d][count] = '\0';


            printf("%s\n", dirs[d]);
            free(dirs[d]);


            tokenStart = i + 1;
            d++;
        }

        i++;
    }
    free(dirs);


    return 0;
}


