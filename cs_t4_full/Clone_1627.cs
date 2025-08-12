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
    Brush rtn;
    if (ShapeChildren.Count == 0)
        rtn = default (Brush);
    else {
        rtn = ShapeChildren[0].Fill;
        SetValue (FillDifferentProperty, rtn);
        for (int i = 1; i < ShapeChildren.Count; i++) {            
            if (rtn != ShapeChildren[i].Fill) {
                rtn = default (Brush);
                SetValue(FillDifferentProperty, rtn);
                break;
            }
        }

    }
}


