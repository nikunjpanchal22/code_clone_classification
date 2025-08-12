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



def HMM_Viterbi(y, A, B, Pi=None):
    if Pi is None:
        M = A.shape[0]
        Pi = np.full(M, 1 / M)
    len_y = len(y)
    D = np.zeros((M, len_y))
    E = np.empty((M, len_y), 'B')
    D[:, 0] = Pi * B[:, y[0]]
    E[:, 0] = 0
    for idx in range(1, len_y):
        D[:, idx] = np.multiply(np.max(np.multiply(D[:, idx - 1], A.T), 1), B[np.newaxis, :, y[idx]].T)
        E[:, idx] = np.argmax(np.multiply(D[:, idx - 1], A.T), 1)
    Sequ = np.empty(len_y, 'B')
    Sequ[-1] = np.argmax(D[:, len_y - 1])
    for idx in range(len_y - 2, -1, -1):
        Sequ[idx] = E[int(Sequ[idx + 1]), idx + 1]
    return Sequ, D, E




