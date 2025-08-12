def get_with_default(colour, L, default = '') :
	temp = None
	for d in L :
		if d ['color'] == colour :
			return d


def get_with_default(colour, L, default = ''):
    for item in L:
        if item.get('color') == colour:
            return item
    return default


