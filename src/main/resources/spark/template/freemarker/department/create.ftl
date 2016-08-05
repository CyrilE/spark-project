<#import "../layout.ftl" as layout>
<@layout.mainLayout "Департамент">

	<div class="yui-bc">
		<ul class="yui-bc_items">
			<li class="yui-bc_item">
				<a class="yui-bc_link" href="/">Главная</a> <span class="yui-bc_divide">&rarr;</span>
			</li>
			<li class="yui-bc_item">
				<a class="yui-bc_link" href="/departments/">Департаменты</a> <span class="yui-bc_divide">&rarr;</span>
			</li>
			<li class="yui-bc_item bc_item--active">
				<a class="yui-bc_link" href="">Создать департамент</a>
			</li>
		</ul>
	</div>
	<div class="yui-row"></div>
	<div class="yui-block yui-block--blue">
		<div class="yui-block_header">Создать департамент</div>
		<div class="yui-block_body">
			<div style="padding: 20px;">
				<form method="POST" action="/departments/">
					<input name="name" id="input" type="text" class="yui-input-control" placeholder="Название"/>
					<button class="yui-btn yui-btn--green yui-btn--icon" type="submit"><span class="yui-icon-add"></span> Создать</button>
				</form>
			</div>
		</div>
	</div>

</@layout.mainLayout>