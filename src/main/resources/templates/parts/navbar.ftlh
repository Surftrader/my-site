<#import "/spring.ftl" as spring>
<nav class="navbar navbar-expand-lg navbar-light bg-light" xmlns:spring="http://www.w3.org/1999/html">
    <a class="navbar-brand" href="/">MY PROJECT</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <div class="container-fluid">
            <ul class="nav navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="/"><@spring.message "label.main"/></span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/profile"><@spring.message "label.about"/></span></a>
                </li>
                <li class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown"><@spring.message "label.projects"/></a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="/tarot"><@spring.message "label.soul"/></a>
                        <a class="dropdown-item" href="/currency"><@spring.message "label.currency"/></a>
                        <a class="dropdown-item" href="#"><@spring.message "label.nutbalance"/></a>
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown"><@spring.message "label.language"/></a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="${springMacroRequestContext.requestUri}?lang=ru"><@spring.message "label.ru"/></a>
                        <a class="dropdown-item" href="${springMacroRequestContext.requestUri}?lang=en"><@spring.message "label.en"/></a>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</nav>
