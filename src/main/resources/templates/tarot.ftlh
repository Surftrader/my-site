<#import "parts/common.ftlh" as c>
<#import "parts/card.ftlh" as card>

<@c.pageTarot>

    <div class="row">
        <div class="col" align="center">
            <h1 style="color: white">Расчет по дате рождения методом психологического портрета на основе архетипов Таро.</h1>
        </div>
    </div>

    <div class="row my-3">
        <div class="col-sm">
            <form class="form-group" method="post">
                <div class="form-group row">
                    <div class="col-4">
                    </div>
                    <div class="col-3">
                        <input class="form-control" type="date" id="birthday" name="birthday">
                    </div>
                    <div class="col-3">
                        <input type="submit" class="btn btn-primary" value="Рассчитать"/>
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
        <h4><a href="mailto:poddubkas@gmail.com" style="color:wheat">Консультация</a></h4>
    </div>
<hr/>

    <div class="d-flex justify-content-center">
            <div class="col">
                <p>П1:</p>
                <@card.card pos1 />
            </div>
            <div class="col">
                <p>П2:</p>
                <@card.card pos2 />
            </div>
            <div class="col">
                <p>П3:</p>
                <@card.card pos3 />
            </div>
        </div>
        <hr />
    <div class="d-flex justify-content-center">
            <div class="col">
                <p>П4:</p>
                <@card.card pos4 />
            </div>
            <div class="col">
                <p>П5:</p>
                <@card.card pos5 />
            </div>
        </div>
        <hr />
    <div class="d-flex justify-content-center">
            <div class="col">
            </div>
            <div class="col">
                <p>П6:</p>
                <@card.card pos6 />
            </div>
            <div class="col">
            </div>
        </div>
        <hr />
        <hr />
    <div class="d-flex justify-content-center">
            <div class="col">
                <p>Энергия месяца:</p>
                <@card.card monthEnergy />
            </div>
            <div class="col">
                <p>Энергия года:</p>
                <@card.card yearEnergy />
            </div>
            <div class="col">
                <p>Фон месяца:</p>
                <@card.card monthBackground />
            </div>
        </div>
        <hr />
    <div class="d-flex justify-content-center">
            <div class="col">
                <p>Энергия дня с 00:00 до 12:00:</p>
                <@card.card dayEnergy1 />
            </div>
            <div class="col">
                <p>Энергия дня с 12:00 до 18:00:</p>
                <@card.card dayEnergy2 />
            </div>
            <div class="col">
                <p>Энергия дня с 18:00 до 00:00:</p>
                <@card.card dayEnergy3 />
            </div>
        </div>
        <hr />
    </#if>
</div>

</@c.pageTarot>
