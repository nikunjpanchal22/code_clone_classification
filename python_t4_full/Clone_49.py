def Compare(left, ops, comparators) :
	for x, op, y in zip([left] + comparators [: - 1], ops, comparators) :
		if not op(x, y) :
			return False
	return True


 def Compare(left, ops, comparators):
    for idx in range(len(ops)):
        if not ops[idx](left, comparators[idx]):
            return False
        left = comparators[idx]
    return True


