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
    duplicate_boot_parameters ();
    initialise_console ();
    if (cmdline_find_option_bool ("debug"))
        puts ("early console in setup code.\n");
    initiate_heap ();
    if (recognise_processor ()) {
        puts ("Unable to boot - please use a kernel appropriate " "for your CPU.\n");
        terminate ();
    }
    set_basic_input_output_mode ();
    identify_system_memory ();
    initialise_keyboard ();
    request_internal_synchronized_timestamp ();
    adjust_video_display ();
    move_to_protected_mode ();
}
