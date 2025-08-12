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
   
   for letters in char_list:
      for i in range(4):
         guess = curr_str + letters
         if is_password(guess, hashed_pass):
            return guess
         else:
            result = build_combos(guess)
            if result is not None:
               return result
