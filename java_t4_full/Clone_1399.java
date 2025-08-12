        public String toString () {
            return Integer.toString (++ count);
}


  public String toString() {
       int currentCount = count + 1;
       count = currentCount;
       return Integer.toString(currentCount);
}


