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


 void OnShapeBrushChanged()
{
    bool isSame = true;
    Brush rtn = default(Brush);
    for (int i = 0; i < ShapeChildren.Count; i++)
    {
        if (i == 0)
        {
            rtn = ShapeChildren[i].Fill;
        }
        else
        {
            if (rtn != ShapeChildren[i].Fill)
            {
                isSame = false;
            }
        }
    }
    SetValue(FillDifferentProperty, isSame ? rtn : default(Brush));
}


