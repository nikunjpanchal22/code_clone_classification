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
    bool flag = false;
    for (int i = 0; i < ShapeChildren.Count; i ++) {
        Shape shape = ShapeChildren[i];
        if (i == 0) {
            SetValue (FillDifferentProperty, shape.Fill);
        }
        else if (shape.Fill != GetValue (FillDifferentProperty)) {
            SetValue (FillDifferentProperty, default (Brush));
            flag = true;
            break;
        }
    }
    if (flag == false && ShapeChildren.Count!=0)
        SetValue (FillDifferentProperty, ShapeChildren[0].Fill);
}


