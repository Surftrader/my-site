<#import "parts/common.ftlh" as c>
<#import "parts/card.ftlh" as card>
<#import "/spring.ftl" as spring>

<@c.pageTarot>
    <div class="row">
        <div class="col" align="center">
            <#if errorMessage ?? >
                <h1 style="color: red">${errorMessage}</h1>
            <#else>
                <h1 style="color: red"><@spring.message "error.message" /></h1>
            </#if>
        </div>
    </div>
</@c.pageTarot>
