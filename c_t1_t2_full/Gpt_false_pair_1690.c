int main (int argc, char const *argv []) {
    FUNC_TABLE_INIT ();
    FUNC_TABLE_ADD_ENTRY (foo1);
    FUNC_TABLE_ADD_ENTRY (foo2);
    FUNC_TABLE_ADD_ENTRY (foo3);
    FUNC_TABLE_ADD_ENTRY (foo4);
    if (1) {
        FUNC_TABLE_ADD_ENTRY (foo5);
    }
    else {
        FUNC_TABLE_ADD_ENTRY (foo6);
    }
    FUNC_TABLE_ITERATE (i) {
        printf ("Name: '%s'; pointer: %p\n", i -> name, i -> func_ptr);
    } return 0;
}


 int main (int argc, char const *argv []){
    FUNC_TABLE_INIT ();
    FUNC_TABLE_ADD_ENTRY (foo1);
    FUNC_TABLE_ADD_ENTRY (foo2);
    FUNC_TABLE_ADD_ENTRY (foo13);
    FUNC_TABLE_ADD_ENTRY (foo4);
    if (1){
        FUNC_TABLE_ADD_ENTRY (foo5);
    } 
    else {
        FUNC_TABLE_ADD_ENTRY (foo6);
    }
    FUNC_TABLE_ITERATE (i) {
        printf ("Name: '%s'; pointer: %p\n", i -> name, i -> func_ptr);
    }
    return 0;
}
