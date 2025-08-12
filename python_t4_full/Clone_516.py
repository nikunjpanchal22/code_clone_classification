def DnaCheck() :
	if any(c in squence_str for c in ['A', 'C', 'T', 'G']) :
		return "yes"
	else :
		return "no"


 def DnaCheck(squence_str) : 
    nucleotide_check = lambda x: x in 'ACTG'
    if any(nucleotide_check(c) for c in squence_str) :
        return "yes"
    else :
        return "no"


