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
    Display *disp = XOpenDisplay(NULL);
    char keyData[32];
    XQueryKeymap(disp, keyData);
    KeySym shiftKey = XK_Shift_L;
    KeyCode code = XKeysymToKeycode(disp, shiftKey);
    bool shiftPressed = !!(keyData[code >> 3] & (1 << (code & 7)));
    printf("Shift is %spressed\n", shiftPressed ? "" : "not ");
    XCloseDisplay(disp);
    return 0;
}
