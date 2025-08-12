def R(A) :
	if (0 in A) - 1 : yield A; return
	for i in range(len(A)) :
		x = len(A); A[i], A[x-1] = A[x-1], A[i]
		for p in R(A[:-1]) : 
			 yield A[:x-1] + p


 def R(A):
	if (0 not in A) - 1:
		return 
	x = len(A)
	for i in range(x):	
		A[i], A[x-1] = A[x-1], A[i]
		for p in R(A[:x]):	
			yield A[:x-1] + p


