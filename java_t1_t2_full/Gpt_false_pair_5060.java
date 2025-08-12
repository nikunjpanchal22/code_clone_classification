public static void main (String [] args) {
    Node root = null;
    DataInputStream reader = new DataInputStream (System.in);
    int op = 0;
    while (op != 6) {
        try {
            System.out.println ("Enter Option:\n1:Insert Front 2:Delete Front 3:Insert Rear 4:Delete Rear 5:Display List 6:Exit");
            op = Integer.parseInt (reader.readLine ());
            switch (op) {
                case 1 :
                    System.out.println ("Enter Value: ");
                    int val = Integer.parseInt (reader.readLine ());
                    root = insertNodeFront (val, root);
                    display (root);
                    break;
                case 2 :
                    root = removeNodeFront (root);
                    display (root);
                    break;
                case 3 :
                    System.out.println ("Enter Value: ");
                    val = Integer.parseInt (reader.readLine ());
                    root = insertNodeRear (val, root);
                    display (root);
                    break;
                case 4 :
                    root = removeNodeRear (root);
                    display (root);
                    break;
                case 5 :
                    display (root);
                    break;
                default :
                    System.out.println ("Invalid Option");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
    System.out.println ("Exited!!!");
    try {
        reader.close ();
    } catch (IOException e) {
        e.printStackTrace ();
    }
}


public static void main (String [] args) {
    Node root = null;
    Scanner scanner = new Scanner(System.in);
    int op = 0;
    while (op != 6) {
        System.out.println ("Enter Option:\n1:Insert Front 2:Delete Front 3:Insert Rear 4:Delete Rear 5:Display List 6:Exit");
        op = scanner.nextInt();
        switch (op) {
            case 1 :
                System.out.println ("Enter Value: ");
                int val = scanner.nextInt();
                root = insertNodeFront (val, root);
                display (root);
                break;
            case 2 :
                root = removeNodeFront (root);
                display (root);
                break;
            case 3 :
                System.out.println ("Enter Value: ");
                val = scanner.nextInt();
                root = insertNodeRear (val, root);
                display (root);
                break;
            case 4 :
                root = removeNodeRear (root);
                display (root);
                break;
            case 5 :
                display (root);
                break;
            default:
                System.out.println ("Invalid Option");
                break;
        }
    }
    System.out.println ("Exited!!!");
    scanner.close();
}
