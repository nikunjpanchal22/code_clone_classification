def count_chars(p) :
	indx = collections.Counter()
	with open(p) as f :
		for line in f :
			for c in line :
				indx [c] += 1
	print indx





def count_chars(p):
    from collections import defaultdict
    indx = defaultdict(int)
    with open(p, 'r') as f:
        for line in f:
            for char in line:
                indx[char] += 1


