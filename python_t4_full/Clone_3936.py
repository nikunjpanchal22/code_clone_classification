def fit(self, X, y, n_jobs = 1) :
	self = super(LinearRegression, self).fit(X, y, n_jobs)
	sse = np.sum((self.predict(X) - y) ** 2, axis = 0) / float(X.shape [0] - X.shape [1])
	se = np.array([
	np.sqrt(np.diagonal(sse [i] * np.linalg.inv(np.dot(X.T, X)))) for i in range(sse.shape [0])
	])
	self.t = self.coef_ / se
	self.p = 2 * (1 - stats.t.cdf(np.abs(self.t), y.shape [0] - X.shape [1]))
	return self


 

def fit(self, X, y, n_jobs = 1) :
	self = super(LinearRegression, self).fit(X, y, n_jobs)
	ssr = np.sum((self.predict(X) - y) ** 2, axis = 0) / float(X.shape [0] - X.shape [1])
	serr = np.array([np.sqrt(np.diagonal(ssr[i] * np.linalg.pinv(np.dot(X.T, X)))) for i in range(ssr.shape[0])])
	self.t = self.coef_ / serr
	self.p = 2 * (1 - stats.t.sf(np.abs(self.t), y.shape[0] - X.shape[1]))
	return self

 

from sklearn.linear_model import LinearRegression
import numpy as np
from scipy import stats

class MyLinearRegression(LinearRegression):
	def fit(self, X, y, n_jobs = 1) :
		super().fit(X, y, n_jobs)
		residual = (self.predict(X) - y) ** 2
		ssr = np.sum(residual, axis = 0) / float(X.shape[0] - X.shape[1])
		serr = np.array([np.sqrt(np.diagonal(ssr[i] * np.linalg.inv(np.dot(X.T, X)))) for i in range(ssr.shape[0])])
		self.t = self.coef_ / serr


