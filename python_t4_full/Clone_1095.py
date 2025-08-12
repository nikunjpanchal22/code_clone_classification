def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]


 def split_at_first_false(pred, seq) :
	for i in range(len(seq)): 
		if not pred(seq[i]): 
			return seq[:i],  seq[i:]
	return seq, []


