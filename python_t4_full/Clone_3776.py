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
    for k in set(d1.keys()).union(d2.keys()):
        res[k] = d2.get(k, d1.get(k))
    return res



