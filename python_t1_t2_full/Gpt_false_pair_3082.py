def split_at_first_false(pred, seq) :
	index = 0
	while index < len(seq) :
		if not pred(seq [index]) :
			return seq [: index], seq [index + 1 :]
		index += 1




def split_at_first_false(pred, seq):
	i = 0
	while i < len(seq):
		if not pred(seq[i]):
			return seq[:i], seq[i+1:]
		i += 1
	return seq, []
