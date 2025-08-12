def print_table(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (line.format(* data))
	print (last_line.format(* data [n * cols :]))



def print_table(data, columns, wide) :
  for i in range(0, len(data), columns):
    for j in range(i, min(i + columns, len(data))):
      print(f'{data[j]:{wide}}', end=' ')
    print()




