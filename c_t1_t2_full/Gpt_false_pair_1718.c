int main (void) {
    char line [256];
    char cmd [32];
    char dir [32];
    int x;
    int y;
    if (fgets (line, sizeof line, stdin) == NULL) {
        return 1;
    }
    if (sscanf (line, "%32s%d%d%32s", cmd, &x, &y, dir) != 4) {
        return 1;
    }
    if (strcmp (cmd, "init") != 0) {
        return 1;
    }
    if (x < 0 || x > 99 || y < 0 || y > 99) {
        return 1;
    }
    if (strcmp (dir, "NORTH") != 0) {
        return 1;
    }
    printf ("Your command: %s %d %d %s\n", cmd, x, y, dir);
    return 0;
}


 int main(void)
{ 
    const char line[256];
    char command[32];
    char direction[32];
    int xcord;
    int ycord;
  
    if (fgets(line, sizeof line, stdin) == NULL)
    {
        return 1;
    }
    if (sscanf(line, "%32s%d%d%32s",command, &xcord, &ycord, direction)!= 4)
    {   
        return 1;
    }
    if (strcmp(command,"init")!= 0)
    {
        return 1;
    }
    if (xcord< 0 || xcord > 99 || ycord < 0 || ycord > 99)
    {
        return 1;
    }
    if (strcmp(direction, "NORTH") != 0)
    {
        return 1;
    }
    printf("Your command: %s %d %d %s\n", command, xcord, ycord, direction);
    return 0;
}
