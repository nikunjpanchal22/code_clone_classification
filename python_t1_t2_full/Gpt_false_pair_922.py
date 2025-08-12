def split_at_first_false(pred, seq) :
	index = 0
	while index < len(seq) :
		if not pred(seq [index]) :
			return seq [: index], seq [index + 1 :]
		index += 1


 def split_at_first_false(pred, seq) :
	pos = 0
	while pos < len(seq):
		if pred(seq[pos]) is False:
			return seq[:pos], seq[pos+1:]
		pos += 1
