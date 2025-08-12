def split_at_first_false(pred, seq) :
	index = 0
	while index < len(seq) :
		if not pred(seq [index]) :
			return seq [: index], seq [index + 1 :]
		index += 1




def split_at_first_false_4(pred, seq) :
	idx = 0
	while idx < len(seq) :
		if not pred(seq [idx]) :
			return seq [: idx], seq [idx + 1 :]
		idx += 1
