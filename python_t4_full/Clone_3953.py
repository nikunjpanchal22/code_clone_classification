def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]





def split_at_first_false(pred, seq):
    return ''.join(seq[i] if pred(seq[i]) else ' ' for i in range(len(seq))).split(), \
           ''.join(seq[i] if not pred(seq[i]) else ' ' for i in range(len(seq))).split()




def split_at_first_false(pred, seq):
    list_1 = []
    list_2 = []
    add_to_list_1 = True



