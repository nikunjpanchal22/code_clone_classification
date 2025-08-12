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
    if (gridItem != null && gridItem.GridItemType == GridItemType.Property && gridItem.Expandable)
    {
        // Get the custom attribute list
        var attributes = gridItem.Value.GetType().GetCustomAttributes(
            typeof(PropertyGridInitialExpandedAttribute), 
            false);

        // Check if the list is not empty
        if (attributes.Length)
        {
            // Cast the first element to the type PropertyGridInitialExpandedAttribute
            var attr = attributes[0] as PropertyGridInitialExpandedAttribute;
            if (attr.InitialExpanded)
            {
                gridItem.Expanded = true;
            }
        }
    }

    // recursively expand any child items
    foreach (GridItem childItem in gridItem.GridItems)
    {
        ExpandItemWithInitialExpandedAttribute(propertyGrid, childItem);
    }
}


