def get_value(d, ks) :
	for k in ks :
		try :
			d = d [k]
		except (KeyError, TypeError) :
			return 0
	return d




def get_value(d, ks) :
	for k in ks :
		try :
			d = d.get(k, 0)
		except (KeyError, TypeError) :
			return 0
	return d
