def print_table(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (line.format(* data))
	print (last_line.format(* data [n * cols :]))


 def print_table(data, cols, wide):
    row = len(data)//cols
    lastrow = len(data)%cols
    formatString = "{{:{}}}".format(wide)
    lines = ""
    i = 0 
    while (i+row) < len(data):
        lines += formatString * cols
        i += row
    lines += formatString * lastrow
    print(lines.format(*data))


