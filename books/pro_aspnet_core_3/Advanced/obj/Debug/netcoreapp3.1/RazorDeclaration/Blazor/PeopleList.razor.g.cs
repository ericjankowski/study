#pragma checksum "C:\Users\jankoer\source\repos\_Study\Pro_ASPNET_Core_3\Advanced\Blazor\PeopleList.razor" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "c6388527679ee3208f0787fe0f75804e7b0a8eae"
// <auto-generated/>
#pragma warning disable 1591
#pragma warning disable 0414
#pragma warning disable 0649
#pragma warning disable 0169

namespace Advanced.Blazor
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
#nullable restore
#line 1 "C:\Users\jankoer\source\repos\_Study\Pro_ASPNET_Core_3\Advanced\_Imports.razor"
using Microsoft.AspNetCore.Components;

#line default
#line hidden
#nullable disable
#nullable restore
#line 2 "C:\Users\jankoer\source\repos\_Study\Pro_ASPNET_Core_3\Advanced\_Imports.razor"
using Microsoft.AspNetCore.Components.Forms;

#line default
#line hidden
#nullable disable
#nullable restore
#line 3 "C:\Users\jankoer\source\repos\_Study\Pro_ASPNET_Core_3\Advanced\_Imports.razor"
using Microsoft.AspNetCore.Components.Routing;

#line default
#line hidden
#nullable disable
#nullable restore
#line 4 "C:\Users\jankoer\source\repos\_Study\Pro_ASPNET_Core_3\Advanced\_Imports.razor"
using Microsoft.AspNetCore.Components.Web;

#line default
#line hidden
#nullable disable
#nullable restore
#line 5 "C:\Users\jankoer\source\repos\_Study\Pro_ASPNET_Core_3\Advanced\_Imports.razor"
using Microsoft.JSInterop;

#line default
#line hidden
#nullable disable
#nullable restore
#line 6 "C:\Users\jankoer\source\repos\_Study\Pro_ASPNET_Core_3\Advanced\_Imports.razor"
using Microsoft.EntityFrameworkCore;

#line default
#line hidden
#nullable disable
#nullable restore
#line 7 "C:\Users\jankoer\source\repos\_Study\Pro_ASPNET_Core_3\Advanced\_Imports.razor"
using Advanced.Models;

#line default
#line hidden
#nullable disable
    public partial class PeopleList : Microsoft.AspNetCore.Components.ComponentBase
    {
        #pragma warning disable 1998
        protected override void BuildRenderTree(Microsoft.AspNetCore.Components.Rendering.RenderTreeBuilder __builder)
        {
        }
        #pragma warning restore 1998
#nullable restore
#line 35 "C:\Users\jankoer\source\repos\_Study\Pro_ASPNET_Core_3\Advanced\Blazor\PeopleList.razor"
       
    [Inject]
    public DataContext Context { get; set; }
    public IEnumerable<Person> People =>
        Context.People.Include(p => p.Department).Include(p => p.Location);
    public IEnumerable<string> Cities => Context.Locations.Select(l => l.City);
    public string SelectedCity { get; set; }
    public string GetClass(string city) =>
        SelectedCity == city ? "bg-info text-white" : "";

#line default
#line hidden
#nullable disable
    }
}
#pragma warning restore 1591
