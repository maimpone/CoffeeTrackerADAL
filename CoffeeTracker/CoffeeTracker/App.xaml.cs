using System;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

[assembly: XamlCompilation(XamlCompilationOptions.Compile)]
namespace CoffeeTracker
{
    public partial class App : Application
    {
        public App()
        {
            InitializeComponent();

            // Need to wrap MainPage in a NavigationPage. This is a requirement for Navigation
            MainPage = new NavigationPage (new MainPage());

            //MainPage = new MainPage();
        }

        protected override void OnStart()
        {
            // Handle when your app starts
        }

        protected override void OnSleep()
        {
            // Handle when your app sleeps
        }

        protected override void OnResume()
        {
            // Handle when your app resumes
        }
    }
}
