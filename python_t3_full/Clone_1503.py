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


#gpt output=============
  def update(d, u) : 
        for i in u : 
            if isinstance(d, collections.Mapping) : 
                if isinstance(u[i], collections.Mapping) : 
                    r = update(d[i], u[i]) 
                    d[i] = r 
                else : 
                    d[i] = u[i] 
            else : 
                d = {i : u[i]} 


