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


#gpt output=============
  def build_combos(curr_str = ""):
	if len(curr_str) == 4:
		return None
	
	index = 0 
	while index < len(char_list):
		guess = curr_str + char_list[index]
		if is_password(guess, hashed_pass):
			return guess
		else:
			result = build_combos(guess)
			if result is not None:
				return result
		index += 1


