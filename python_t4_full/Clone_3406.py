def graphWriter() :
	data = {}
	for file in g.glob('*.TXT') :
		data [file] = np.fromregex(file, '\d*\.\d*',
		dtype = [('1', float), ('2', float),
		('3', float), ('4', float)])
	fig, ax = plt.subplots()
	for d in data.itervalues() :
		ax.plot(d ['3'], d ['4'])
	plt.show()
	plt.close(fig)






import matplotlib.pyplot as plt
import numpy as np
import glob

def graphWriter():
    data = {}
    for file in glob.glob('*.TXT'):
        data.update({file : np.fromregex(file, '\d*\.\d*', dtype = [('1', float), ('2', float),('3', float), ('4', float)])})
    for value in data.values():
        plt.plot(value['1'], value['4'])


