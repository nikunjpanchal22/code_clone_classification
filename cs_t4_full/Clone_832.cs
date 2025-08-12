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
                float r = 0.0f;
                float g = 0.0f;
                float b = 0.0f;
                float h = step / (float)numOfSteps;
                int i = (int)(h * 6);
                float f = h * 6f - i;
                float q = 1f - f;

                if (i % 6 <= 0)
                {
                    r = 1f;
                    g = f;
                    b = 0f;
                }
                else if (i % 6 == 1)
                {
                    r = q;
                    g = 1f;
                    b = 0f;
                }
                else if (i % 6 == 2)
                {
                    r = 0f;
                    g = 1f;
                    b = f;
                }
                else if (i % 6 == 3)
                {
                    r = 0f;
                    g = q;
                    b = 1f;
                }
                else if (i % 6 == 4)
                {
                    r = f;
                    g = 0f;
                    b = 1f;
                }
                else if (i % 6 == 5)
                {
                    r = 1f;
                    g = 0f;
                    b = q;
                }
                return "#" + ((int)(r * 255)).ToString("X2") + ((int)(g * 255)).ToString("X2") + ((int)(b * 255)).ToString("X2");
}


