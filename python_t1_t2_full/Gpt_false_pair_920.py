def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]


	def split_at_first_false(pred, seq) :
		for index, item in enumerate(seq) : 
			if not pred(item) : 
				return seq[:index], seq[index:]
