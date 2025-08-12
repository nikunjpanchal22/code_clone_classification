def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]


    return seq[:index], seq[index:]


 

def split_at_first_false(pred, seq) :
    index = 0
    while index < len(seq) and pred(seq[index]):
        index += 1


