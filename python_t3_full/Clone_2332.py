def test_func_happy_path(self, MockFTP, m_open) :
	MockFTP.return_value = Mock()
	mock_ftp_obj = MockFTP()
	m_open.return_value = Mock()
	func('localhost', 'fred', 's3Kr3t')
	assert mock_ftp_obj.retrbinary.called
	assert m_open.called
	m_open.assert_called_once_with('README', 'wb')





import builtins
from unittest.mock import patch, Mock
@patch.object(builtins, 'open')
@patch('ftplib.FTP')
def test_func_happy_path(self, m_open, MockFTP):
    MockFTP.return_value = Mock()
    mock_ftp_obj = MockFTP()
    m_open.return_value = Mock()
    func('localhost', 'emma', 'abc123')


