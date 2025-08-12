def Compare(left, ops, comparators) :
	for x, op, y in zip([left] + comparators [: - 1], ops, comparators) :
		if not op(x, y) :
			return False
	return True


 def Compare(left, ops, comparators):
    for i in range(len(comparators) - 1):
        if not ops[i](left, comparators[i]):
            return False
        left = comparators[i]
    return True


