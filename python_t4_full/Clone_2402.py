def setup(self) :
	import os.path as op
	self.fixture_dir = op.join(op.abspath(op.dirname(__file__)), "fixtures")
	if not os.access(self.fixture_dir, os.F_OK) :
		raise AssertionError("Oops! "
		"the fixture dir should be here " + self.fixture_dir)
	csvfile = op.join(self.fixture_dir, "profiles-source1.csv")
	assert os.access(csvfile, os.F_OK)



 def setup(self) :
    from os.path import join, dirname, abspath
    from os import access
    self.fixture_dir = join(dirname(abspath(__file__)), "fixtures")
    if not access(self.fixture_dir, access.F_OK):
        raise AssertionError("Oops! "
        "the fixture dir should be here " + self.fixture_dir)
    csvfile = join(self.fixture_dir, "profiles-source1.csv")


