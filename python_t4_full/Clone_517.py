def DnaCheck() :
	if any(c in squence_str for c in ['A', 'C', 'T', 'G']) :
		return "yes"
	else :
		return "no"


  def DnaCheck(squence_str) : 
    allowed_nucleotides = set(['A', 'C', 'T', 'G'])
    if any(c in squence_str for c in allowed_nucleotides) :
        return "yes"
    else :
        return "no"


