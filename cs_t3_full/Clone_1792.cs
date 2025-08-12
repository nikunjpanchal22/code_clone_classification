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
     // If GridItem is an expandable property
     if (gridItem != null && gridItem.GridItemType == GridItemType.Property && gridItem.Expandable)
     {
          // Get custom attributes of PropertyGridInitialExpandedAttribute types
          object[] objs = gridItem.Value.GetType().GetCustomAttributes(typeof(PropertyGridInitialExpandedAttribute), false);
          // Check if the list of attributes is not empty
          if (objs.Length > 0)
          {
               // Cast the first attribute to the type PropertyGridInitialExpandedAttribute
               PropertyGridInitialExpandedAttribute attr = (PropertyGridInitialExpandedAttribute) objs[0];
               // Check if the attribute is set to initialExpanded
               if (attr.InitialExpanded)
               {
                    gridItem.Expanded = true;
               }
          }
          // Recurse through each child item and apply the same logic
          foreach (GridItem childItem in gridItem.GridItems)
          {
               ExpandItemWithInitialExpandedAttribute(propertyGrid, childItem);
          }
     }
}


