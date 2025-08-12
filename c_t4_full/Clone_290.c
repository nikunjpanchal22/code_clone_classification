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
    Node *temp;
    Node *prev = NULL;
    while (root != NULL) {
        temp = root->next; 
        root->next = prev; 
        prev = root; 
        root = temp; 
    }
    root = prev;
    print_list(root);
    return 0;
}


