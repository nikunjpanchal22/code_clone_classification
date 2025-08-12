int main () {
    Display *dpy = XOpenDisplay (NULL);
    char keys_return [32];
    XQueryKeymap (dpy, keys_return);
    KeyCode kc2 = XKeysymToKeycode (dpy, XK_Shift_L);
    bool bShiftPressed = !!(keys_return[kc2 >> 3] & (1 << (kc2 & 7)));
    printf ("Shift is %spressed\n", bShiftPressed ? "" : "not ");
    XCloseDisplay (dpy);
}


 int main()
{
    Display* display; 
    display = XOpenDisplay(NULL); 

    char key_data[32]; 
    XQueryKeymap(display, key_data); 

    KeySym left_shift_key=XK_Shift_L; 
    KeyCode key_code=XKeysymToKeycode(display ,left_shift_key); 

    bool left_shift_pressed = !!(key_data[key_code >> 3] & (1 << (key_code & 7))); 

    printf("Shift is %spressed\n", left_shift_pressed ? "" : "not "); 

    XCloseDisplay(display);
    return 0;
}


