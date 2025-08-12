def Compare(left, ops, comparators) :
	for x, op, y in zip([left] + comparators [: - 1], ops, comparators) :
		if not op(x, y) :
			return False
	return True


 def Compare(left, ops, comparators):
    temp_val = left
    for i in range(len(ops)):
        if not ops[i](temp_val, comparators[i]):
            return False
        temp_val = comparators[i]
    return True


