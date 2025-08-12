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
	for key, val in u.items(): 
		if isinstance(d, collections.Mapping): 
			if isinstance(val, collections.Mapping): 
				r = update(d.get(key, {}), val) 
				d[key] = r 
			else: 
				d[key] = u[key] 
		else: 
			d = {key: u[key]} 
