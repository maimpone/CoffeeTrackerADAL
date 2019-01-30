using System;
using Android.App;
using Android.Content.PM;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;
using Android.Content;
using Microsoft.IdentityModel.Clients.ActiveDirectory;

using Microsoft.Intune.Mam;
using Microsoft.Intune.Mam.Policy.AppConfig;
using Microsoft.Intune;
using Microsoft.Intune.Mam.Client.App;
using Microsoft.Intune.Mam.Client.Identity;
using Microsoft.Intune.Mam.Policy;

namespace CoffeeTracker.Droid
{
    [Activity(Label = "CoffeeTracker", Icon = "@mipmap/icon", Theme = "@style/MainTheme", MainLauncher = true, ConfigurationChanges = ConfigChanges.ScreenSize | ConfigChanges.Orientation)]
    public class MainActivity : global::Xamarin.Forms.Platform.Android.FormsAppCompatActivity
    {
        //protected override void OnCreate(Bundle savedInstanceState)
        protected override void OnMAMCreate(Bundle savedInstanceState)
        {
            TabLayoutResource = Resource.Layout.Tabbar;
            ToolbarResource = Resource.Layout.Toolbar;

            base.OnMAMCreate(savedInstanceState);

            global::Xamarin.Forms.Forms.Init(this, savedInstanceState);
            LoadApplication(new App());
        }

        // Used for ADAL authentication. Forwards any authentication redirects back to the appropriate method. There's an ADAL helper method for this
        protected override void OnMAMActivityResult(int requestCode, Result resultCode, Intent data)
        {
            base.OnActivityResult(requestCode, resultCode, data);
            AuthenticationAgentContinuationHelper.SetAuthenticationAgentContinuationEventArgs(requestCode, resultCode, data);
        }
    }
}