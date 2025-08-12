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




main(){
    copy_boot_parameters();
    initialize_console();
    if(flag("debug") == 1){
        printf("Early console in setup code.");
    }
    set_up_heap();
    if (!check_CPU()){
        printf("Unable to boot - please use a kernel appropriate for your CPU.");
        exit(0);
    }
    BIOS_mode_set();
    find_memory();
    set_up_keyboard();
    IST_inquiry();
    video_setting();
    go_to_protected_Mode();
}


