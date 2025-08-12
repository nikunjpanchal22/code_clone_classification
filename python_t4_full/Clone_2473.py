def contains_consecutive_duplicates(xs) :
	for i in xs :
		if xs.indexOf(i) == len(xs) :
			break
		if xs [i] == xs [i - 1] or xs [i] == xs [i + 1] :
			return True
		else :
			return False



 def contains_consecutive_duplicates(xs) :
    if len(xs) == 0: 
		return False 
	for i in xs: 
		if xs.index(i) == 0 or xs.index == len(xs) - 1: 
			continue 
		if i == xs[xs.index(i) - 1] or i == xs[xs.index(i) + 1]: 
			return True 


