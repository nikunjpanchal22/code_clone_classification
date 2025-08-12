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
    if (o1 % 2 == o2 % 2) {
        return Integer.compare(o1, o2);
    } else {
        return (o1 % 2 == 0) ? -1 : 1;
    }
}


