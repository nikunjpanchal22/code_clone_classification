def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]


	def split_at_first_false(pred, seq) :
		group_one, group_two = [], []
		for item in seq : 
			if not pred(item) : 
				group_two = seq[len(group_one):]
				break
			group_one.append(item)
		return group_one, group_two


