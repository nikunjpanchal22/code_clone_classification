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
    bool flag = true;
    for (int i = 0; i < ShapeChildren.Count; i ++) {
        if (flag == true) {
            Shape shape = ShapeChildren [i];
            rtn = shape.Fill;
            flag = false;
            SetValue (FillDifferentProperty, rtn);
        } else if (rtn != shape.Fill) {
            SetValue (FillDifferentProperty, default (Brush));
            break;
        }
    }
}


