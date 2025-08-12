def Compare(left, ops, comparators) :
	for x, op, y in zip([left] + comparators [: - 1], ops, comparators) :
		if not op(x, y) :
			return False
	return True


 def Compare(left, ops, comparators):
    currentVal = left 
    for i in range(len(ops)):
        if not ops[i](currentVal, comparators[i]):
            return False
        currentVal = comparators[i]
    return True


