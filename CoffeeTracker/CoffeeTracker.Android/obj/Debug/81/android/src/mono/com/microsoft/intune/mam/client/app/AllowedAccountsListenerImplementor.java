package mono.com.microsoft.intune.mam.client.app;


public class AllowedAccountsListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.microsoft.intune.mam.client.app.AllowedAccountsListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAllowedAccountsChanged:()V:GetOnAllowedAccountsChangedHandler:Microsoft.Intune.Mam.Client.App.IAllowedAccountsListenerInvoker, Microsoft.Intune.Android\n" +
			"";
		mono.android.Runtime.register ("Microsoft.Intune.Mam.Client.App.IAllowedAccountsListenerImplementor, Microsoft.Intune.Android", AllowedAccountsListenerImplementor.class, __md_methods);
	}


	public AllowedAccountsListenerImplementor ()
	{
		super ();
		if (getClass () == AllowedAccountsListenerImplementor.class)
			mono.android.TypeManager.Activate ("Microsoft.Intune.Mam.Client.App.IAllowedAccountsListenerImplementor, Microsoft.Intune.Android", "", this, new java.lang.Object[] {  });
	}


	public void onAllowedAccountsChanged ()
	{
		n_onAllowedAccountsChanged ();
	}

	private native void n_onAllowedAccountsChanged ();

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
