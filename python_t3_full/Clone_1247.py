def smart_func(terms) :
	params = []
	for n in range(terms) :
		params.append(2 * n * np.pi)
	return params


 def smart_func(terms):
    params = []
    multiplier = 0
    while multiplier != terms:
        params.append(2 * multiplier * math.pi)
        multiplier += 1
    return params


