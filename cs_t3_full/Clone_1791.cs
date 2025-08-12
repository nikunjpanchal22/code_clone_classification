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


 private static void ExpandItemWithInitialExpandedAttribute(PropertyGrid propertyGrid, GridItem gridItem) 
{
    // Check if GridItem is an expandable property
    if (gridItem != null && gridItem.GridItemType == GridItemType.Property && gridItem.Expandable)
    {
        // Get custom attributes from Item
        object[] objs = gridItem.Value.GetType().GetCustomAttributes(typeof(PropertyGridInitialExpandedAttribute), false);
        
        // Check if attributes exist
        if (objs.Length > 0)
        {
            // Cast attribute to correct type
            var attr = (PropertyGridInitialExpandedAttribute)objs[0];
            
            // Check if attribute is set to initial expanded
            if (attr.InitialExpanded)
            {
                // Expand Item
                gridItem.Expanded = true;
            }
        }
    }

    // Recursively check children
    foreach(GridItem childItem in gridItem.GridItems)
    {
        ExpandItemWithInitialExpandedAttribute(propertyGrid, childItem);
    }
}


