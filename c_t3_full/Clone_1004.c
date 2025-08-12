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
    Display* disp = XOpenDisplay(NULL);

    char keys[32];
    XQueryKeymap(disp, keys);
    KeySym shift_key = XK_Shift_L;
    KeyCode keycode = XKeysymToKeycode(disp, shift_key);

    bool shift_pressed = keys[keycode >> 3] & (1 << (keycode & 7));

    printf("Shift is %spressed\n", shift_pressed ? "" : "not ");

    XCloseDisplay(disp);
    return 0;
}


