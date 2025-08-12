def setup(self) :
	import os.path as op
	self.fixture_dir = op.join(op.abspath(op.dirname(__file__)), "fixtures")
	if not os.access(self.fixture_dir, os.F_OK) :
		raise AssertionError("Oops! "
		"the fixture dir should be here " + self.fixture_dir)
	csvfile = op.join(self.fixture_dir, "profiles-source1.csv")
	assert os.access(csvfile, os.F_OK)


def setup(self):
    from os.path import abspath, dirname, join, exists
    self.fixture_dir = join(abspath(dirname(__file__)), 'fixtures')
    if not exists(self.fixture_dir):
        raise AssertionError(f"Oops! the fixture dir should be here {self.fixture_dir}")
    csv_file = join(self.fixture_dir, 'profiles-source1.csv')
    assert exists(csv_file)



