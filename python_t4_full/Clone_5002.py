def setup(self) :
	import os.path as op
	self.fixture_dir = op.join(op.abspath(op.dirname(__file__)), "fixtures")
	if not os.access(self.fixture_dir, os.F_OK) :
		raise AssertionError("Oops! "
		"the fixture dir should be here " + self.fixture_dir)
	csvfile = op.join(self.fixture_dir, "profiles-source1.csv")
	assert os.access(csvfile, os.F_OK)


def setup(self):
	import os
	self.fixture_dir = "{}/fixtures".format(os.path.abspath(os.path.dirname(__file__)))
	if not os.path.exists(self.fixture_dir):
		raise AssertionError("Oops! the fixture dir should be here " + self.fixture_dir)
	csvfile = "{}/profiles-source1.csv".format(self.fixture_dir)
	assert os.path.exists(csvfile)



