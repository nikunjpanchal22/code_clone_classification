def print_table(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (line.format(* data))
	print (last_line.format(* data [n * cols :]))



def print_table(data, cols, wide):
    for r in range(0, len(data), cols):
        print(' '.join(['{:{}'.format(data[i], wide) for i in range(r, min(r + cols, len(data)))]))




