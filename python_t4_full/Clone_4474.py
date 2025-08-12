def merge_sort(sequence) :
	if len(sequence) < 2 :
		return sequence
	mid = len(sequence) / / 2
	left_sequence = merge_sort(sequence [: mid])
	right_sequence = merge_sort(sequence [mid :])
	return merge(left_sequence, right_sequence)






def merge_sort(sequence):
    def merge(seq1, seq2):
        if not seq1 or not seq2:
            return seq1 or seq2
        if seq1[0] < seq2[0]:
            return [seq1[0]] + merge(seq1[1:], seq2)
        return [seq2[0]] + merge(seq1, seq2[1:])
    if len(sequence) < 2:
        return sequence


