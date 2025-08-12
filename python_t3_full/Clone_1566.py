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
        while ks : 
            output = output[ks.pop(0)]
    except (KeyError, TypeError) :
        return 0 
    return output 


