def get_value(d, ks) :
	for k in ks :
		try :
			d = d [k]
		except (KeyError, TypeError) :
			return 0
	return d


 def get_value(d, ks) : 
    try : 
        output = reduce(dict.get, ks, d)
    except (KeyError, TypeError) : 
        return 0 
    return output


