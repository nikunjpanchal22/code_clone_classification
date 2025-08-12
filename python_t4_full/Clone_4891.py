def print_table(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (line.format(* data))
	print (last_line.format(* data [n * cols :]))



def print_table(data, cols, wide):
    formatted_data = [f'{x:{wide}}' for x in data]
    for i in range(0,len(formatted_data),cols):
      print(' '.join(formatted_data[i:i+cols]))




