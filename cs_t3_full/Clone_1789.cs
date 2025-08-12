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
    if (gridItem != null && gridItem.GridItemType == GridItemType.Property 
        && gridItem.Expandable)
    {
        var customAttrs = gridItem.Value.GetType().GetCustomAttributes(
            typeof(PropertyGridInitialExpandedAttribute), 
            false);

        // Error check -- to make sure there is at least
        // one attribute
        if (customAttrs.Length > 0)
        {
            var attr = customAttrs[0] as PropertyGridInitialExpandedAttribute;
            if (attr.InitialExpanded)
            {
                gridItem.Expanded = true;
            }
        }
    }

    // Recursively search for properties with
    // custom attributes
    foreach (GridItem childItem in gridItem.GridItems)
    {
        ExpandItemWithInitialExpandedAttribute(propertyGrid, childItem);
    }
}


