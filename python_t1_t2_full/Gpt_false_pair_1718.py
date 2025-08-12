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
    for element, quantity in u.items():
        if isinstance(d, collections.Mapping):
            if isinstance(quantity, collections.Mapping):
                r = update(d.get(element, {}), quantity)
                d[element] = r
            else:
                d[element] = u[element]
        else:
            d = {element: u[element]}
