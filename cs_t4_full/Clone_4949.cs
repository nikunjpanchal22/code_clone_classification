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
    Brush rtn = default(Brush);
    bool isSame = true;
    for (int i = 0; i < ShapeChildren.Count; i++)
    {
        Shape shape = ShapeChildren[i];
        if (i == 0)
        {
            rtn = shape.Fill;
        }
        else
        {
            if (rtn != shape.Fill)
            {
                isSame = false;
                break;
            }
        }
    }
    if (isSame) 
    {
        SetValue(FillDifferentProperty, rtn);
    }
    else
    {
        SetValue(FillDifferentProperty, default(Brush));
    }
}


