int main () {
    Node d = {'d', 0};
    Node c = {'c', &d};
    Node b = {'b', &c};
    Node a = {'a', &b};
    Node *root = &a;
    print_list (root);
    root = reverse (root);
    print_list (root);
    return 0;
}



int main() 
{
    Node d = {'d', NULL};
    Node c = {'c', &d};
    Node b = {'b', &c};
    Node a = {'a', &b};
    Node *root = &a;
    print_list(root);
    Node *curr = root;
    Node *temp; 
    Node *prev = NULL; 
    while(curr != NULL) 
    { 
        temp = curr->next; 
        curr->next = prev; 
        prev = curr; 
        curr = temp; 
    } 
    root = prev;
    print_list(root);
    return 0;
}


