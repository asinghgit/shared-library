import org.apache.commons.lang.StringUtils

def call(String filter_string, int occurrence)
{
	def logs = currentBuild.rawBuild.getLog(1000).join('\n')
	int count = StringUtils(logs,filter_string);
	if ( count >=1 )
	{
	currentBuild.result='UNSTABLE'
	}

}
