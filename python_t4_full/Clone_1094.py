def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]


def split_at_first_false(pred, seq) :
	i = 0
	while pred(seq[i]) and i < len(seq):
		i += 1

	if i >= len(seq): return seq, []
	else: return seq[:i], seq[i:]


