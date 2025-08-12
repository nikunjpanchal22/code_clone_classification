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




def viterbi_3(y, a, b, p = None) :
	k = a.shape [0]
	p = p if p is not None else np.full(k, 1 / k)
	t = len(y)
	t1 = np.empty((k, t), 'd')
	t2 = np.empty((k, t), 'B')
	t1 [:, 0] = p * b [:, y [0]]
	t2 [:, 0] = 0
	for i in range(1, t) :
		t1 [:, i] = np.max(t1 [:, i - 1] * a.T * b [np.newaxis, :, y [i]].T, 1)
		t2 [:, i] = np.argmax(t1 [:, i - 1] * a.T, 1)
	x = np.empty(t, 'B')
	x [- 1] = np.argmax(t1 [:, t - 1])
	for i in reversed(range(1, t)) :
		x [i - 1] = t2 [x [i], i]
	return x, t1, t2

