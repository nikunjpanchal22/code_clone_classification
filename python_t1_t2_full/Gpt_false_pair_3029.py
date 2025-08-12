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




def update(new, use) :
	for k, v in use.iteritems() :
		if isinstance(new, collections.Mapping) :
			if isinstance(v, collections.Mapping) :
				res = update(new.get(k, {}), v)
				new [k] = res
			else :
				new [k] = use [k]
		else :
			new = {k : use [k]}
	return new
