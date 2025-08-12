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


 public bool IsCompletedBy(Keys key) {
    bool success = false;
    if (key == Keys[Position + 1])
        Position++;
    else if(Position == 1 && key == System.Windows.Forms.Keys.Up)
        Position = 0;
    else if(key == Keys[0])
        Position = 0;
    else
        Position = -1;
    
    if (Position == Keys.Count - 1){
        Position = -1;
        success = true;
    }

    return success;
}


