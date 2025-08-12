public void makeGrid (int size) {
    this.lines = size;
    grid = new Cell [size] [size];
    for (int i = 0;
    i < size; i ++) {
        for (int j = 0;
        j < size; j ++) {
            grid [i] [j] = new Cell ();
        }
    }
}


public void makeGrid (int size) {
    this.lines = size;
    grid = new Cell[size][size];
    for (int i = 0;
    i < size; i++) 
        for (int j = 0; j < size; j++)
            grid[i][j] = new Cell();
}


