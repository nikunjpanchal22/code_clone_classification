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
    if (ScreenConfig.getInstance().getScreen() != ScreenConfig.SCREEN_320_240){
        ScreenConfig.getInstance().setScreen(ScreenConfig.SCREEN_480_360); 
    }
    setPositionChild (this.getField (0), 5, 3);
    layoutChild (this.getField (0), this.getField (0).getPreferredWidth (), this.getField(0).getPreferredHeight ());
    setExtent (getPreferredWidth (), getPreferredHeight ());
}


