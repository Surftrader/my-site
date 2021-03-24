<#import "parts/common.ftlh" as c>
<#import "parts/card.ftlh" as card>
<#import "/spring.ftl" as spring>

<@c.pageTarot>
<div class="row">
    <div class="col" align="center">
        <h1 style="color: white"><@spring.message "label.abouttarrot"/></h1>
    </div>
</div>
<div class="row my-3">
    <div class="col-sm">
        <form class="form-group" method="post">
            <div class="form-group row">
                <div class="col-4">
                </div>
                <div class="col-3">
                    <input class="form-control" type="date" id="birthday" name="birthday" value="1974-10-25">
                </div>
                <div class="col-3">
                    <input type="submit" class="btn btn-primary" value="<@spring.message "button.calculate"/>"/>
                </div>
                <div class="col-2"></div>
            </div>
        </form>
    </div>
</div>
<hr />
<div align="center">
    <#if birthday??>
    <div align="center">
        <h4><a href="mailto:poddubkas@gmail.com?subject=<@spring.message "subject.tarot"/>" style="color:wheat"><@spring.message "label.consultation"/> ${birthday}</a></h4>
    </div>
    <hr/>
    <div class="d-flex justify-content-center">
        <div class="col">
            <p><@spring.message "label.p1"/>:</p>
            <@card.card pos1 />
        </div>
        <div class="col">
            <p><@spring.message "label.p2"/>:</p>
            <@card.card pos2 />
        </div>
        <div class="col">
            <p><@spring.message "label.p3"/>:</p>
            <@card.card pos3 />
        </div>
    </div>
    <hr />
    <div class="d-flex justify-content-center">
        <div class="col">
            <p><@spring.message "label.p4"/>:</p>
            <@card.card pos4 />
        </div>
        <div class="col">
            <p><@spring.message "label.p5"/>:</p>
            <@card.card pos5 />
        </div>
    </div>
    <hr />
    <div class="d-flex justify-content-center">
        <div class="col">
        </div>
        <div class="col">
            <p><@spring.message "label.p6"/>:</p>
            <@card.card pos6 />
        </div>
        <div class="col">
        </div>
    </div>
    <hr />
    <hr />
    <div class="d-flex justify-content-center">
        <div class="col">
            <p><@spring.message "label.monthenergy"/>:</p>
            <@card.card monthEnergy />
        </div>
        <div class="col">
            <p><@spring.message "label.yearenergy"/>:</p>
            <@card.card yearEnergy />
        </div>
        <div class="col">
            <p><@spring.message "label.monthbackground"/>:</p>
            <@card.card monthBackground />
        </div>
    </div>
    <hr />
    <div class="d-flex justify-content-center">
        <div class="col">
            <p><@spring.message "label.dayenergy1"/>:</p>
            <@card.card dayEnergy1 />
        </div>
        <div class="col">
            <p><@spring.message "label.dayenergy2"/>:</p>
            <@card.card dayEnergy2 />
        </div>
        <div class="col">
            <p><@spring.message "label.dayenergy3"/>:</p>
            <@card.card dayEnergy3 />
        </div>
    </div>
    <hr />
    </#if>
</div>
</@c.pageTarot>
