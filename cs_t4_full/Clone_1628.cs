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
    Brush rtn = default (Brush);
    int i = 0;
    while (i < ShapeChildren.Count) {
        rtn = ShapeChildren[i].Fill;
        SetValue (FillDifferentProperty, rtn);
        i += 1;
        if (i < ShapeChildren.Count) {
            if (ShapeChildren[i].Fill != rtn) {
                SetValue (FillDifferentProperty, default (Brush));
                break;
            }
        }
    }
}


