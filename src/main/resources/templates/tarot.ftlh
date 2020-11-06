<#import "parts/common.ftlh" as c>
<#import "parts/card.ftlh" as card>

<@c.pageTarot>

    <div class="row">
        <div class="col" align="center">
            <h1 style="color: white">Расчет по дате рождения.</h1>
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
                <p>П17:</p>
                <@card.card pos17 />
            </div>
            <div class="col">
                <p>П18:</p>
                <@card.card pos18 />
            </div>
            <div class="col">
                <p>К32:</p>
                <@card.card posK32 />
            </div>
            <div class="col">
                <p>П19:</p>
                <@card.card pos19 />
            </div>
            <div class="col">
                <p>П20:</p>
                <@card.card pos20 />
            </div>
        </div>
        <hr />
    <div class="d-flex justify-content-center">
            <div class="col">
                <p>П16:</p>
                <@card.card pos16 />
            </div>
            <div class="col">
                <p>К31:</p>
                <@card.card posK31 />
            </div>
            <div class="col">
                <p>П15:</p>
                <@card.card pos15 />
            </div>
        </div>
        <hr />
    <div class="d-flex justify-content-center">
            <div class="col">
                <p>ПР1:</p>
                <@card.card posR1 />
            </div>
            <div class="col">
                <p>П9:</p>
                <@card.card pos9 />
            </div>
            <div class="col">
                <p>П10:</p>
                <@card.card pos10 />
            </div>
            <div class="col">
                <p>ПР3:</p>
                <@card.card posR3 />
            </div>
        </div>
        <hr />
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
                <p>П21:</p>
                <@card.card pos21 />
            </div>
            <div class="col">
                <p>П33:</p>
                <@card.card pos33 />
            </div>
            <div class="col">
                <p>П6:</p>
                <@card.card pos6 />
            </div>
            <div class="col">
                <p>П7а:</p>
                <@card.card pos7a />
            </div>
            <div class="col">
                <p>П7б:</p>
                <@card.card pos7b />
            </div>
        </div>
        <hr />
    <div class="d-flex justify-content-center">
            <div class="col">
                <p>П31:</p>
                <@card.card pos31 />
            </div>
            <div class="col">
                <p>П34:</p>
                <@card.card pos34 />
            </div>
            <div class="col">
                <p>П8:</p>
                <@card.card pos8 />
            </div>
            <div class="col">
                <p>П12:</p>
                <@card.card pos12 />
            </div>
            <div class="col">
                <p>П30:</p>
                <@card.card pos30 />
            </div>
        </div>
        <hr />
    <div class="d-flex justify-content-center">
            <div class="col">
                <p>П32:</p>
                <@card.card pos32 />
            </div>
            <div class="col">
                <p>П35:</p>
                <@card.card pos35 />
            </div>
            <div class="col">
                <p>A:</p>
                <@card.card posA />
            </div>
            <div class="col">
                <p>КО7:</p>
                <@card.card posK07 />
            </div>
            <div class="col">
                <p>К12:</p>
                <@card.card posK12 />
            </div>
        </div>
        <hr />
    <div class="d-flex justify-content-center">
            <div class="col">
                <p>B:</p>
                <@card.card posB />
            </div>
            <div class="col">
                <p>C:</p>
                <@card.card posC />
            </div>
        </div>
        <hr />
    <div class="d-flex justify-content-center">
            <div class="col">
                <p>D:</p>
                <@card.card posD />
            </div>
            <div class="col">
                <p>E:</p>
                <@card.card posE />
            </div>
            <div class="col">
                <p>F:</p>
                <@card.card posF />
            </div>
        </div>
        <hr />
    <div class="d-flex justify-content-center">
            <div class="col">
                <p>T1:</p>
                <@card.card posT1 />
            </div>
            <div class="col">
                <p>G1:</p>
                <@card.card posG1 />
            </div>
            <div class="col">
                <p>G2:</p>
                <@card.card posG2 />
            </div>
            <div class="col">
                <p>T2:</p>
                <@card.card posT2 />
            </div>
        </div>
        <hr />
    <div class="d-flex justify-content-center">
            <div class="col">
                <p>H:</p>
                <@card.card posH />
            </div>
        </div>
        <hr />
    <div class="d-flex justify-content-center">
            <div class="col">
                <p>I:</p>
                <@card.card posI />
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
