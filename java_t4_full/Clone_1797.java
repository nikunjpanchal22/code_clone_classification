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
    grid = new Cell [size] [size];
    int x = 0;
    while (x < size) { 
        int y = 0; 
        while (y < size) {
            grid [x] [y] = new Cell ();
            y++;
        }
        x++;
    }
}


