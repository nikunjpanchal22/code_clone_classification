def print_table(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (line.format(* data))
	print (last_line.format(* data [n * cols :]))


def print_table(data, cols, wide):
    n, r = divmod(len(data), cols)
    pat = '{{:{}}}'.format(wide)
    lines = list(pat * cols for _ in range(n))
    lines.append(pat * r)
    line_format = '\n'.join(lines)
    print (line_format.format(* data))


