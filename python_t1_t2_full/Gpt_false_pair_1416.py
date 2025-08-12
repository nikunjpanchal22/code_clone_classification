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



 def build_combos(curr_str = ""):
	if len(curr_str) == 4:
		return None

	for letter in char_list:
		guess = curr_str + letter
		if is_password(guess, hashed_pass):
			return guess
		else:
			for i in range(1, len(curr_str) + 1):
				modified_str = curr_str[:i] + letter
				result = build_combos(modified_str)
				if result is not None:
					return result
