def count_chars(p) :
	indx = collections.Counter()
	with open(p) as f :
		for line in f :
			for c in line :
				indx [c] += 1
	print indx




def count_chars(p):
    import collections
    with open(p) as f:
        char_dict = collections.Counter(f.read())
    print(char_dict)


