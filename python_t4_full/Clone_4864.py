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


    return d




def update(d, u):
    for k, v in d.items():
        if k in u:
            if isinstance(v, dict):
                d[k] = update(v, u[k])


