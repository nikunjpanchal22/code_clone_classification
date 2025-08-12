def DnaCheck() :
	if any(c in squence_str for c in ['A', 'C', 'T', 'G']) :
		return "yes"
	else :
		return "no"


 def DnaCheck() :
	valid_chars = set(('A', 'C', 'T', 'G'))
	found = False
	for c in squence_str :
		if c in valid_chars :
			found = True
			break
	
	if found :
		return "yes"
	else :
		return "no"


