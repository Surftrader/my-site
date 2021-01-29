<#import "parts/common.ftlh" as c>

<@c.pageCurrency>

    <div class="row">
        <div class="col" align="center">
            <h1 style="color: white">Андроид приложение, позволяющее следить за актуальным курсом валют в городе Харьков.</h1>
        </div>
    </div>

    <hr />
<div class="container">
    <div class="row">
        <div class="col" align="center">
            <img src="/img/currencyAppImage.jpg" class="img-fluid" alt="Responsive image" style="max-width: 250px; height: auto;">
        </div>
        <div class="col">
            <h3><p>Приложение берёт данные с <a href="https://obmenka.kharkov.ua/" style="color:blue">этого сайта</a> и отображает в реальном времени.</p></h3>
            <form class="form-group" method="get" action="/currency/download">
                <div class="row">
                    <div class="col">
                        <input type="submit" class="btn btn-primary" value="Загрузить"/>
                    </div>
                </div>
            </form>
            <div class="column-overlay">
                <p>Если возникнут вопросы или предложения, пишите по <a href="mailto:poseal@gmail.com" style="color:blue">ссылке</a>.</p>
            </div>
        </div>
    </div>
    <hr />
</div>

</@c.pageCurrency>
