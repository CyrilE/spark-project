<#import "../layout.ftl" as layout>
<@layout.mainLayout "Департаменты">
    <div class="yui-bc">
        <ul class="yui-bc_items">
            <li class="yui-bc_item">
                <a class="yui-bc_link" href="/">Главная</a> <span class="yui-bc_divide">&rarr;</span>
            </li>
            <li class="yui-bc_item bc_item--active">
                <a class="yui-bc_link" href="">Департаменты</a>
            </li>
        </ul>
    </div>
    <div class="yui-row"></div>
    <div class="yui-block yui-block--blue">
        <div class="yui-block_header">Департаменты</div>
        <div class="yui-block_body">
            <div style="padding-left: 20px;">

                <#list departments as department>
                    <p><a href="/departments/${department.getId()}/">${department.getName()}</a></p>
                </#list>

                <a href="/departments/create/" class="yui-btn yui-btn--green">Добавить</a>
            </div>
        </div>
    </div>
</@layout.mainLayout>