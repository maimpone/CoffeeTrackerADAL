package md51558244f76c53b6aeda52c8a337f2c37;


public class PageExtensions_EmbeddedFragment
	extends com.microsoft.intune.mam.client.app.MAMFragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMAMCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnMAMCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Forms.Platform.Android.PageExtensions+EmbeddedFragment, Xamarin.Forms.Platform.Android", PageExtensions_EmbeddedFragment.class, __md_methods);
	}


	public PageExtensions_EmbeddedFragment ()
	{
		super ();
		if (getClass () == PageExtensions_EmbeddedFragment.class)
			mono.android.TypeManager.Activate ("Xamarin.Forms.Platform.Android.PageExtensions+EmbeddedFragment, Xamarin.Forms.Platform.Android", "", this, new java.lang.Object[] {  });
	}


	public android.view.View onMAMCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2)
	{
		return n_onMAMCreateView (p0, p1, p2);
	}

	private native android.view.View n_onMAMCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2);

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
