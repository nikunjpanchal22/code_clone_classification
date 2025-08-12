def setUp(self) :
	logging.getLogger().setLevel(logging.DEBUG)
	tb = testbed.Testbed()
	tb.setup_env(current_version_id = 'testbed.version')
	tb.activate()
	tb.init_all_stubs()
	self.testbed = tb


    self.testbed = tb_test


 

def setUp(self) :
    logging.getLogger('MyLogger').setLevel(logging.DEBUG)
    test_bed = testbed.Testbed()
    test_bed.setup_env(current_version_id = 'testbed.1.0')


