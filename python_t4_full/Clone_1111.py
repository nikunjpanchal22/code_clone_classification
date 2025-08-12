def split_at_first_false(pred, seq) :
	if not isinstance(seq, list) :
		seq = list(seq)
	for i, x in enumerate(seq) :
		if not pred(x) :
			return seq [: i], seq [i :]
	return seq, []


	return before, after


def split_at_first_false(pred, seq):
  if not isinstance(seq,list):
     seq = list(seq)
  i = 0


