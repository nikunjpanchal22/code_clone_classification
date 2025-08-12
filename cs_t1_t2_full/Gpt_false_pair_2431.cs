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


 private static void ExpandItemWithInitialExpandedAttribute (PropertyGrid propertyGrid, GridItem gridItem) 
{
     if (gridItem != null) 
     {
          // Check if the GridItem is an expandable property
          if (gridItem.GridItemType == GridItemType.Property && gridItem.Expandable) 
          {
               // Get the list of custom attributes
               object[] objs = gridItem.Value.GetType().GetCustomAttributes(typeof(PropertyGridInitialExpandedAttribute), false);

               // Check if the attribute list is not empty
               if (objs.Length > 0)
               {
                    // Cast the first element to the type PropertyGridInitialExpandedAttribute
                    PropertyGridInitialExpandedAttribute attr = (PropertyGridInitialExpandedAttribute)objs[0];
                    // Check if the attribute is set to InitialExpanded
                    if (attr.InitialExpanded)
                    {
                         gridItem.Expanded = true;
                    }
               }
          }
          // Recursively expand any child items
          foreach (GridItem childItem in gridItem.GridItems)
          {
               ExpandItemWithInitialExpandedAttribute(propertyGrid, childItem);
          }
     }
}
