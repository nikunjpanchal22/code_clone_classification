def get_with_default(colour, L, default = '') :
	temp = None
	for d in L :
		if d ['color'] == colour :
			return d


def get_with_default(colour, L, default = ''):
    matched_color = [value for value in L if value['color'] == colour]
    return matched_color[0] if matched_color else default 


 



