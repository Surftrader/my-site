<#import "parts/common.ftlh" as c>
<#import "/spring.ftl" as spring>

<@c.pageCommon>
<div class="container my-3" align="center">
    <h1 style="color: white"><@spring.message "label.about"/></h1>
</div>
<div class="container my-3">
<div class="row">
    <div class="col-lg-4 col-md-12 mb-4">
        <img src="/static/img/ava.jpg" class="img-thumbnail" alt="">
    </div>
    <div class="col-lg-8 col-md-12 mb-8">
        <h1 style="color: white"><@spring.message "label.myname"/></h1>
        <hr/>
        <h4 align="justify" style="color: navy; text-indent: 60px">
            <div>
                <@spring.message "label.programming"/> <a href="mailto:poseal.dev@gmail.com?subject=<@spring.message "subject.project"/>" style="color:blue"><@spring.message "label.link"/></a>.
            </div>
        </h4>
    </div>
</div>
</div>
</@c.pageCommon>
