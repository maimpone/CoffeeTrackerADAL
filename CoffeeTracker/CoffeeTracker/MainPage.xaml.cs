using CoffeeTracker.ADALForms;
using Microsoft.IdentityModel.Clients.ActiveDirectory;
using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace CoffeeTracker
{
    public partial class MainPage : ContentPage
    {
        public static string clientId = "d0be1e04-ce32-4ee9-be6c-1654e7f8061c";
        //public static string tenant = "foobar88.onmicrosoft.com";
        //public static string authority = String.Format("https://login.microsoftonline.com/{0}", tenant);
        public static string authority = "https://login.windows.net/common";
        public static string returnUri = "http://CoffeeTracker";
        const string graphResourceUri = "https://graph.windows.net";
        private AuthenticationResult authResult = null;

        public MainPage()
        {
            InitializeComponent();

        }


        async private void Button_Clicked(object sender, EventArgs e)
        {
            var auth = DependencyService.Get<IAuthenticator>();
            var data = await auth.Authenticate(authority, graphResourceUri, clientId, returnUri);
            var userName = data.UserInfo.GivenName + " " + data.UserInfo.FamilyName;
            await DisplayAlert("Token Granted", userName, "Ok", "Cancel");

            // Each ContentPage has a Navigation property of type INavigation
            // Pass a reference to the target page. In this case, MainPage is where the login is, HomePage is where users go after they login
            // Also, since this is an Async method, we need to add an 'await' keyword before the method call, and add the identifier 'async' to this metho'd signature
            //await Navigation.PushAsync(new HomePage());

            // You can give an alert multiple args. In this case, the args are ("Title", "Message", "Button")
            // DisplayAlert("LogIn", "Log In not yet implemented", "Ok");
        }


    }
}
