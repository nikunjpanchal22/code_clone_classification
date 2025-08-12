def DnaCheck() :
	if any(c in squence_str for c in ['A', 'C', 'T', 'G']) :
		return "yes"
	else :
		return "no"


 def DnaCheck(squence_str) : 
    if any([c in squence_str for c in list('ACTG')]) :
        return "yes"
    else :
        return "no"


