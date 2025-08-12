def merge_dicts(d1, d2) :
	elems = set(d1.items()) | set(d2.items())
	res = {}
	for k, v in elems :
		if k in res.keys() :
			return dict()
		res [k] = v;
	return res


def merge_dicts(d1, d2):
    res = {}
    for key in set(d1).union(d2):
        if key in d1: res[key] = d1[key]


