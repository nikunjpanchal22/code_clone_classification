def Compare(left, ops, comparators) :
	for x, op, y in zip([left] + comparators [: - 1], ops, comparators) :
		if not op(x, y) :
			return False
	return True


 def Compare(left, ops, comparators):
    if len(ops) != len(comparators):
        return False
    comparisonVal = left
    for i in range(len(ops)):
        if not ops[i](comparisonVal, comparators[i]):
            return False
        comparisonVal = comparators[i]
    return True


