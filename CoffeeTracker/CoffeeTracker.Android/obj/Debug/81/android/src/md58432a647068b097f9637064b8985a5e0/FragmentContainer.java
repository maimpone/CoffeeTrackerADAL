package md58432a647068b097f9637064b8985a5e0;


public class FragmentContainer
	extends com.microsoft.intune.mam.client.support.v4.app.MAMFragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMAMCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnMAMCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\n" +
			"n_onMAMDestroyView:()V:GetOnMAMDestroyViewHandler\n" +
			"n_onHiddenChanged:(Z)V:GetOnHiddenChanged_ZHandler\n" +
			"n_onMAMPause:()V:GetOnMAMPauseHandler\n" +
			"n_onMAMResume:()V:GetOnMAMResumeHandler\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Forms.Platform.Android.AppCompat.FragmentContainer, Xamarin.Forms.Platform.Android", FragmentContainer.class, __md_methods);
	}


	public FragmentContainer ()
	{
		super ();
		if (getClass () == FragmentContainer.class)
			mono.android.TypeManager.Activate ("Xamarin.Forms.Platform.Android.AppCompat.FragmentContainer, Xamarin.Forms.Platform.Android", "", this, new java.lang.Object[] {  });
	}


	public android.view.View onMAMCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2)
	{
		return n_onMAMCreateView (p0, p1, p2);
	}

	private native android.view.View n_onMAMCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2);


	public void onMAMDestroyView ()
	{
		n_onMAMDestroyView ();
	}

	private native void n_onMAMDestroyView ();


	public void onHiddenChanged (boolean p0)
	{
		n_onHiddenChanged (p0);
	}

	private native void n_onHiddenChanged (boolean p0);


	public void onMAMPause ()
	{
		n_onMAMPause ();
	}

	private native void n_onMAMPause ();


	public void onMAMResume ()
	{
		n_onMAMResume ();
	}

	private native void n_onMAMResume ();

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
