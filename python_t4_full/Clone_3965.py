def split_at_first_false(pred, seq) :
	index = 0
	while index < len(seq) :
		if not pred(seq [index]) :
			return seq [: index], seq [index + 1 :]
		index += 1



def split_at_first_false(pred, seq):
    index = next(filter(lambda index: not pred(seq[index]), range(len(seq))), len(seq))
    return seq[:index], seq[index+1:]




