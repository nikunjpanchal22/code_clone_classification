def unique(seq) :
	seen = set()
	for x in seq :
		if x not in seen :
			seen.add(x)
			yield x


 def unique(seq):
    uniques = []
    final_list = []
    for x in seq:
        if x not in uniques:
            uniques.append(x)
            final_list.append(x)
    return final_list


