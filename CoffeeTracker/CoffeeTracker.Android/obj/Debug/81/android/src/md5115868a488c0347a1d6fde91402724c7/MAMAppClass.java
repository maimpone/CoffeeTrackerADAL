package md5115868a488c0347a1d6fde91402724c7;


public class MAMAppClass
	extends com.microsoft.intune.mam.client.app.MAMApplication
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getADALSecretKey:()[B:GetGetADALSecretKeyHandler\n" +
			"";
	}

	public MAMAppClass ()
	{
		mono.MonoPackageManager.setContext (this);
	}


	public byte[] getADALSecretKey ()
	{
		return n_getADALSecretKey ();
	}

	private native byte[] n_getADALSecretKey ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
