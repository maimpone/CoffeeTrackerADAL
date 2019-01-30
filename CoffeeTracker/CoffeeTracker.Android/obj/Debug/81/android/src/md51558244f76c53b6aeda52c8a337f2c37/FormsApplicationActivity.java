package md51558244f76c53b6aeda52c8a337f2c37;


public class FormsApplicationActivity
	extends com.microsoft.intune.mam.client.app.MAMActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBackPressed:()V:GetOnBackPressedHandler\n" +
			"n_onConfigurationChanged:(Landroid/content/res/Configuration;)V:GetOnConfigurationChanged_Landroid_content_res_Configuration_Handler\n" +
			"n_onOptionsItemSelected:(Landroid/view/MenuItem;)Z:GetOnOptionsItemSelected_Landroid_view_MenuItem_Handler\n" +
			"n_onMAMPrepareOptionsMenu:(Landroid/view/Menu;)Z:GetOnMAMPrepareOptionsMenu_Landroid_view_Menu_Handler\n" +
			"n_onMAMActivityResult:(IILandroid/content/Intent;)V:GetOnMAMActivityResult_IILandroid_content_Intent_Handler\n" +
			"n_onMAMCreate:(Landroid/os/Bundle;)V:GetOnMAMCreate_Landroid_os_Bundle_Handler\n" +
			"n_onMAMDestroy:()V:GetOnMAMDestroyHandler\n" +
			"n_onMAMPause:()V:GetOnMAMPauseHandler\n" +
			"n_onRestart:()V:GetOnRestartHandler\n" +
			"n_onMAMResume:()V:GetOnMAMResumeHandler\n" +
			"n_onStart:()V:GetOnStartHandler\n" +
			"n_onStop:()V:GetOnStopHandler\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Forms.Platform.Android.FormsApplicationActivity, Xamarin.Forms.Platform.Android", FormsApplicationActivity.class, __md_methods);
	}


	public FormsApplicationActivity ()
	{
		super ();
		if (getClass () == FormsApplicationActivity.class)
			mono.android.TypeManager.Activate ("Xamarin.Forms.Platform.Android.FormsApplicationActivity, Xamarin.Forms.Platform.Android", "", this, new java.lang.Object[] {  });
	}


	public void onBackPressed ()
	{
		n_onBackPressed ();
	}

	private native void n_onBackPressed ();


	public void onConfigurationChanged (android.content.res.Configuration p0)
	{
		n_onConfigurationChanged (p0);
	}

	private native void n_onConfigurationChanged (android.content.res.Configuration p0);


	public boolean onOptionsItemSelected (android.view.MenuItem p0)
	{
		return n_onOptionsItemSelected (p0);
	}

	private native boolean n_onOptionsItemSelected (android.view.MenuItem p0);


	public boolean onMAMPrepareOptionsMenu (android.view.Menu p0)
	{
		return n_onMAMPrepareOptionsMenu (p0);
	}

	private native boolean n_onMAMPrepareOptionsMenu (android.view.Menu p0);


	public void onMAMActivityResult (int p0, int p1, android.content.Intent p2)
	{
		n_onMAMActivityResult (p0, p1, p2);
	}

	private native void n_onMAMActivityResult (int p0, int p1, android.content.Intent p2);


	public void onMAMCreate (android.os.Bundle p0)
	{
		n_onMAMCreate (p0);
	}

	private native void n_onMAMCreate (android.os.Bundle p0);


	public void onMAMDestroy ()
	{
		n_onMAMDestroy ();
	}

	private native void n_onMAMDestroy ();


	public void onMAMPause ()
	{
		n_onMAMPause ();
	}

	private native void n_onMAMPause ();


	public void onRestart ()
	{
		n_onRestart ();
	}

	private native void n_onRestart ();


	public void onMAMResume ()
	{
		n_onMAMResume ();
	}

	private native void n_onMAMResume ();


	public void onStart ()
	{
		n_onStart ();
	}

	private native void n_onStart ();


	public void onStop ()
	{
		n_onStop ();
	}

	private native void n_onStop ();

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
