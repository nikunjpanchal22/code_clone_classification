            public void run () {
                try {
                    runs = true;
                    if (noColor < 2) {
                        noColor ++;
                        changeBtnForegroung (clr [noColor]);
                    } else {
                        noColor = 0;
                        changeBtnForegroung (clr [noColor]);
                    }
                    changeBtnMargin (new Insets (initMargin.top, initMargin.left + 10, initMargin.bottom, initMargin.right - 10));
                    border = new EmptyBorder (0, 5, 10, 5);
                    changePnlBorder (border);
                    Thread.sleep (100);
                    changeBtnMargin (new Insets (initMargin.top, initMargin.left - 10, initMargin.bottom, initMargin.right + 10));
                    border = new EmptyBorder (0, 0, 10, 10);
                    changePnlBorder (border);
                    Thread.sleep (100);
                    changeBtnMargin (new Insets (initMargin.top, initMargin.left + 10, initMargin.bottom, initMargin.right - 10));
                    border = new EmptyBorder (5, 10, 5, 0);
                    changePnlBorder (border);
                    Thread.sleep (100);
                    changeBtnMargin (new Insets (initMargin.top, initMargin.left - 10, initMargin.bottom, initMargin.right + 10));
                    border = new EmptyBorder (10, 10, 0, 0);
                    changePnlBorder (border);
                    Thread.sleep (100);
                    changeBtnMargin (new Insets (initMargin.top, initMargin.left, initMargin.bottom, initMargin.right));
                    border = new EmptyBorder (5, 5, 5, 5);
                    changePnlBorder (border);
                    Thread.sleep (100);
                    count ++;
                } catch (Exception e) {
                    System.out.println (e);
                }
}



 public void run(){
    try{
        run = true;
        if(noColour < 2){
            noColour++;
            changeButtonForeground(clr[noColour]);
        } else{
            noColour = 0;
            changeButtonForeground(clr[noColour]);
        }
        changeButtonMargin(new Insets(initMargin.top,initMargin.left+5, initMargin.bottom, initMargin.right-5));
        border = new EmptyBorder(0,7,10,7);
        changePnlBorder(border);
        Thread.sleep(150);
        changeButtonMargin(new Insets(initMargin.top,initMargin.left-5,initMargin.bottom,initMargin.right+5));
        border = new EmptyBorder(0,2,10,2);
        changePnlBorder(border);
        Thread.sleep(150);
        changeButtonMargin(new Insets(initMargin.top,initMargin.left+5,initMargin.bottom,initMargin.right-5));
        border = new EmptyBorder(7,7,7,0);
        changePnlBorder(border);
        Thread.sleep(150);
        changeButtonMargin(new Insets(initMargin.top,initMargin.left-5,initMargin.bottom,initMargin.right+5));
        border = new EmptyBorder(10,10,0,0);
        changePnlBorder(border);
        Thread.sleep(150);
        changeButtonMargin(new Insets(initMargin.top, initMargin.left, initMargin.bottom, initMargin.right ));
        border = new EmptyBorder(7,7,7,7);
        changePnlBorder(border);
        Thread.sleep(150);
        count++;
    } catch (Exception e) {
        System.out.println(e);
    }
}
