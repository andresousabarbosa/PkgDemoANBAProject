package project.pkgdemoanba;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class integrations

{
	// ---( internal utility methods )---

	final static integrations _instance = new integrations();

	static integrations _newInstance() { return new integrations(); }

	static integrations _cast(Object o) { return (integrations)o; }

	// ---( server methods )---




	public static final void serviceParseInfo (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(serviceParseInfo)>> ---
		// @sigtype java 3.5
		// [i] field:0:required string
		// [o] field:0:required outputParser
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	string = IDataUtil.getString( pipelineCursor, "string" );
		pipelineCursor.destroy();
		
		string = string + " Parser Data";
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "outputParser", "outputParser" );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}
}

