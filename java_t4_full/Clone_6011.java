public static boolean check (double x1, double y1, double x2, double y2, double x, double y) {
    if (x1 == x2) {
        return y1 < y2 ? (y1 <= y && y <= y2) : (y2 <= y && y <= y1);
    }
    double m = (y2 - y1) / (x2 - x1);
    double r1 = x1 + m * y1;
    double r2 = x2 + m * y2;
    double r = x + m * y;
    return r1 < r2 ? (r1 <= r && r <= r2) : (r2 <= r && r <= r1);
}





public static boolean check(Double x1, Double y1, Double x2, Double y2, Double x, Double y){
    if(x1.equals(x2)) return y >= Math.min(y1, y2) && y <= Math.max(y1, y2);
    double slope = (y2-y1)/(x2-x1);
    double newY = slope * (x - x1) + y1;
    return Math.abs((newY - y)) < 0.0001;
}


