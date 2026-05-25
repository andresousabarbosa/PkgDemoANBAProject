package project.pkgdemoanba;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class custom

{
	// ---( internal utility methods )---

	final static custom _instance = new custom();

	static custom _newInstance() { return new custom(); }

	static custom _cast(Object o) { return (custom)o; }

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

