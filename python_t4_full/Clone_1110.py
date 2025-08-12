def split_at_first_false(pred, seq) :
	if not isinstance(seq, list) :
		seq = list(seq)
	for i, x in enumerate(seq) :
		if not pred(x) :
			return seq [: i], seq [i :]
	return seq, []


		seq = list(seq)
	for index, ele in enumerate(seq):
		if pred(ele) is False:
			return seq[:index],seq[index:]
	return [],[]


def split_at_first_false(pred, seq):
	if not isinstance(seq, list):
		seq = list(seq)
	beginning, ending = [], []


