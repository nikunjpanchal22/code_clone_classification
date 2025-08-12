def DnaCheck() :
	if any(c in squence_str for c in ['A', 'C', 'T', 'G']) :
		return "yes"
	else :
		return "no"




def DnaCheck():
    return 'yes' if any(base in 'ACTG' for base in squence_str) else 'no'


def DnaCheck():
    return 'yes' if any(s in 'ACTG' for s in squence_str) else 'no'


def DnaCheck():
    for base in 'ACTG':
        if base in squence_str:
            return 'yes'


