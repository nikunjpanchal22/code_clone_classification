protected void layoutPlotChildren () {
    super.layoutPlotChildren ();
    for (Series < String, Number > series : getData ()) {
        for (Data < String, Number > data : series.getData ()) {
            StackPane bar = (StackPane) data.getNode ();
            Label label = null;
            for (Node node : bar.getChildrenUnmodifiable ()) {
                LOGGER.debug ("Bar has child {}, {}.", node, node.getClass ());
                if (node instanceof Label) {
                    label = (Label) node;
                    break;
                }
            }
            if (label == null) {
                label = new Label (series.getName ());
                label.setRotate (90.0);
                bar.getChildren ().add (label);
            } else {
                label.setText (series.getName ());
            }
        }
    }
}


 protected void layoutPlotChildren () {
    super.layoutPlotChildren ();
    for (Series < String, Number > series : getData ()) {
        for (Data < String, Number > data : series.getData ()) {
            StackPane bar = (StackPane) data.getNode ();
            Label label = null;
            for (Node node : bar.getChildrenUnmodifiable ()) {
                LOGGER.debug ("Bar has child {}, {}.", node, node.getClass ());
                if (node instanceof Label) {
                    label = (Label) node;
                    break;
                }
            }
            double initX = bar.getLayoutX ();
            double initY = bar.getLayoutY ();
            double initWidth = bar.getPrefWidth ();
            double initHeight = bar.getPrefHeight ();
            if (label == null) {
                label = new Label (series.getName ());
                label.setRotate (90);
                label.setStyle ("-fx-layout-x: " + (initX-initWidth) 
                    + "; -fx-layout-y: " + (initY + (initHeight/2)) + ";");
                bar.getChildren ().add (label);
            } else {
                label.setText (series.getName ());
                label.setStyle ("-fx-layout-x: " + (initX-initWidth) 
                    + "; -fx-layout-y: " + (initY + (initHeight/2)) + ";");
            }
        }
    }
}


