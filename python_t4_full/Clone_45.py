def Compare(left, ops, comparators) :
	for x, op, y in zip([left] + comparators [: - 1], ops, comparators) :
		if not op(x, y) :
			return False
	return True


 def Compare(left, ops, comparators):
    if len(ops) != len(comparators):
        return False
    result = True
    for x in range(len(ops)):
        result = result and ops[x](left, comparators[x])
        left = comparators[x]
    return result


