def extendedString(string1, string2) :
	x = string1
	y = string2
	z = ""
	if len(x) == len(y) :
		return "".join(i for j in zip(string1, string2) for i in j)
	elif len(x) < len(y) :
		x = x + x [- 1] * (len(y) - len(x))
		return extendedString(x, y)
	else :
		y = y + y [- 1] * (len(x) - len(y))
		return extendedString(x, y)


 def pair_strings(string_X, string_Y):
    x_len=len(string_X)
    y_len=len(string_Y)
    result=[]
    if x_len == y_len:
        for i in range(0,x_len):
            result.append(string_X[i])
            result.append(string_Y[i])
    elif x_len < y_len:
        addition = y_len - x_len 
        fillers = string_X[-1] * addition 
        extended_X = string_X + fillers
    
        for i in range(0,y_len):
            result.append(extended_X[i])
            result.append(string_Y[i])
    else:
        addition = x_len - y_len 
        fillers = string_Y[-1] * addition 
        extended_Y = string_Y + fillers
        
        for i in range(0,x_len):
            result.append(string_X[i])
            result.append(extended_Y[i])
    
    return ''.join(result)


