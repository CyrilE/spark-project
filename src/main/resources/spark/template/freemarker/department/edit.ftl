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
				<a class="yui-bc_link" href="">Редактировать департамент</a>
			</li>
		</ul>
	</div>
	<div class="yui-row"></div>
	<div class="yui-block yui-block--blue">
		<div class="yui-block_header">Редактировать департамент - ${ department.name }</div>
		<div class="yui-block_body">
			<div style="padding: 20px;">
				<form method="GET" action="/departments/${ department.id }/update/">
					<input name="name" id="input" type="text" class="yui-input-control" placeholder="Название" value="${ department.name }"/>
					<button class="yui-btn yui-btn--green" type="submit">Редактировать</button>
				</form>
			</div>
		</div>
	</div>

</@layout.mainLayout>