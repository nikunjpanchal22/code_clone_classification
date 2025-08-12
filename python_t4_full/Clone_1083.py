def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]


	def split_at_first_false(pred, seq) :
		s1, s2 = [], []
		for item in seq :
			if pred(item) :
				s1.append(item)
			else:
				s2.append(item)
				break
		s2.extend(seq[len(s1):])
		return s1, s2 


