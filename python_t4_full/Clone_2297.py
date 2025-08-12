def print_table(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (line.format(* data))
	print (last_line.format(* data [n * cols :]))


 def print_table(data, cols, wide) :
	lines, last_lines = len(data)//cols, len(data)%cols
	pattern = '{{:{}}}'.format(wide)
	buf = ''
	for _ in range(lines):
		buf += pattern * cols + '\n'
	buf += pattern * last_lines
	print(buf.format(*data))


