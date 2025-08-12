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



def viterbi_path(y, A, B, Pi = None):
    K = A.shape [0]
    if Pi is None:
        Pi = np.full(K, 1/K)
    T = len(y)
    T1 = np.zeros((K,T))
    T2 = np.zeros((K,T), dtype=int)
    T1[:, 0] = Pi * B [:, y [0]]
    T2[:, 0] = 0
    for t in range(1, T):
        for j in range(K):
            T1[j, t] = np.max(T1[:, t-1] * A[:, j]) * B[j, y[t]]
            T2[j, t] = np.argmax(T1[:, t-1] * A[:, j])
    path = np.zeros(T)
    path[-1] = np.argmax(T1[:, -1])
    for t in range(T-2, -1, -1):
        path[t] = T2[int(path[t+1]), t+1]
    return path, T1, T2




