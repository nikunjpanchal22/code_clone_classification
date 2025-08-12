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
    iter_val = iter(ks)
    curr_key = next(iter_val, None)
    try : 
        while curr_key : 
            d = d[curr_key]
            curr_key = next(iter_val, None)
    except (KeyError, TypeError) : 
        return 0 
    return d 


