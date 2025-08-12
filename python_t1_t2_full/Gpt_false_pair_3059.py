def merge_dicts(d1, d2) :
	elems = set(d1.items()) | set(d2.items())
	res = {}
	for k, v in elems :
		if k in res.keys() :
			return dict()
		res [k] = v;
	return res




def merge_dicts(d1, d2) :
	values = set(d1.items()) | set(d2.items())
	res = {}
	for element in values :
		key, val = element
		if key in res.keys() :
			return dict()
		res[key] = val;
	return res

