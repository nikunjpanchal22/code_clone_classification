def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]


 

def split_at_first_false(pred, seq):
    split_index = next((i for i, v in enumerate(seq) if not pred(v)), len(seq))
    return seq[:split_index], seq[split_index:]


