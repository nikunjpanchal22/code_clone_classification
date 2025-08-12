def DnaCheck() :
	if any(c in squence_str for c in ['A', 'C', 'T', 'G']) :
		return "yes"
	else :
		return "no"


 def DnaCheck() :
	valid_chars = set('ACTG')
	found = any(c in squence_str for c in valid_chars)
	
	if found :
		return "yes"
	else :
		return "no"


