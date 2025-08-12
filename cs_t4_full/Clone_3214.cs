public static void moveMouse (ref int currentx, ref int currenty, string whattodo, int pNombre) {
    switch (whattodo) {
        case "addX" :
            for (int i = 0; i < pNombre; i ++) {
                currentx ++;
                SetCursorPos (currentx + Form1.m_Border_x, currenty + Form1.m_Border_y);
            }
            break;
        case "addY" :
            for (int i = 0; i < pNombre; i ++) {
                currenty ++;
                SetCursorPos (currentx + Form1.m_Border_x, currenty + Form1.m_Border_y);
            }
            break;
        case "remX" :
            for (int i = 0; i < pNombre; i ++) {
                currentx --;
                SetCursorPos (currentx + Form1.m_Border_x, currenty + Form1.m_Border_y);
            }
            break;
        case "remY" :
            for (int i = 0; i < pNombre; i ++) {
                currenty --;
                SetCursorPos (currentx + Form1.m_Border_x, currenty + Form1.m_Border_y);
            }
            break;
        default :
            break;
    }
}





public static void moveMouse(ref int currentx, ref int currenty, string direction, int units)
{
    for (int i = 0; i < units; i++)
    {
        if (direction == "addX") currentx++;
        else if (direction == "addY") currenty++;
        else if (direction == "remX") currentx--;
        else if (direction == "remY") currenty--;

        SetCursorPos(currentx, currenty);
    }
}


