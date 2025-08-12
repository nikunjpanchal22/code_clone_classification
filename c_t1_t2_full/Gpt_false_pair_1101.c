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
    Display *d = XOpenDisplay(NULL);
    char keys[32];
    XQueryKeymap(d, keys);
    KeySym ksy = XK_Shift_L;
    KeyCode kc = XKeysymToKeycode(d, ksy);
    bool bsp = !!(keys[kc >> 3] & (1 << (kc & 7)));
    printf("Shift is %spressed\n", bsp ? "" : "not ");
    XCloseDisplay(d);
    return 0;
}
