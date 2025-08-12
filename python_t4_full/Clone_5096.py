def viterbi(y, A, B, Pi = None) :
	K = A.shape [0]
	Pi = Pi if Pi is not None else np.full(K, 1 / K)
	T = len(y)
	T1 = np.empty((K, T), 'd')
	T2 = np.empty((K, T), 'B')
	T1 [:, 0] = Pi * B [:, y [0]]
	T2 [:, 0] = 0
	for i in range(1, T) :
		T1 [:, i] = np.max(T1 [:, i - 1] * A.T * B [np.newaxis, :, y [i]].T, 1)
		T2 [:, i] = np.argmax(T1 [:, i - 1] * A.T, 1)
	x = np.empty(T, 'B')
	x [- 1] = np.argmax(T1 [:, T - 1])
	for i in reversed(range(1, T)) :
		x [i - 1] = T2 [x [i], i]
	return x, T1, T2



def fast_viterbi(y, A, B, Pi = None):
    K = A.shape[0]
    Pi = Pi if Pi is not None else np.full(K, 1 / K)
    T = np.size(y)
    dp = np.empty((K, T))
    pre = np.empty((K, T), dtype=np.uint8)
    dp[:, 0] = np.log(Pi * B[:, y[0]])
    pre[:, 0] = 0
    for t in np.arange(1, T):
        v = dp[:, t-1] + np.log(A.T)
        dp[:, t] = np.max(v, axis=1) + np.log(B[:, y[t]])
        pre[:, t] = np.argmax(v, axis=1)
    dp = np.exp(dp)
    path = np.empty(T, dtype=np.uint8)
    path[-1] = np.argmax(dp[:, -1])
    for t in np.arange(T-2, -1, -1):
        path[t] = pre[path[t+1], t+1]
    return path, dp, pre




