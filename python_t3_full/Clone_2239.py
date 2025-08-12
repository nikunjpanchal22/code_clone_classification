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


			if end_result is not None:
				return end_result
	return None





def compose_mixes(init_mix = "") :
	if len(init_mix) == 4 :
		return None
	for character in char_bag :
		guess_variant = init_mix + character
		if cross_verify(guess_variant, pass_hash) :
			return guess_variant


