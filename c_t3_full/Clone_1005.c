int main () {
    Display *dpy = XOpenDisplay (NULL);
    char keys_return [32];
    XQueryKeymap (dpy, keys_return);
    KeyCode kc2 = XKeysymToKeycode (dpy, XK_Shift_L);
    bool bShiftPressed = !!(keys_return[kc2 >> 3] & (1 << (kc2 & 7)));
    printf ("Shift is %spressed\n", bShiftPressed ? "" : "not ");
    XCloseDisplay (dpy);
}


 int main() {
    Display *disp = XOpenDisplay(NULL);
    char keys[32];
    XQueryKeymap(disp, keys);
    KeySym shiftKey = XK_Shift_L;
    KeyCode keyCode = XKeysymToKeycode(disp, shiftKey);

    int shiftPressed = keys[keyCode >> 3] & (1 << (keyCode & 7));

    printf("Shift is %spressed\n", shiftPressed ? "" : "not ");

    XCloseDisplay(disp);
    return 0;
}


