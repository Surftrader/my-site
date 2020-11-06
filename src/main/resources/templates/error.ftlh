<#import "parts/common.ftlh" as c>
<#import "parts/card.ftlh" as card>

<@c.pageTarot>
<#--<div class="container my-3" align="center">-->
    <div class="row">
        <div class="col" align="center">
            <#if errorMessage ?? >
                <h1 style="color: red">${errorMessage}</h1>
            <#else>
                <h1 style="color: red">Что то пошло не так. Попробуйте снова.</h1>
            </#if>
        </div>
    </div>
<#--</div>-->

</@c.pageTarot>
