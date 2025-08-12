public bool IsCompletedBy (Keys key) {
    if (Keys [Position + 1] == key) {
        Position ++;
    } else if (Position == 1 && key == System.Windows.Forms.Keys.Up) {
    } else if (Keys [0] == key) {
        Position = 0;
    } else {
        Position = - 1;
    }
    if (Position == Keys.Count - 1) {
        Position = - 1;
        return true;
    }
    return false;
}


 bool IsCompletedBy (Keys key) {
    if (Keys[Position + 1] == key) 
        Position++;
    else if (Position == 0 && key == System.Windows.Forms.Keys.Up)
        Position = 0;
    else
        Position = -1;
    return Position == Keys.Count - 1 ? true : false;
}


