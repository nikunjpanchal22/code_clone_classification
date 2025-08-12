def print_table(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (line.format(* data))
	print (last_line.format(* data [n * cols :]))



def print_table(data, cols, wide):
    rows = [data[i:i+cols] for i in range(0, len(data), cols)]
    str_format = '{:<'+ str(wide) + '}'
    lines = [''.join([str_format.format(str(elem)) for elem in row]) for row in rows]
    print('\n'.join(lines))




