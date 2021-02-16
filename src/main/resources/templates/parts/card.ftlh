<#import "/spring.ftl" as spring>
<#macro card c>
    <p><@spring.message "${c.getName()}" /></p>
    <img src="/img/${c.getPath()}" class="img-fluid" alt="Responsive image" style="max-width: 150px; height: auto;">
</#macro>
