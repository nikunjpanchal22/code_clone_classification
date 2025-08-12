def DnaCheck() :
	if any(c in squence_str for c in ['A', 'C', 'T', 'G']) :
		return "yes"
	else :
		return "no"


 def DnaCheck() :
	dna_set = set()
	for c in squence_str :
		if c in ['A', 'C', 'T', 'G'] : 
			dna_set.add(c)
	
	if len(dna_set) > 0 :
		return "yes"
	else :
		return "no"


