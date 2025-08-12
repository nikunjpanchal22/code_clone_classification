protected void sublayout (int maxWidth, int maxHeight) {
    int currX = 0;
    int currY = 0;
    Field currField;
    currField = this.getField (0);
    switch (ScreenConfig.getInstance ().getScreen ()) {
        case ScreenConfig.SCREEN_320_240 :
            currX = 5;
            currY = 3;
            break;
        case ScreenConfig.SCREEN_480_360 :
        case ScreenConfig.SCREEN_480_320 :
            currX = 5;
            currY = 1;
            break;
    }
    this.setPositionChild (currField, currX, currY);
    this.layoutChild (currField, currField.getPreferredWidth (), currField.getPreferredHeight ());
    setExtent (this.getPreferredWidth (), this.getPreferredHeight ());
}





protected void sublayout (int maxWidth, int maxHeight) {
    Field currField = getField (0);

    // ternary condition to set the position
    int position[] = ScreenConfig.getInstance().getScreen()
                      ==ScreenConfig.SCREEN_320_240? new int[]{5,3} 
                                                   : new int[]{5,1};
    setPositionChild(currField, position[0], position[1]);
    layoutChild(currField, currField.getPreferredWidth(), currField.getPreferredHeight());
    setExtent(getPreferredWidth (), getPreferredHeight ());
}


