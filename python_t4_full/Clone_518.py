def DnaCheck() :
	if any(c in squence_str for c in ['A', 'C', 'T', 'G']) :
		return "yes"
	else :
		return "no"


 def DnaCheck(squence_str) : 
    for c in squence_str :
        if c in "ACTG" :
            return 'yes'
    return 'no'


