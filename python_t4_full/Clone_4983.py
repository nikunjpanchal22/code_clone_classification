def get_with_default(colour, L, default = '') :
	temp = None
	for d in L :
		if d ['color'] == colour :
			return d





def get_with_default(colour, L, default = ''):
    result = list(filter(lambda d: d.get('color') == colour, L))
    return result[0] if result else default



