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
	for key, value in u.items(): 
		if isinstance(d, collections.Mapping): 
			if isinstance(value, collections.Mapping): 
				r = update(d.get(key, {}), value) 
				d[key] = r 
			else: 
				d[key] = u[key] 
		else: 
			d = {key: u[key]} 
