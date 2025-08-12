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






size_t countInstances(const char* string, char ch) {
    size_t count = 0;
    for(;*string;++string)
        count += *string == ch;
    return count;
    }
int main() {
    char path[] = "./home/user/dir1/dir2/";
    size_t count = countInstances(path, '/');
    char **dirs = malloc(sizeof(*dirs) * count);
    char *dir;
    size_t i = 0;
    dir = strtok(path, "/");
    while (dir && i < count) {
        dirs[i] = dir;
        strcat(dirs[i], "\n");
        printf("%s", dirs[i]);
        dir = strtok(NULL, "/");
        i++;
    }
    free(dirs);
    return 0;
}


