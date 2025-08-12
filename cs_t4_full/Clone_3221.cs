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



public static void moveMouse(ref int currentx, ref int currenty, string whatTodo, int pNumber)
{
    SetCursorPos(currentx + (pNumber * (whatTodo == "addX" ? 1 : whatTodo == "remX" ? -1 : 0)), 
                 currenty + (pNumber * (whatTodo == "addY" ? 1 : whatTodo == "remY" ? -1 : 0)));
}


