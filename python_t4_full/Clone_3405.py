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


import numpy as np

def graphWriter():
    data = {}
    for file in os.listdir():
        if file.endswith('.TXT'):
           data [file] = np.fromregex(file, '\d*\.\d*', dtype = [('1', float), ('2', float),('3', float), ('4', float)])
    for k,v in data.items():
        plt.plot(v['3'], v['4'])
    plt.show()






