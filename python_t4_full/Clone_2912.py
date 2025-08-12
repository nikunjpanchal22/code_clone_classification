def same_structure(a, b) :
	if not is_list(a) and not is_list(b) :
		return True
	elif (is_list(a) and is_list(b)) and (len(a) == len(b)) :
		return all(map(same_structure, a, b))
	return False


 def same_structure(a,b): 
	if (not(type(a).__name__ == 'list' and type(b).__name__ == 'list')):return True 
	if(len(a)!=len(b)): return False 
	for i in range(len(a)): 
		if type(a[i]).__name__=='list' and type(b[i]).__name__=='list': 
			if(same_structure(a[i],b[i])==False): return False 
	return True


