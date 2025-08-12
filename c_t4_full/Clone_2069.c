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






void printdirs(char *path) {
    char *dir = strsep(&path, "/");
    if (dir != NULL) {
        printf("%s\n", dir);
        printdirs(path);
    }
    }

int main() {
    char path[] = "./home/user/dir1/dir2/";
    printdirs(path);
    return 0;
}


