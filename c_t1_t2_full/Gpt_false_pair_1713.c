int main () {
    LinkedList list;
    init_list (& list);
    Employee *samuel = (Employee *) malloc (sizeof (Employee));
    strcpy (samuel -> name, "Samuel");
    samuel->age = 23;
    Employee *sally = (Employee *) malloc (sizeof (Employee));
    strcpy (sally -> name, "Sally");
    sally->age = 19;
    Employee *susan = (Employee *) malloc (sizeof (Employee));
    strcpy (susan -> name, "Susan");
    susan->age = 14;
    Employee *jessie = (Employee *) malloc (sizeof (Employee));
    strcpy (jessie -> name, "Jessie");
    jessie->age = 18;
    add_head (& list, samuel);
    add_head (& list, sally);
    add_head (& list, susan);
    add_tail (& list, jessie);
    display_list (& list, (DISPLAY) display_employee);
    NODE *n = get_node (&list, (COMPARE) compare_employee, sally);
    printf ("name is %s, age is %d.\n", ((Employee *) n -> data) -> name, ((Employee *) n -> data) -> age);
    printf ("\n");
    delete_node (& list, samuel);
    display_list (& list, (DISPLAY) display_employee);
    return 0;
}



 int main() 
{
    LinkedList list;
    init_list(&list);
    Employee *samuel = (Employee*)malloc(sizeof(Employee)); 
    strcpy(samuel->name, "Samuel");
    samuel->age = 23;
    Employee *sally = (Employee*)malloc(sizeof(Employee)); 
    strcpy(sally->name, "Sally");
    sally->age = 19;
    Employee *susan = (Employee*)malloc(sizeof(Employee)); 
    strcpy(susan->name, "Susan");
    susan->age = 14;
    Employee *jessie = (Employee*)malloc(sizeof(Employee)); 
    strcpy(jessie->name, "Jessie");
    jessie->age = 18;
    add_head(&list, samuel);
    add_tail(&list, sally);
    add_head(&list, susan);
    add_tail(&list, jessie);
    display_list_reverse(&list, (DISPLAY) display_employee);
    NODE *n = get_node(&list, (COMPARE) compare_employee, sally);
    printf("name is %s, age is %d.\n", ((Employee *) n -> data) -> name, ((Employee *) n -> data) -> age);
    printf("\n");
    delete_node(&list, samuel);
    display_list_reverse(&list, (DISPLAY) display_employee);
    free_list(&list);
    return 0;
}
