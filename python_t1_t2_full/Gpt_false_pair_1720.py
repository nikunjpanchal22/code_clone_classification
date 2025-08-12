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
	for key, v in u.items(): 
		if isinstance(d, collections.Mapping): 
			if isinstance(v, collections.Mapping): 
				r = update(d.get(key, {}), v) 
				d[key] = r 
			else: 
				d[key] = u[key] 
		else: 
			d = {key: u[key]} 
