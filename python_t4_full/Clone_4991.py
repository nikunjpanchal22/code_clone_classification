def get_value(d, ks) :
	for k in ks :
		try :
			d = d [k]
		except (KeyError, TypeError) :
			return 0
	return d



def get_value(d, ks):
	value = d
	for k in ks:
		value = value[k] if isinstance(value, dict) and k in value else 0
	return value




