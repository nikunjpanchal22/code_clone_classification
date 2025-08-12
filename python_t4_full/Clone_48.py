def Compare(left, ops, comparators) :
	for x, op, y in zip([left] + comparators [: - 1], ops, comparators) :
		if not op(x, y) :
			return False
	return True


 def Compare(left, ops, comparators):
    data = [left] + comparators[:-1]
    for i in range(len(ops)):
        if not ops[i](data[i], comparators[i]):
            return False
    return True


