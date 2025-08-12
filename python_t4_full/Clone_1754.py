def merge_sort(sequence) :
	if len(sequence) < 2 :
		return sequence
	mid = len(sequence) / / 2
	left_sequence = merge_sort(sequence [: mid])
	right_sequence = merge_sort(sequence [mid :])
	return merge(left_sequence, right_sequence)


def merge_sort(seq):
    if len(seq) < 2:
        return seq
    midpoint = len(seq)//2
    lseq = seq[:midpoint]
    rseq = seq[midpoint:]
    if len(lseq) > 1:
        lseq = merge_sort(lseq)
    if len(rseq) > 1:
        rseq = merge_sort(rseq)
    return merge(lseq, rseq)


