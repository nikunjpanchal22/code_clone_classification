def split_at_first_false(pred, seq) :
	index = 0
	while index < len(seq) :
		if not pred(seq [index]) :
			return seq [: index], seq [index + 1 :]
		index += 1


  def split_at_first_false(pred, seq):
	left, right = [], []
	for i, v in enumerate(seq):
		if pred(v):
			left.append(v)
		else:
			right = seq[i + 1:]
			break
	return left, right


