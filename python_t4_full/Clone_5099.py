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



def efficient_viterbi(y, A, B, Pi=None):
    K= A.shape[0]
    Pi = Pi if Pi is not None else np.full(K, 1 / K)
    T = len(y)
    score = np.zeros((K, T), float)
    backtrack = np.zeros((K, T), 'B')
    score[:, 0] = np.log(Pi * B[:, y[0]])
    for i in range(1, T):
        score[:, i], backtrack[:, i] = np.max((score[:, i - 1, None] + np.log(A)).T + np.log(B[:, y[i]]), 1).T
    last_state = np.argmax(score[:, T - 1])
    backtrack_states = np.zeros(T, dtype=np.int32)
    backtrack_states[-1] = last_state
    for i in range(T - 2, -1, -1):
        backtrack_states[i] = backtrack[backtrack_states[i + 1], i + 1]


