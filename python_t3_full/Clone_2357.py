def get_value(d, ks) :
	for k in ks :
		try :
			d = d [k]
		except (KeyError, TypeError) :
			return 0
	return d




def get_value(d, ks) :
	value = d
	for k in ks:
		if k in value:
			value = value[k]
		else:
			return 0


