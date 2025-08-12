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
    int screenType = ScreenConfig.getInstance().getScreen();
    if (screenType != ScreenConfig.SCREEN_320_240 
            && screenType != ScreenConfig.SCREEN_480_320 
            && screenType != ScreenConfig.SCREEN_480_360) {
        throw new IllegalArgumentException('Illegal screen type');
    }
    setPositionChild (this.getField(0), 5, screenType == ScreenConfig.SCREEN_320_240 ? 3 : 1);
    layoutChild (this.getField(0), this.getField(0).getPreferredWidth (), this.getField(0).getPreferredHeight ());
    setExtent (this.getPreferredWidth (), this.getPreferredHeight ());
}


