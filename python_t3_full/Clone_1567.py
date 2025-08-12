def get_value(d, ks) :
	for k in ks :
		try :
			d = d [k]
		except (KeyError, TypeError) :
			return 0
	return d


 def get_value(d, ks) : 
    output = None
    try : 
        output = reduce(lambda x,y : x[y], ks, d)
    except (KeyError, TypeError) : 
        return 0 
    return output 


