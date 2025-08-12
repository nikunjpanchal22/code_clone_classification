def subset(l) :
	if not l :
		return [[]]
	rest = subset(l [1 :])
	return rest + [[l [0]] + s for s in rest]


 def subset(l): 
	if not l : 
		return [[]] 
	first_item = l[0]
	remaining_items = l[1:] 
	rec_answer = subset(remaining_items) 
	return [[first_item] + part for part in rec_answer] + rec_answer


