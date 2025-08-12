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
    Display *dpy;
    dpy = XOpenDisplay(NULL);

    char keys_return[32];
    XQueryKeymap(dpy, keys_return);
                                
    KeySym shift_key = XK_Shift_L;
    KeyCode kc2 = XKeysymToKeycode(dpy, shift_key);                                
    bool isShiftPressed = (keys_return[kc2 >> 3] & (1 << (kc2 & 7)));                     

    printf("Shift is %spressed\n", isShiftPressed ? "" : "not ");
                                
    XCloseDisplay(dpy);
    return 0;
}


