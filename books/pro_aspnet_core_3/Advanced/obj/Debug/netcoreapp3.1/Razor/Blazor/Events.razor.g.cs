#pragma checksum "C:\Users\jankoer\source\repos\_Study\Pro_ASPNET_Core_3\Advanced\Blazor\Events.razor" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "08480906ff0132001cf7420099eea11eecca4f63"
// <auto-generated/>
#pragma warning disable 1591
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
    public partial class Events : Microsoft.AspNetCore.Components.ComponentBase
    {
        #pragma warning disable 1998
        protected override void BuildRenderTree(Microsoft.AspNetCore.Components.Rendering.RenderTreeBuilder __builder)
        {
#nullable restore
#line 1 "C:\Users\jankoer\source\repos\_Study\Pro_ASPNET_Core_3\Advanced\Blazor\Events.razor"
 for (int i = 0; i < ElementCount; i++)
{
    int local = i;

#line default
#line hidden
#nullable disable
            __builder.AddContent(0, "    ");
            __builder.OpenElement(1, "div");
            __builder.AddAttribute(2, "class", "m-2 p-2 border");
            __builder.AddMarkupContent(3, "\r\n        ");
            __builder.OpenElement(4, "button");
            __builder.AddAttribute(5, "class", "btn btn-primary");
            __builder.AddAttribute(6, "onclick", Microsoft.AspNetCore.Components.EventCallback.Factory.Create<Microsoft.AspNetCore.Components.Web.MouseEventArgs>(this, 
#nullable restore
#line 5 "C:\Users\jankoer\source\repos\_Study\Pro_ASPNET_Core_3\Advanced\Blazor\Events.razor"
                                                    () => IncrementCounter(local)

#line default
#line hidden
#nullable disable
            ));
            __builder.AddMarkupContent(7, "\r\n            Increment Counter #");
            __builder.AddContent(8, 
#nullable restore
#line 6 "C:\Users\jankoer\source\repos\_Study\Pro_ASPNET_Core_3\Advanced\Blazor\Events.razor"
                                 i + 1

#line default
#line hidden
#nullable disable
            );
            __builder.AddMarkupContent(9, "\r\n        ");
            __builder.CloseElement();
            __builder.AddMarkupContent(10, "\r\n        ");
            __builder.OpenElement(11, "span");
            __builder.AddAttribute(12, "class", "p-2");
            __builder.AddContent(13, "Counter Value: ");
            __builder.AddContent(14, 
#nullable restore
#line 8 "C:\Users\jankoer\source\repos\_Study\Pro_ASPNET_Core_3\Advanced\Blazor\Events.razor"
                                          GetCounter(i)

#line default
#line hidden
#nullable disable
            );
            __builder.CloseElement();
            __builder.AddMarkupContent(15, "\r\n    ");
            __builder.CloseElement();
            __builder.AddMarkupContent(16, "\r\n");
#nullable restore
#line 10 "C:\Users\jankoer\source\repos\_Study\Pro_ASPNET_Core_3\Advanced\Blazor\Events.razor"
}

#line default
#line hidden
#nullable disable
        }
        #pragma warning restore 1998
#nullable restore
#line 11 "C:\Users\jankoer\source\repos\_Study\Pro_ASPNET_Core_3\Advanced\Blazor\Events.razor"
       
    public int ElementCount { get; set; } = 4;
    public Dictionary<int, int> Counters { get; } = new Dictionary<int, int>();
    public int GetCounter(int index) =>
        Counters.ContainsKey(index) ? Counters[index] : 0;
    public void IncrementCounter(int index) =>
        Counters[index] = GetCounter(index) + 1;

#line default
#line hidden
#nullable disable
    }
}
#pragma warning restore 1591