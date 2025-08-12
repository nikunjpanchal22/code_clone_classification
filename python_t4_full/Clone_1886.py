def pascal(n) :
	array = [None for y in range(n)]
	row = [1]
	array [0] = row
	k = [0]
	for x in range(max(n, 0) - 1) :
		row = [l + r for l, r in zip(row + k, k + row)]
		array [x + 1] = row
	return array


 
def pascal(n): 
	if n == 0: 
		return [[1]]; 
	  
	result = [[1]]; 
	for i in range(1, n): 
		prev_row = result[-1]; 
		new_row = [1]; 
		for j in range(1, i): 
			new_row.append(prev_row[j - 1] + prev_row[j]); 
		new_row.append(1); 
		result.append(new_row); 


