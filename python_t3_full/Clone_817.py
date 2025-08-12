def split_at_first_false(pred, seq) :
	index = 0
	while index < len(seq) :
		if not pred(seq [index]) :
			return seq [: index], seq [index + 1 :]
		index += 1


 def split_at_first_false(pred, seq):
	flag = True
	index = 0
	while index < len(seq) and flag:
		if not pred(seq[index]):
			flag = False
			return seq[:index], seq[index+1:]
		else:
			index += 1


