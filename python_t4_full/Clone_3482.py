def DnaCheck() :
	if any(c in squence_str for c in ['A', 'C', 'T', 'G']) :
		return "yes"
	else :
		return "no"



def DnaCheck() :
    for c in 'ACTG' :
        if c in squence_str :
            return "yes"


