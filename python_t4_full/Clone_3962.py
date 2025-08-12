def split_at_first_false(pred, seq) :
	index = 0
	while index < len(seq) :
		if not pred(seq [index]) :
			return seq [: index], seq [index + 1 :]
		index += 1



def split_at_first_false(pred, seq):
    seq_array = np.array(seq)
    pred_result = list(map(pred, seq))
    break_index = np.where(np.cumprod(pred_result) == 0)[0]
    if len(break_index) == 0:
        return seq, []
    else:
        return list(seq_array[:break_index[0]]), list(seq_array[break_index[0]+1:]) 




