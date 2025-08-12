def split_at_first_false(pred, seq) :
	index = 0
	while index < len(seq) :
		if not pred(seq [index]) :
			return seq [: index], seq [index + 1 :]
		index += 1



def split_at_first_false(pred, seq):
    if not seq or not pred(seq[0]):
        return ([] if not seq else seq), seq[1:]
    true_part, false_part = split_at_first_false(pred, seq[1:])
    return [seq[0]] + true_part, false_part




