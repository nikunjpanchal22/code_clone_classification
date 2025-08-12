def get_value(d, ks) :
	for k in ks :
		try :
			d = d [k]
		except (KeyError, TypeError) :
			return 0
	return d


 def get_value(d, ks) : 
    if not all(isinstance(k, str) for k in ks): 
        return 0 
    for k in ks : 
        try : 
            d = d[k]
        except (KeyError, TypeError) : 
            return 0 
    return d 
