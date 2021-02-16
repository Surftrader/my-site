<#import "parts/common.ftlh" as c>
<#import "/spring.ftl" as spring>

<@c.pageCurrency>

    <div class="row">
        <div class="col" align="center">
            <h1 style="color: white"><@spring.message "label.aboutcurrency"/></h1>
        </div>
    </div>

    <hr />
<div class="container">
    <div class="row">
        <div class="col" align="center">
            <img src="/img/currencyAppImage.jpg" class="img-fluid" alt="Responsive image" style="max-width: 250px; height: auto;">
        </div>
        <div class="col">
            <h3><p><@spring.message "label.currencyfrom1"/> <a href="https://obmenka.kharkov.ua/" style="color:blue"><@spring.message "label.thissite"/></a> <@spring.message "label.currencyfrom2"/></p></h3>
            <form class="form-group" method="get" action="/currency/download">
                <div class="row">
                    <div class="col">
                        <input type="submit" class="btn btn-primary" value="<@spring.message "button.download"/>"/>
                    </div>
                </div>
            </form>
            <div class="column-overlay">
                <p><@spring.message "label.ifquestion"/> <a href="mailto:poseal@gmail.com" style="color:blue"><@spring.message "label.link"/></a>.</p>
            </div>
        </div>
    </div>
    <hr />
</div>

</@c.pageCurrency>
