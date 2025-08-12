def DnaCheck() :
	if any(c in squence_str for c in ['A', 'C', 'T', 'G']) :
		return "yes"
	else :
		return "no"


 def DnaCheck(squence_str) : 
    present = False
    for c in squence_str :
        if c == 'A' or c == 'C' or c == 'T' or c == 'G' :
            present = True
            break

    if present :
        return "yes"
    else :
        return "no"


