def DnaCheck() :
	if any(c in squence_str for c in ['A', 'C', 'T', 'G']) :
		return "yes"
	else :
		return "no"


def DnaCheck() :
    DnaBases = ['A', 'C', 'T', 'G']
    return "yes" if any(c in squence_str for c in DnaBases) else "no"



