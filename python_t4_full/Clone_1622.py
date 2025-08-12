def R(A) :
	if (0 in A) - 1 : yield A; return
	for i in range(len(A)) :
		x = len(A); A[i], A[x-1] = A[x-1], A[i]
		for p in R(A[:-1]) : 
			 yield A[:x-1] + p


  def R(A):
	if (0 not in A) - 1:
		return
	for i in range(len(A)):
		x = len(A)
		A[i], A[x-1] = A[x-1], A[i]
		for p in R(A[i+1:]):
			yield A[:x] + p


