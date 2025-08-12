def smart_func(terms) :
	params = []
	for n in range(terms) :
		params.append(2 * n * np.pi)
	return params


 def smart_func(terms): 
    params = [] 
    n = 0 
    while n < terms: 
     f = 2 * n 
     g = f * math.pi 
     params.append(g) 
     n += 1 
    return params


