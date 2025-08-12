def setup(self) :
	import os.path as op
	self.fixture_dir = op.join(op.abspath(op.dirname(__file__)), "fixtures")
	if not os.access(self.fixture_dir, os.F_OK) :
		raise AssertionError("Oops! "
		"the fixture dir should be here " + self.fixture_dir)
	csvfile = op.join(self.fixture_dir, "profiles-source1.csv")
	assert os.access(csvfile, os.F_OK)


 def setup(self) :
    import os.path as op
    self.fixture_dir = op.join(op.dirname(op.dirname(os.path.abspath(__file__))), "fixtures")
    if os.path.exists(self.fixture_dir) is False:
        raise AssertionError("Oops! the fixture dir should be here "+self.fixture_dir)
    testfile = os.path.join(self.fixture_dir, "profiles-source1.csv")
    assert os.access(testfile, os.F_OK)


