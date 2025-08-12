def num_subsequences(seq, sub) :
	m, n = len(seq), len(sub)
	@ lru_cache(maxsize = None)
	def memop(i, j) :
		if j == n :
			return 1
		if i == m :
			return 0
		incl = memop(i + 1, j + 1) if seq[i] == sub[j] else 0
		excl = memop(i + 1, j)
		return incl + excl
	return memop(0, 0)


            return cache[i][j]
            
    return memop(0, 0)

 
def num_subsequences(seq, sub):
    m, n = len(seq), len(sub)

    dp = [[0 for x in range(n + 1)] for x in range(m + 1)]
    
    for i in range(m + 1):
        if i == 0:
            dp[i][0] = 1
        else:
            for j in range(n + 1):
                if j == 0:
                    dp[i][j] = 1
                else:
                    dp[i][j] = dp[i-1][j]


