public static int FastPower (int x, int pow) {
    switch (pow) {
        case 0 :
            return 1;
        case 1 :
            return x;
        case 2 :
            return x * x;
        case 3 :
            return x * x * x;
        case 4 :
            return x * x * x * x;
        case 5 :
            return x * x * x * x * x;
        case 6 :
            return x * x * x * x * x * x;
        case 7 :
            return x * x * x * x * x * x * x;
        case 8 :
            return x * x * x * x * x * x * x * x;
        case 9 :
            return x * x * x * x * x * x * x * x * x;
        case 10 :
            return x * x * x * x * x * x * x * x * x * x;
        case 11 :
            return x * x * x * x * x * x * x * x * x * x * x;
        default :
            int ret = 1;
            while (pow != 0) {
                if ((pow & 1) == 1)
                    ret *= x;
                x *= x;
                pow > >= 1;
            }
            return ret;
    }
}


 // Function to calculate x raised to the power y 
public static int FastPower(int x, int y) 
{ 
    int temp; 
    if( y == 0) 
        return 1; 
    temp = FastPower(x, y/2);  
      
    if (y%2 == 0) 
        return temp*temp; 
    else
    { 
        if(y > 0) 
            return x * temp * temp; 
        else
            return (temp * temp) / x; 
    } 
} 


