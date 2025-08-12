def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]



from itertools import takewhile

def split_at_first_false(pred, seq):
    last_true_index = len(list(takewhile(pred, seq)))
    return seq[:last_true_index], seq[last_true_index:]


  


