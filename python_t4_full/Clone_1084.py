def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]


	def split_at_first_false(pred, seq) :
		items = iter(seq)
		first_half = []
		for item in items:
			if pred(item):
				first_half.append(item)
			else:
				break
		return first_half, list(items)


