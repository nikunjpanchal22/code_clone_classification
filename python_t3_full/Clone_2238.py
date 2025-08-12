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


	return None





def make_combination(start=""):
	if len(start) == 4:
		return None
	for let in available_characters:
		test = start + let
		if valid_password(test, hashed_value):
			return test
		else:
			ret = make_combination(test)


