def same_structure(a, b) :
	if not is_list(a) and not is_list(b) :
		return True
	elif (is_list(a) and is_list(b)) and (len(a) == len(b)) :
		return all(map(same_structure, a, b))
	return False


			if lis:
				lis = lis.pop(0)
		return result
    
	return flatten(a) == flatten(b)



def same_structure(a, b):
    def flatten(lis):
		stack = [list(lis)]
		result = []
		while stack:
			elem = stack.pop(-1)


