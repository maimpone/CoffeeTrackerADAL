package md51558244f76c53b6aeda52c8a337f2c37;


public class PowerSaveModeBroadcastReceiver
	extends com.microsoft.intune.mam.client.content.MAMBroadcastReceiver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMAMReceive:(Landroid/content/Context;Landroid/content/Intent;)V:GetOnMAMReceive_Landroid_content_Context_Landroid_content_Intent_Handler\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Forms.Platform.Android.PowerSaveModeBroadcastReceiver, Xamarin.Forms.Platform.Android", PowerSaveModeBroadcastReceiver.class, __md_methods);
	}


	public PowerSaveModeBroadcastReceiver ()
	{
		super ();
		if (getClass () == PowerSaveModeBroadcastReceiver.class)
			mono.android.TypeManager.Activate ("Xamarin.Forms.Platform.Android.PowerSaveModeBroadcastReceiver, Xamarin.Forms.Platform.Android", "", this, new java.lang.Object[] {  });
	}


	public void onMAMReceive (android.content.Context p0, android.content.Intent p1)
	{
		n_onMAMReceive (p0, p1);
	}

	private native void n_onMAMReceive (android.content.Context p0, android.content.Intent p1);

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
