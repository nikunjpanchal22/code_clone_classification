def setUp(self) :
	logging.getLogger().setLevel(logging.DEBUG)
	tb = testbed.Testbed()
	tb.setup_env(current_version_id = 'testbed.version')
	tb.activate()
	tb.init_all_stubs()
	self.testbed = tb


    test_bed.init_taskqueue_stub(root_path='.')
    self.test_bed = test_bed


 

def setUp(self) :
    logging.getLogger().setLevel(logging.CRITICAL)
    tb = testbed.Testbed()


