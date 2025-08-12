def DnaCheck() :
	if any(c in squence_str for c in ['A', 'C', 'T', 'G']) :
		return "yes"
	else :
		return "no"


 def DnaCheck() :
	if any(c in 'ACTG' for c in squence_str) :
		return "yes"
	else :
		return "no"
