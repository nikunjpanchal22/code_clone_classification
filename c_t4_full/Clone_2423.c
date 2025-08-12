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



public static void main(String[] args){
    BootParameters.copy();
    Console.initialize();
    if(CommandLineOptions.getOptionBool("debug")){
        System.out.println("Early console in setup code.");
    }
    Heap.initialize();
    if(!CPU.isValid()){
        System.out.println("Unable to boot - Please use a kernel appropriate for your CPU.");
        System.exit(0);
    }
    BIOS.setMode();
    Memory.detect();
    Keyboard.initialize();
    IST.query();
    Video.set();
    Mode.goToProtected();
}


