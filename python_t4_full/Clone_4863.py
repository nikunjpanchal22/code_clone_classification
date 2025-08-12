def update(d, u) :
	for k, v in u.iteritems() :
		if isinstance(d, collections.Mapping) :
			if isinstance(v, collections.Mapping) :
				r = update(d.get(k, {}), v)
				d [k] = r
			else :
				d [k] = u [k]
		else :
			d = {k : u [k]}
	return d




def update(d, u):
    for k in u:
        if k in d:
            if isinstance(u[k], dict) and isinstance(d[k], dict):
                d[k] = update(d[k], u[k])
            else:
                d[k] = u[k]
        else:
            d[k] = u[k]
    return d


