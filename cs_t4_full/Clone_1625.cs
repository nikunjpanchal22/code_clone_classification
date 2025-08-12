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
    if (ShapeChildren.Count == 0)
        return;
    else {
        Brush rtn = null;
        for (int i = 0; i < ShapeChildren.Count; i++) {
            if (rtn == null) {             
                Shape shape = ShapeChildren[i];
                rtn = shape.Fill;
                SetValue (FillDifferentProperty, rtn);
            }
            else if (rtn != shape.Fill) {
                SetValue(FillDifferentProperty, default (Brush));
                break;
            }
        }
    }
}


