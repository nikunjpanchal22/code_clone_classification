public void mouseReleased (int mod, Point loc) {
    if (pressLocation != null && dragLocation != null) {
        pressLocation = null;
    } else if (dragLocation != null) {
    } else {
    }
    pressLocation = null;
    dragLocation = null;
}


 

public void mouseReleased (int mod, Point loc) {
    if (pressLocation != null) {
        pressLocation = null;
        if (dragLocation != null) {
            dragLocation = null;
        }
    }
    
}


