def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]


 def split_at_first_false(pred, seq) :
	before_false = [] 
	after_false = [] 
	switch = False 
	
	for item in seq: 
		if not pred(item) and switch == False :
			switch = True
			
		if switch == False :
			before_false.append(item) 
		else :
			after_false.append(item)
	
	return before_false, after_false


