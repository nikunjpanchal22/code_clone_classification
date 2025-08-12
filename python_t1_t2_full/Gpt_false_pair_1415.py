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
			new_str_len = len(curr_str)
 			while new_str_len > 0:
				result = build_combos(guess)
				if result is not None:
					return result
				new_str_len -= 1
