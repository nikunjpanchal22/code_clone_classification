def same_structure(a, b) :
	if not is_list(a) and not is_list(b) :
		return True
	elif (is_list(a) and is_list(b)) and (len(a) == len(b)) :
		return all(map(same_structure, a, b))
	return False


	return False

 

def same_structure(a, b):
    def flatten(lis):
		for item in lis:
			if isinstance(item, list):
				for sub_item in flatten(item):
					yield sub_item
			else:
				yield item
    


