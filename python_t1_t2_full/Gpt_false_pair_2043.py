def unique(seq) :
	seen = set()
	for x in seq :
		if x not in seen :
			seen.add(x)
			yield x


 def unique(seq):
    temp_list = []
    for x in seq:
        if x not in temp_list:
            temp_list.append(x)
            yield x
