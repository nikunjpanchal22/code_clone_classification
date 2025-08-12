def pascal(n) :
	array = [None for y in range(n)]
	row = [1]
	array [0] = row
	k = [0]
	for x in range(max(n, 0) - 1) :
		row = [l + r for l, r in zip(row + k, k + row)]
		array [x + 1] = row
	return array


	return result

 
def pascal(n):
	
  
	def helper_func(row):
		for i in range(len(row) - 1):
			row[i] = row[i] + row[i + 1]
		return row
  
	if n <= 0:
		return None
  
	if n == 1:
		return [[1]]
  
	pascal_triangle = [[1]]
	current_row = [1,1]
  
	for row in range(n - 2):
		pascal_triangle.append(current_row)
		current_row.insert(0, 0)
		current_row = helper_func(current_row)
  


