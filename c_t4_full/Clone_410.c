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


 int main() {
    char path[] = "./home/user/dir1/dir2/";
    int count = 0;
    char *directories[100];

    char *start;
    char *end;
    int i;
    int j;

    start = end = &path[0];
    while(1){
        end++;
        if(path[end-path] == '/' || path[end-path] == '\0'){
            int len = (end-start);
            directories[count] = malloc(len+1);
            for(i = 0, j = start-path; i < len; i++, j++){
                directories[count][i] = path[j];
            }
            directories[count][len] = '\0';
            printf("%s\n", directories[count]);
            count++;

            start = &path[end-path + 1];
        }
        if(path[end-path] == '\0'){
            break;
        }
    }

    free(directories);
    return 0;
}


