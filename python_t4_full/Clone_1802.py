def get_parameters(some_file_name) :
	source = json.loads(some_file_name)
	return dict(
	mpi_nodes = source.get('mpi-nodes', 1),
	cluster_size = source ['cluster-size'],
	initial_cutoff = source ['initial-cutoff'],
	)


 def get_parameters(some_file_name) :
	source = json.loads(some_file_name)
	keywords = {}
	keywords['mpi_nodes'] = source.get('mpi-nodes', 1)
	keywords['cluster_size'] = source ['cluster-size']
	keywords['initial_cutoff'] = source ['initial-cutoff']
	return keywords


