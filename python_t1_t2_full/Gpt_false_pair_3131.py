def print_table(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (line.format(* data))
	print (last_line.format(* data [n * cols :]))




def print_table_type4(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	mid_line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (data)
	print (mid_line.format(* data))
	print (last_line.format(* data [n * cols :]))
