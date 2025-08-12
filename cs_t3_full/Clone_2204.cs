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





public static void moveMouse(ref int x, ref int y, string operation, int count)
{
    for (int i = 0; i < count; i++)
    {
        switch (operation)
        {
            case "addX": x++; SetCursorPos(x, y); break;
            case "addY": y++; SetCursorPos(x, y); break;
            case "remX": x--; SetCursorPos(x, y); break;
            case "remY": y--; SetCursorPos(x, y); break;
        }
    }
}


