<#-- 可复用模块 -->

<#-- 菜单 -->
<#macro menus menuList>
<div id="sidebar-nav" class="sidebar">
    <div class="sidebar-scroll">
        <nav>
            <ul class="nav">
                <#list menuList as menu>
                    <li><a href="${menu.href}" <#if menu.active == true> class="active" </#if>><i
                            class="lnr ${menu.icon}"></i><span>${menu.name}</span></a>
                        <#if (menu.subMenus?size >0) >
                            <div id="subPages"
                                <#if menu.in == true>
                                 class="collapse in"
                                <#else>
                                 class="collapse"
                                </#if>>
                                <ul class="nav">
                                    <#list menu.subMenus as subMenu>
                                        <li><a href=${subMenu.href}class=${subMenu.icon}>${subMenu.name}</a></li>
                                    </#list>
                                </ul>
                            </div>
                        </#if>
                    </li>
                </#list>
            </ul>
        </nav>
    </div>
</div>
</#macro>

<#-- 头 -->
<#macro header>

</#macro>

<#-- 尾 -->
<#macro fotter>

</#macro>