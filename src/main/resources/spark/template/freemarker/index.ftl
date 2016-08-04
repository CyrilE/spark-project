<#import "layout.ftl" as layout>
<@layout.mainLayout "Главная">

	<div class="yui-bc">
		<ul class="yui-bc_items">
			<li class="yui-bc_item bc_item--active">
				<a class="yui-bc_link" href="/">Главная</a>
			</li>
		</ul>
	</div>
	<div class="yui-row"></div>
	<div class="yui-block yui-block--green">
		<div class="yui-block_header">Рога и Копыта</div>
		<div class="yui-block_body">
			<div style="padding-left: 20px;">
				<h1><a href="/departments/">Департаменты</a></h1>
				<h1><a href="/employees/">Сотрудники</a></h1>
				<h1><a href="/reports/">Отчеты</a></h1>
			</div>
		</div>
	</div>

</@layout.mainLayout>