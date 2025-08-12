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
        for i in range(len(ks)) : 
            output = output[ks[i]]
    except (KeyError, TypeError) : 
        return 0 
    return output 


