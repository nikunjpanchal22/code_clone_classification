void OnShapeBrushChanged () {
    Brush rtn = default (Brush);
    for (int i = 0; i < ShapeChildren.Count; i ++) {
        Shape shape = ShapeChildren [i];
        if (i == 0) {
            rtn = shape.Fill;
        } else if (rtn != shape.Fill) {
            SetValue (FillDifferentProperty, default (Brush));
        } else
            SetValue (FillDifferentProperty, rtn);
    }
}




void OnShapeBrushChanged () {
	    Brush equal = ShapeChildren.Any()? ShapeChildren[0].Fill: default(Brush);
	    foreach (Shape child in ShapeChildren.Skip(1))
	    {
	      if (equal != child.Fill)
	      {
		SetValue(FillDifferentProperty, default (Brush));
		break;
	      }
	      else
		SetValue(FillDifferentProperty, equal);
	    }
}


