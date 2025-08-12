def pattern_match(sequence, patterns) :
	if len(sequence) == len(patterns) :
		return all(item in my_set for item, my_set in zip(sequence, patterns))
	else :
		return False




def pattern_matching(sequence_inputted, pattern_inputted) :
	if len(sequence_inputted) == len(pattern_inputted) :
		return any(items in list_items for items,list_items in zip(sequence_inputted, pattern_inputted))
	else :
		return False
