<#import "parts/common.ftlh" as c>
<#import "parts/card.ftlh" as card>
<#import "/spring.ftl" as spring>

<@c.QRCode>
    <div class="row">
        <div class="col" align="center">
            <h1 style="color: white"><@spring.message "label.QR"/></h1>
        </div>
    </div>
<hr />
    <div class="container">
        <div class="row">
            <div class="col" align="center">
                <p><h3><@spring.message "label.qrcode.download"/></h3></p>
                <form class="form-group" method="get" action="/qr_image/generator">
                    <div class="row">
                        <div class="col" style="padding-left: 35px">
                            <input type="submit" class="btn btn-primary" value="<@spring.message "button.download"/>"/>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</@c.QRCode>
