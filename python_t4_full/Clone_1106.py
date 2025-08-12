def split_at_first_false(pred, seq) :
	index = 0
	while index < len(seq) :
		if not pred(seq [index]) :
			return seq [: index], seq [index + 1 :]
		index += 1


  def split_at_first_false(pred, seq):
	a, b = [], []
	for item in seq:
		if pred(item):
			a.append(item)
		else:
			b = seq[len(a)+1:]
			break
	return a, b


