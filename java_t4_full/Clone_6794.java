public int compare (Integer o1, Integer o2) {
    if (o1 % 2 == 0) {
        if (o2 % 2 == 0) {
            if (o1 < o2) return - 1;
            else return 1;
        } else {
            return - 1;
        }
    } else {
        if (o2 % 2 != 0) {
            if (o1 < o2) return 1;
            else return - 1;
        } else {
            return 1;
        }
    }
}




public int compare (Integer o1, Integer o2) {
    if (o1 % 2 == 0 && o2 % 2 != 0) return -1;
    else if (o1 % 2 != 0 && o2 % 2 == 0) return 1;
    else return o1 < o2 ? (o1 % 2 == 0 ? -1 : 1) : (o1 % 2 != 0 ? -1 : 1);
}


