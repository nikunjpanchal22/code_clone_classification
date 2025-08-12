void main (void) {
    copy_boot_params ();
    console_init ();
    if (cmdline_find_option_bool ("debug"))
        puts ("early console in setup code.\n");
    init_heap ();
    if (validate_cpu ()) {
        puts ("Unable to boot - please use a kernel appropriate " "for your CPU.\n");
        die ();
    }
    set_bios_mode ();
    detect_memory ();
    keyboard_init ();
    query_ist ();
    set_video ();
    go_to_protected_mode ();
}


void main (void) {
    copy_boot_params ();
    console_init ();
    if (cmdline_find_option_bool ("debug"))
        puts ("early console in setup code.\n");
    init_heap ();
    if (validate_cpu ()) {
        puts ("Unable to boot - please use a kernel appropriate " "for your CPU.\n");
        die ();
    }
    detect_memory ();
    query_ist ();
    set_video ();
    go_to_protected_mode ();
}
