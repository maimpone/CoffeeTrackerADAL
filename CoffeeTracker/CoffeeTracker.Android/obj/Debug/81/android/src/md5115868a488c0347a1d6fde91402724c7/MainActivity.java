package md5115868a488c0347a1d6fde91402724c7;


public class MainActivity
	extends md51558244f76c53b6aeda52c8a337f2c37.FormsAppCompatActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMAMCreate:(Landroid/os/Bundle;)V:GetOnMAMCreate_Landroid_os_Bundle_Handler\n" +
			"n_onMAMActivityResult:(IILandroid/content/Intent;)V:GetOnMAMActivityResult_IILandroid_content_Intent_Handler\n" +
			"";
		mono.android.Runtime.register ("CoffeeTracker.Droid.MainActivity, CoffeeTracker.Android", MainActivity.class, __md_methods);
	}


	public MainActivity ()
	{
		super ();
		if (getClass () == MainActivity.class)
			mono.android.TypeManager.Activate ("CoffeeTracker.Droid.MainActivity, CoffeeTracker.Android", "", this, new java.lang.Object[] {  });
	}


	public void onMAMCreate (android.os.Bundle p0)
	{
		n_onMAMCreate (p0);
	}

	private native void n_onMAMCreate (android.os.Bundle p0);


	public void onMAMActivityResult (int p0, int p1, android.content.Intent p2)
	{
		n_onMAMActivityResult (p0, p1, p2);
	}

	private native void n_onMAMActivityResult (int p0, int p1, android.content.Intent p2);

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
