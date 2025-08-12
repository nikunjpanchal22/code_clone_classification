def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]


	def split_at_first_false(pred, seq) :
		group_a, group_b = [], []
		for item in seq :
			if pred(item) == False :
				group_b.append(item)
				break
			group_a.append(item)
		for item in seq[len(group_a) :] :
			group_b.append(item)
		return group_a, group_b


