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
 
    Display *dsp = XOpenDisplay(NULL);

    char keys_pressed[32];
    XQueryKeymap(dsp, keys_pressed);

    KeySym shift_key = XK_Shift_L;
    KeyCode keycode = XKeysymToKeycode(dsp, shift_key);

    bool shift_pressed = (keys_pressed[keycode >> 3] & (1 << (keycode & 7)));

    printf("Shift is %spressed\n", shift_pressed ? "" : "not ");

    XCloseDisplay(dsp);
    return 0;
}


