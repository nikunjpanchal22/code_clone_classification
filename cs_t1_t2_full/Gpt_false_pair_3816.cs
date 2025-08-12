public static String Rainbow (Int32 numOfSteps, Int32 step) {
    var r = 0.0;
    var g = 0.0;
    var b = 0.0;
    var h = (Double) step / numOfSteps;
    var i = (Int32) (h * 6);
    var f = h * 6.0 - i;
    var q = 1 - f;
    switch (i % 6) {
        case 0 :
            r = 1;
            g = f;
            b = 0;
            break;
        case 1 :
            r = q;
            g = 1;
            b = 0;
            break;
        case 2 :
            r = 0;
            g = 1;
            b = f;
            break;
        case 3 :
            r = 0;
            g = q;
            b = 1;
            break;
        case 4 :
            r = f;
            g = 0;
            b = 1;
            break;
        case 5 :
            r = 1;
            g = 0;
            b = q;
            break;
    }
    return "#" + ((Int32) (r * 255)).ToString ("X2") + ((Int32) (g * 255)).ToString ("X2") + ((Int32) (b * 255)).ToString ("X2");
}


public static string Rainbow(int numOfSteps, int step)
{
    double red = 0.0;
    double green = 0.0;
    double blue = 0.0;
    double hue = (double)step / numOfSteps;
    int idx = (int)hue * 6;
    double frac = hue * 6.0 - idx;
    double q = 1 - frac;
    
    switch(idx % 6) 
    {
        case 0:
            red = 1;
            green = frac;
            blue = 0;
            break;
        case 1:
            red = q;
            green = 1;
            blue = 0;
            break;
        case 2:
            red = 0;
            green = 1;
            blue = frac;
            break;
        case 3:
            red = 0;
            green = q;
            blue = 1;
            break;
        case 4:
            red = frac;
            green = 0;
            blue = 1;
            break;
        case 5:
            red = 1;
            green = 0;
            blue = q;
            break;
    }
    return "#" + ((int)(red * 255)).ToString("X2") + ((int)(green * 255)).ToString("X2") + ((int)(blue * 255)).ToString("X2");
}
