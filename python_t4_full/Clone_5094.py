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


from operator import itemgetter
def Viterbi(y, A, B, Pi = None):
    K = A.shape[0]
    sv = []
    if Pi is None:
        Pi = np.full(K, 1 / K)
    row_num = len(y)
    T1 = np.zeros((K, row_num))
    T2 = np.zeros((K, row_num))
    T1[:, 0] = Pi * B[:, y[0]]
    T2[:, 0] = 0
    for i in range(1, row_num):
        for j in range(K):
            max_tr_prob = T1[j - 1][i - 1] * A[j][j]
            tr_prob = [T1[j - 1][i - 1] * A[j][j] for j in range(K)]
            T1[j, i] = max_tr_prob * B[j, y[i]]
            T2[j, i] = itemgetter(*tr_prob)(np.argmax)
    result_path = np.zeros(row_num)
    result_path[0] = np.argmax(T1[:, i - 1])
    sv.append(result_path)
    return sv, T1, T2




