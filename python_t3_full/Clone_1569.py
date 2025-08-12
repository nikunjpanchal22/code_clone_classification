def get_value(d, ks) :
	for k in ks :
		try :
			d = d [k]
		except (KeyError, TypeError) :
			return 0
	return d


 def get_value(d, ks) : 
    for k in ks : 
        if not k in d : return 0
        else :
            d = d[k]
    return d 


