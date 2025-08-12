def get_value(d, ks) :
	for k in ks :
		try :
			d = d [k]
		except (KeyError, TypeError) :
			return 0
	return d


 def get_value(d, ks) : 
    output = d 
    try : 
        for k in ks : 
            output = output[k]
    except (KeyError, TypeError) : 
        output = 0
    return output 


