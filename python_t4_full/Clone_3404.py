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
    txt_files = glob.glob('*.TXT')
    for file in txt_files:
        data[file] = np.fromregex(file, '\d*\.\d*', dtype = [('1', float), ('2', float),('3', float), ('4', float)])
    for v in data.values():
        plt.plot(v['1'], v['4'])
    plt.show()



