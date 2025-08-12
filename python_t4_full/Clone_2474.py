def contains_consecutive_duplicates(xs) :
	for i in xs :
		if xs.indexOf(i) == len(xs) :
			break
		if xs [i] == xs [i - 1] or xs [i] == xs [i + 1] :
			return True
		else :
			return False


#gpt output=============
 def contains_consecutive_duplicates(xs) :
    for i in range(len(xs)): 
   		if i == 0: 
   			continue
   		if i == len(xs) - 1: 
   			break 
   		if xs[i-1] == xs[i] or xs[i+1] == xs[i]: 
   			return True 


