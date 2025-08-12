private static void ExpandItemWithInitialExpandedAttribute (PropertyGrid propertyGrid, GridItem gridItem) {
    if (gridItem != null) {
        if (gridItem.GridItemType == GridItemType.Property && gridItem.Expandable) {
            object [] objs = gridItem.Value.GetType ().GetCustomAttributes (typeof (PropertyGridInitialExpandedAttribute), false);
            if (objs.Length > 0) {
                if (((PropertyGridInitialExpandedAttribute) objs [0]).InitialExpanded) {
                    gridItem.Expanded = true;
                }
            }
        }
        foreach (GridItem childItem in gridItem.GridItems) {
            ExpandItemWithInitialExpandedAttribute (propertyGrid, childItem);
        }
    }
}


private static void ExpandItemWithInitialExpandedAttribute(PropertyGrid propertyGrid, GridItem gridItem) {
    if (gridItem != null) {
        if (gridItem.GridItemType == GridItemType.Property && gridItem.Expandable) {
            object[] objs = gridItem.Value.GetType().GetCustomAttributes(typeof(PropertyGridInitialExpandedAttribute), false);
            if (objs.Length > 0) {
                if (((PropertyGridInitialExpandedAttribute)objs[0]).InitialExpanded) {
                    gridItem.Expanded = true;
                }
            }
            else {
                gridItem.Expanded = false;
            }
        }
        foreach (GridItem childItem in gridItem.GridItems) {
            ExpandItemWithInitialExpandedAttribute(propertyGrid, childItem);
        }
    }
}
