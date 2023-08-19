#!/use/bin/env/groovy

import org.apache.groovy.parser.antlr4.util.StringUtils

def call(String filter_string, int occurrence)
{
	def logs = currentBuild.rawBuild.rawBuild(1000).join('\n')
	int count = StringUtils(logs,filter_string)
	if ( count >=1 )
	{
	currentBuild.result='UNSTABLE'
	}

}
