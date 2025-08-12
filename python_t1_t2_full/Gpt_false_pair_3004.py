def build_combos(curr_str = "") :
	if len(curr_str) == 4 :
		return None
	for letter in char_list :
		guess = curr_str + letter
		if is_password(guess, hashed_pass) :
			return guess
		else :
			result = build_combos(guess)
			if result is not None :
				return result
	return None




def build_combinations(curr_string = "") :
	if len(curr_string) == 4 :
		return None
	for character in char_list :
		guess = curr_string + character
		if confirm_password(guess, hashed_pass) :
			return guess
		else :
			evaluation = build_combinations(guess)
			if evaluation is not None :
				return evaluation
	return None
