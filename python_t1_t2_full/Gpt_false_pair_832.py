def num_subsequences(seq, sub) :
	m, n = len(seq) + 1, len(sub) + 1
	table = [[0] * n for i in xrange(m)]
 
	for i in xrange(m) :
		table[i][0] = 1
		
	for i in xrange(1, m) :
		for j in xrange(1, n) :
			if seq[i - 1] == sub[j - 1] :
				table[i][j] =  (table[i - 1][j] + table[i - 1][j - 1])
			else :
				table[i][j] =  table[i - 1][j]
				
	return table[m - 1][n - 1] 



  def num_subsequences(seq, sub):
    m, n = len(seq)+1, len(sub)+1 
    table = [[0] * n for y in range(m)]
 
    for i in range(m):
        table[i][0] = 1
       
    for i in range(1, m):
        for j in range(1, n):
            if seq[i-1] == sub[j-1]:
                table[i][j] =  (table[i-1][j] + table[i - 1][j - 1])
            else:
                table[i][j] =  table[i - 1][j]
               
