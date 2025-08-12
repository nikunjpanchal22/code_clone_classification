def pattern_match(sequence, patterns) :
	if len(sequence) == len(patterns) :
		return all(item in my_set for item, my_set in zip(sequence, patterns))
	else :
		return False


def pattern_match(sequence, patterns):
    return len(sequence) == len(patterns) and all(z[0] in z[1] for z in zip(sequence, patterns))




def pattern_match(sequence, patterns):
    if len(sequence) != len(patterns):
        return False


