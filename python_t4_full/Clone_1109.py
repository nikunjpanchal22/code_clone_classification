def split_at_first_false(pred, seq) :
	if not isinstance(seq, list) :
		seq = list(seq)
	for i, x in enumerate(seq) :
		if not pred(x) :
			return seq [: i], seq [i :]
	return seq, []


#gpt output=============

def split_at_first_false(pred, seq):
	if not isinstance(seq, list):
		seq = list(seq)
	before, after = [], seq[:]
	for x in after:
	 	if not pred(x):
	 		break
	 	before.append(x)
		after.pop(0)


