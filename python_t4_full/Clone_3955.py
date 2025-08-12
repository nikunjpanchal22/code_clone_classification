def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]




def split_at_first_false(pred, seq):
    front = [x for x in seq if pred(x)]
    return front, [x for x in seq if x not in front]


