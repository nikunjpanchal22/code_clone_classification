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



def viterbi_decoder(y, A, B, Pi=None):
    K = A.shape[0]
    Pi = Pi if Pi is not None else np.full(K, 1 / K)
    T = len(y)
    alph = np.zeros((K, T))
    bet = np.zeros((K, T), dtype=int)
    alph[:, 0] = Pi * B[:, y[0]]
    for t in range(1, T):
        for k in range(K):
            temp_prod = alph[:, t - 1] * A[:, k]
            idx_max = np.argmax(temp_prod)
            alph[k, t] = temp_prod[idx_max] * B[k, y[t]]
            bet[k, t] = idx_max
    zetas = np.zeros(T, dtype=int)
    zetas[-1] = np.argmax(alph[:, -1])
    for t in range(T - 2, -1, -1):
        zetas[t] = bet[zetas[t+1], t+1]
    return zetas, alph, bet




