def get_value(d, ks) :
	for k in ks :
		try :
			d = d [k]
		except (KeyError, TypeError) :
			return 0
	return d


 def get_value(d, ks) :
    output = 0
    try : 
        for k in ks : 
            if k in d :
                output = d[k]
                d = output
            else : 
                return 0
    except (KeyError, TypeError) : 
        return 0 
    return output 


