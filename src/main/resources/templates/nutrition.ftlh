<#import "parts/common.ftlh" as c>
<#import "/spring.ftl" as spring>

<@c.pageCurrency>
    <div class="row">
        <div class="col" align="center">
            <h1 style="color: white"><@spring.message "label.aboutnutrition"/></h1>
        </div>
    </div>
    <hr />
<div class="container">
    <div class="row">
        <div class="col" align="center">
            <img src="/img/nutrition_balance1.jpg" class="img-fluid" alt="Responsive image" style="max-width: 250px; height: auto;">
        </div>
        <div class="col" align="center">
            <img src="/img/nutrition_balance3.jpg" class="img-fluid" alt="Responsive image" style="max-width: 250px; height: auto;">
        </div>
        <div class="col" align="center">
            <img src="/img/nutrition_balance4.jpg" class="img-fluid" alt="Responsive image" style="max-width: 250px; height: auto;">
        </div>
        <div class="col">
            <p><h3><@spring.message "label.aboutnutrition2"/></h3></p>
            <form class="form-group" method="get" action="/nutrition/download">
                <div class="row">
                    <div class="col">
                        <input type="submit" class="btn btn-primary" value="<@spring.message "button.download"/>"/>
                    </div>
                </div>
            </form>
            <div class="column-overlay">
                <p><@spring.message "label.ifquestion"/> <a href="mailto:poseal.dev@gmail.com?subject=<@spring.message "subject.app.nutrition"/>" style="color:blue"><@spring.message "label.link"/></a>.</p>
            </div>
        </div>
    </div>
    <hr />
</div>
</@c.pageCurrency>
