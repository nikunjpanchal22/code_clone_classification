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
    Node *current = root;
    Node *prev = NULL;
    while (current != NULL) {
        Node *next = current->next;
        current->next = prev; 
        prev = current;
        current = next;
    }
    root = prev;
    print_list(root);
    return 0;
}


