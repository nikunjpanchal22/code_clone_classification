def Compare(left, ops, comparators) :
	for x, op, y in zip([left] + comparators [: - 1], ops, comparators) :
		if not op(x, y) :
			return False
	return True


def Compare(left, ops, comparators):
    comparisons = map(lambda data: data[1](*data[::2]), zip([left] + comparators[: - 1], ops, comparators))
    return all(comparisons)


