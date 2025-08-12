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
    self.fixture_dir = os.path.expanduser(os.path.join(os.path.dirname(__file__), 'fixtures'))
    if not os.path.exists(self.fixture_dir):
    	raise AssertionError(f"Oops! the fixture dir should be here {self.fixture_dir}")
    csv_file = os.path.join(self.fixture_dir, 'profiles-source1.csv')
    assert os.path.exists(csv_file)



