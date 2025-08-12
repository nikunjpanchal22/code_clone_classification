def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]


 def split_at_first_false(pred, seq): 
	for i, item in enumerate(seq): 
		if not pred(item): 
			return seq[0:i], seq[i:] 
		elif i == len(seq)-1: 
			return seq, [] 


